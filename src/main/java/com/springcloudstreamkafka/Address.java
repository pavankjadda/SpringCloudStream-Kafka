package com.springcloudstreamkafka;


public class Address
{

	
	    private Long id;

	
	    private String streetName;

	
	    private String apartmentOrHouseNumber;

	
	    private String city;

	
	    private Long zipcode;

	
	    private String state;

	
	    private String country;

	    
	    
	    public Address() {
			super();
			id=0l;
		}
	    
	    
		public Address(Long id, String streetName, String apartmentOrHouseNumber, String city, Long zipcode,
				String state, String country)
		{
			super();
			this.id = id;
			this.streetName = streetName;
			this.apartmentOrHouseNumber = apartmentOrHouseNumber;
			this.city = city;
			this.zipcode = zipcode;
			this.state = state;
			this.country = country;
		}

		public Long getId()
		{
			return id;
		}

		public void setId(Long id)
		{
			this.id = id;
		}

		public String getStreetName()
		{
			return streetName;
		}

		public void setStreetName(String streetName)
		{
			this.streetName = streetName;
		}

		public String getApartmentOrHouseNumber()
		{
			return apartmentOrHouseNumber;
		}

		public void setApartmentOrHouseNumber(String apartmentOrHouseNumber)
		{
			this.apartmentOrHouseNumber = apartmentOrHouseNumber;
		}

		public String getCity()
		{
			return city;
		}

		public void setCity(String city)
		{
			this.city = city;
		}

		public Long getZipcode()
		{
			return zipcode;
		}

		public void setZipcode(Long zipcode)
		{
			this.zipcode = zipcode;
		}

		public String getState()
		{
			return state;
		}

		public void setState(String state)
		{
			this.state = state;
		}

		public String getCountry()
		{
			return country;
		}

		public void setCountry(String country)
		{
			this.country = country;
		}
	    
	    
	    
	    
}
