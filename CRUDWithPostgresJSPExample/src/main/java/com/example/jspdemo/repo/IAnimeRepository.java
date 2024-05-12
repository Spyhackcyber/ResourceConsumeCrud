package com.example.jspdemo.repo;

import com.example.jspdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimeRepository extends JpaRepository<Employee, Long> {
}
