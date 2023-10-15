package com.devsuperior.cliente.repositories;

import com.devsuperior.cliente.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
