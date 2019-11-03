package com.springcloudstreamkafka.model;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class Message<T>
{
	private String messageType;
	private String id = UUID.randomUUID().toString(); // unique id of this
	private String traceId = UUID.randomUUID().toString(); // trace id, default:
	private String sender = "Admin";
	private Date timestamp = new Date();
	private String correlationId; // id which can be used for correlation later

	private T payload;

	public Message(String type, T payload)
	{
		this.messageType = type;
		this.payload = payload;
	}

	@Override
	public String toString()
	{
		return "Message [messageType=" + messageType + ", id=" + id + ", timestamp=" + timestamp + ", payload="
				+ payload + ", correlationId=" + correlationId + "]";
	}

}