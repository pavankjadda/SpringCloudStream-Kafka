package com.springcloudstreamkafka.web;

import com.springcloudstreamkafka.model.Address;
import com.springcloudstreamkafka.model.Message;
import com.springcloudstreamkafka.model.Project;
import com.springcloudstreamkafka.service.MessageSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerService
{
	private final MessageSender messageSender;

	public ProducerService(MessageSender messageSender)
	{
		this.messageSender = messageSender;
	}

	@GetMapping("/api/project/{number}")
	public void getGreetings(@PathVariable int number)
	{
		Address address = new Address();
		address.setStreetName("3130 Fairview Park Dr");
		address.setApartmentOrHouseNumber("STE 350");
		address.setCity("Falls Church");
		address.setState("VA");
		address.setCountry("USA");

		Project project = new Project();
		project.setProjectLocation("Falls Church,VA");
		project.setProjectName("PostIT");
		project.setProjectAddress(address);

		//Send Address Object
		Message<Address> message = new Message<>("Address", address);
		messageSender.send(message);

		//Send Project Object
		Message<Project> message2 = new Message<>("Project", project);
		messageSender.send(message2);
	}
}
