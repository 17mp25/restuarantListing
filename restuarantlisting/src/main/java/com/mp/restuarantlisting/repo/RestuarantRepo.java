package com.mp.restuarantlisting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mp.restuarantlisting.entity.Restuarant;

@Repository
public interface RestuarantRepo extends JpaRepository<Restuarant, Integer> {

}
