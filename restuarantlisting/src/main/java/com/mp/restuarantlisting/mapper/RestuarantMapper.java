package com.mp.restuarantlisting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mp.restuarantlisting.dto.RestuarantDto;
import com.mp.restuarantlisting.entity.Restuarant;

@Mapper
public interface RestuarantMapper {
	RestuarantMapper INSTANCE = Mappers.getMapper(RestuarantMapper.class);

	Restuarant maptoRestuarantDtoToRestuarant(RestuarantDto restuarantDto);

	RestuarantDto mapRestuarantToRestuarantDto(Restuarant restuarant);
}
