package com.springcloudstreamkafka.model;

import lombok.Data;

@Data
public class Project
{
	private String projectName;
	private String projectLocation;
	private Address projectAddress;
}
