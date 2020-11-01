package com.example.demo.karachi;

import org.springframework.data.jpa.repository.JpaRepository;


public interface KarachiPortRepos extends JpaRepository<KarachiPort, Integer> {
	 public KarachiPort findById(int  id);

}
