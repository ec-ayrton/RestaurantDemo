package com.ayrton.pratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayrton.pratica.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long>{

}
