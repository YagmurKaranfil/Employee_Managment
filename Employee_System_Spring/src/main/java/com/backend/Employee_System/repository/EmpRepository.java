package com.backend.Employee_System.repository;

import com.backend.Employee_System.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository <Emp, Integer>{
}
