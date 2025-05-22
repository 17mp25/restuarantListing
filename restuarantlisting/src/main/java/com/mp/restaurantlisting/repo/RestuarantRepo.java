package com.mp.restaurantlisting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mp.restaurantlisting.entity.Restuarant;

@Repository
public interface RestuarantRepo extends JpaRepository<Restuarant, Integer> {

}
