package com.springcloudstreamkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerService
{

	@Autowired
	private MessageSender messageSender;
	
	@RequestMapping("/api/project/{number}")
	public void getGreetings(@PathVariable int number)
	{
		Address address=new Address();
		address.setStreetName("3130 Fairview Park Dr");
		address.setApartmentOrHouseNumber("STE 350");
		address.setCity("Falls Church");
		address.setState("VA");
		address.setCountry("USA");
		
		
		Project project=new Project();
		project.setProjectLocation("Falls Church,VA");
		project.setProjectName("PostIT");
		project.setProjectAddress(address);
		
		Message<Project> message = new Message<Project>("ProjectObject", project);
	    messageSender.send(message);
	}

}
