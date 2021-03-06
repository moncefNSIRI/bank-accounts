package com.bmarkets.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmarkets.entities.Client;



 @Repository
 public interface ClientRepository extends JpaRepository<Client, Long>{
	 
	 public Client findByClientId(long clientId);
	  
}