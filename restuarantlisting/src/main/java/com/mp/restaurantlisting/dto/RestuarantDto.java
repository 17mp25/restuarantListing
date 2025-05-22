package com.mp.restaurantlisting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestuarantDto {

	private int id;
	private String name;
	private String address;
	private String city;
	private String restuarantDescription;
}
