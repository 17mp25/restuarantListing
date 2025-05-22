package com.mp.restaurantlisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mp.restaurantlisting.dto.RestuarantDto;
import com.mp.restaurantlisting.service.RestuarantService;

@RestController
@RequestMapping("/restuarant")
public class RestuarantController {

	@Autowired
	RestuarantService restuarantService;
	
	@GetMapping("/fetchAllRestuarants")
	public ResponseEntity<List<RestuarantDto>> fetchAllRestuarants() {
		List<RestuarantDto> allRestuarants = restuarantService.findAllRestuarants();
		return new ResponseEntity<>(allRestuarants, HttpStatus.OK);
	}
	
}
