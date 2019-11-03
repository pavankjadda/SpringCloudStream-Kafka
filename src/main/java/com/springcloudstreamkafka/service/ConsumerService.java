package com.springcloudstreamkafka.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springcloudstreamkafka.model.Address;
import com.springcloudstreamkafka.model.Message;
import com.springcloudstreamkafka.model.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@EnableBinding(Sink.class)
public class ConsumerService
{
	private final Logger logger= LoggerFactory.getLogger(getClass());

	//Receive Project Object
	@StreamListener(target = Sink.INPUT, condition = "payload.messageType.toString()=='Project'")
	@Transactional
	public void consumeProject(String messageJson) throws IOException
	{
		Message<Project> message = new ObjectMapper().readValue(messageJson, new TypeReference<Message<Project>>()
		{
		});
		Project project = message.getPayload();

		logger.info("********************************  Project Message Received  ********************************  ");
		logger.info("Project Name: {}" , project.getProjectName());
		logger.info("Project Name: {}" ,project.getProjectAddress().getStreetName());
	}

	//Receive Address Object
	@StreamListener(target = Sink.INPUT, condition = "payload.messageType.toString()=='Address'")
	@Transactional
	public void consumeAddress(String messageJson) throws IOException
	{
		Message<Address> message = new ObjectMapper().readValue(messageJson, new TypeReference<Message<Address>>()
		{
		});
		Address address = message.getPayload();

		logger.info("******************************** Address Message Received  ********************************  ");
		logger.info("Address Street: {}" , address.getStreetName());
		logger.info("Address City: {}" , address.getCity());
	}
}
