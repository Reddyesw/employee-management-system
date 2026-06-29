package com.ems.repository;

import com.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository gives us FREE:
// save(), findAll(), findById(), deleteById(), existsById(), count()

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
