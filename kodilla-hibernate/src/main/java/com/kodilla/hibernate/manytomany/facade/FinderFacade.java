package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinderFacade {
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;
    private static Logger LOGGER = LoggerFactory.getLogger(FinderFacade.class);

    @Autowired
    public FinderFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompany (String name) throws FindingNameException{
        LOGGER.info("Trying to find company name which contains: "+ name);
        List<Company> search = companyDao.retrieveCompaniesNamesStartingWithLetters("%"+name+"%");
        if(search.size()==0) {
            throw new FindingNameException(FindingNameException.ERR_FIND);
        }
        return search;
    }

    public List<Employee> findEmployee (String name) throws FindingNameException{
        LOGGER.info("Trying to find employee name which contains: "+ name);
        List<Employee> search = employeeDao.retrieveEmployees("%"+name+"%");
        if(search.size()==0) {
            throw new FindingNameException(FindingNameException.ERR_FIND);
        }
        return search;
    }
}
