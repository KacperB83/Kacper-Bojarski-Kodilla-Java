package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMatersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        employeeDao.save(johnSmith);
        int johnId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaId = lindaKovalsky.getId();

        List<Employee> employee = employeeDao.retrieveEmployees("Smith");
        List<Company> companiesNamesStartingWith = companyDao.retrieveCompaniesNamesStartingWithLetters("Sof%");
        employee.stream()
                .forEach(System.out::println);
        companiesNamesStartingWith.stream()
                .forEach(System.out::println);
        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMatersId);
        assertNotEquals(0, greyMatterId);

        assertEquals(1, employee.size());
        assertEquals(1, companiesNamesStartingWith.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMatersId);
            companyDao.deleteById(greyMatterId);

            employeeDao.deleteById(johnId);
            employeeDao.deleteById(stephId);
            employeeDao.deleteById(lindaId);

        } catch (Exception e) {
            //do nothing
        }
    }

}
