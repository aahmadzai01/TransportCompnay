package com.example.demo.hairatan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HairatanPortRepos extends JpaRepository<HairatanPort, Integer> {

public HairatanPort findById(int id);
}
