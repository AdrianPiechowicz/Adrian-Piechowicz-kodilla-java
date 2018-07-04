package com.kodilla.hibernate.manytomany.fasade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.repository.query.parser.Part.Type.LIKE;

@Service
@EnableJpaRepositories
public class Facade {
   /* private List<Employee> employees = new ArrayList<>();
    private List<Company> companies = new ArrayList<>();
    private String temp = "asd"; */
    @Autowired
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    private List<Company> companiesList = new ArrayList<>();
    private List<Employee> employeesList = new ArrayList<>();

    public Facade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Company> retrieveCompaniesByAnyGivenNameFragment(final String nameFragment) {
        companyDao.retrieveCompaniesWithNameLike(nameFragment);
        return companiesList;
    }

    public List<Employee> retrieveEmployeesByAnyGivenLastNameFragment(final String lastNameFragment) {
        employeeDao.retrieveEmployeesWithNameLike(lastNameFragment);
        return employeesList;
    }


}
