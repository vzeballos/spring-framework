package com.cydeo.bootstrap;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    private final DepartmentRepository departmentRepository;

    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository,
    EmployeeRepository employeeRepository){
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception{

        System.out.println("-----------------Region Start-----------------");
        //how will I access to method that I just built?
        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry: " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining: " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry: " + regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("findTop2ByCountry: " + regionRepository.findTop2ByCountry("Canada"));
        System.out.println("-----------------Region End-----------------");

        System.out.println("");

        System.out.println("-----------------Department Start-----------------");
        System.out.println("findByDepartment: " + departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivisionIs: " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("findDistinctTop3ByDivisionContains: " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("-----------------Department End-----------------");

        System.out.println("");

        System.out.println("-----------------Employee Start-----------------");
        System.out.println("findByDepartment: " + departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivisionIs: " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("findDistinctTop3ByDivisionContains: " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("-----------------Employee End-----------------");
    }
}
