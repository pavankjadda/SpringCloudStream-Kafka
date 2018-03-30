package com.springcloudstreamkafka;

public class Project
{
	private String projectName;
	
	private String projectLocation;
	

	private Address projectAddress;
	
	

	public Address getProjectAddress()
	{
		return projectAddress;
	}

	public void setProjectAddress(Address projectAddress)
	{
		this.projectAddress = projectAddress;
	}

	public String getProjectName()
	{
		return projectName;
	}

	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}

	public String getProjectLocation()
	{
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation)
	{
		this.projectLocation = projectLocation;
	}
	
	

}
