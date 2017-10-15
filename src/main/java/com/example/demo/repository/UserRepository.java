package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Customer;
@Transactional
public interface UserRepository extends CrudRepository<Customer, Long>  {
}
