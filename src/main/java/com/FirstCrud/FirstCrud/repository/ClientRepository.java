package com.FirstCrud.FirstCrud.repository;

import com.FirstCrud.FirstCrud.entity.Client;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {


}
