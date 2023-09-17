package com.mpjmario.h2springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
