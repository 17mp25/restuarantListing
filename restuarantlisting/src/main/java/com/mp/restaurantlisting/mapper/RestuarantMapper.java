package com.mp.restaurantlisting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mp.restaurantlisting.dto.RestuarantDto;
import com.mp.restaurantlisting.entity.Restuarant;

@Mapper
public interface RestuarantMapper {
	RestuarantMapper INSTANCE = Mappers.getMapper(RestuarantMapper.class);

	Restuarant maptoRestuarantDtoToRestuarant(RestuarantDto restuarantDto);

	RestuarantDto mapRestuarantToRestuarantDto(Restuarant restuarant);
}
