package net.fernandolopes.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.fernandolopes.financeiro.domain.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {

}
