package com.example.gestiongarage.DAO;

import com.example.gestiongarage.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByName(String name);
}
