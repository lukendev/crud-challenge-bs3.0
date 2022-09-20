package com.crudchallenge.crudchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudchallenge.crudchallenge.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
