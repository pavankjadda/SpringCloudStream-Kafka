package com.springcloudstreamkafka.model;

import lombok.Data;

@Data
public class Address
{
	private Long id;
	private String streetName;
	private String apartmentOrHouseNumber;
	private String city;
	private Long zipCode;
	private String state;
	private String country;
}
