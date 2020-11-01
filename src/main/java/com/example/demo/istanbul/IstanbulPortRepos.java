package com.example.demo.istanbul;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IstanbulPortRepos extends JpaRepository<IstanbulPort, Integer> {
	
	public IstanbulPort findById(int id);

}
