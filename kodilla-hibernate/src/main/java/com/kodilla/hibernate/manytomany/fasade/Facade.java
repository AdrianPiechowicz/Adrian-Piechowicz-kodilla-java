package com.kodilla.hibernate.manytomany.fasade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.repository.query.parser.Part.Type.LIKE;

@Service
public class Facade {
   /* private List<Employee> employees = new ArrayList<>();
    private List<Company> companies = new ArrayList<>();
    private String temp = "asd"; */



    public List<Company> retrieveCompaniesWithNameLike(String string) {
        return retrieveCompaniesWithNameLike("%"+string+"%");
    }

    public List<Employee> retrieveEmployeesWithNameLike(String string) {
        return retrieveEmployeesWithNameLike("%"+string+"%");
    }
}
