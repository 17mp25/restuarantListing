package com.mp.restuarantlisting.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.restuarantlisting.dto.RestuarantDto;
import com.mp.restuarantlisting.entity.Restuarant;
import com.mp.restuarantlisting.mapper.RestuarantMapper;
import com.mp.restuarantlisting.repo.RestuarantRepo;

@Service
public class RestuarantService {

	@Autowired
	RestuarantRepo restuarantRepo;

	public List<RestuarantDto> findAllRestuarants() {
		List<Restuarant> restuarants = restuarantRepo.findAll();
		// map it to list of DTOs, since u cant directly the Entity
		List<RestuarantDto> restuarantsDtoList = restuarants.stream()
				.map(restuarant -> RestuarantMapper.INSTANCE.mapRestuarantToRestuarantDto(restuarant))
				.collect(Collectors.toList());
		return restuarantsDtoList;
	}
}
