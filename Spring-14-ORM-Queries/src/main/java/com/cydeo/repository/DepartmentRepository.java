package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.lang.model.type.DeclaredType;
import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //Display all departments in the Furniture department
    List<Department> findByDepartment(String department);

    //Display all Departments in the Health division
    List<Department> findByDivisionIs(String division);

    List<Department> findByDivisionEquals(String division);

    //Display top 3 departments with division name includes 'Hea' without duplicate
    List<Department> findDistinctTop3ByDivisionContains(String pattern);

    @Query("SELECT d FROM Department d where d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);

    List<Department> retrieveDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(String pattern);

}
