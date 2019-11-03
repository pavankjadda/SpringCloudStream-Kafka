package com.springcloudstreamkafka.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springcloudstreamkafka.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
public class MessageSender
{
	private final MessageChannel output;
	private final Logger logger= LoggerFactory.getLogger(MessageSender.class);

	public MessageSender(MessageChannel output)
	{
		this.output = output;
	}

	public void send(Message<?> m)
	{
		try
		{
			// avoid too much magic and transform ourselves
			ObjectMapper mapper = new ObjectMapper();
			String jsonMessage = mapper.writeValueAsString(m);

			// wrap into a proper message for the transport (Kafka/Rabbit) and send it
			output.send(MessageBuilder.withPayload(jsonMessage).build());
		}

		catch (Exception e)
		{
			logger.error("Could not transform and send message due to: {}",e.getLocalizedMessage());
		}
	}
}