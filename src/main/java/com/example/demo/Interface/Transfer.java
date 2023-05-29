package com.example.demo.Interface;


import com.example.demo.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Transfer extends JpaRepository<Transaction , Integer> {
}
