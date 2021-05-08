package br.com.fernando.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernando.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}