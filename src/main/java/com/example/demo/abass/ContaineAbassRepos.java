package com.example.demo.abass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaineAbassRepos extends JpaRepository<ContinerAbass, Integer> {

	public ContinerAbass findById(int id);
}
