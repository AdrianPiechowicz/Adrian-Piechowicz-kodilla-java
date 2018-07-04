package com.kodilla.hibernate.manytomany.fasade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories
public class FacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    Facade facade;
    private static final String lastname = "Smith";
    private static final String companyName = "Gre";

    @Test
    public void retrieveRetrieveCompaniesWithNameLike() {
        //Given

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");


        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        List<Company> theList = facade.retrieveCompaniesByAnyGivenNameFragment(companyName);
        List<Employee> employeesList = facade.retrieveEmployeesByAnyGivenLastNameFragment("Smith");

        //Then
        Assert.assertEquals(1, theList.size());
        Assert.assertEquals(1, employeesList.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachine);
        } catch (Exception e) {
            //do nothing
        }
    }



}