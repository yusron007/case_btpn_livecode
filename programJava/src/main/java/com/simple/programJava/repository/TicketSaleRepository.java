package com.simple.programJava.repository;

import com.simple.programJava.model.TicketSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketSaleRepository extends JpaRepository<TicketSale, Long> {
}
