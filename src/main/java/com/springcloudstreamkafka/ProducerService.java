package com.springcloudstreamkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Source.class)
public class ProducerService
{
	@Autowired
	private Source source;

	@RequestMapping("/api/greetings/{count}")
	public void getGreetings(@PathVariable int count)
	{
		Project project=new Project();
		project.setProjectLocation("Falls Church,VA");
		project.setProjectName("PostIT");
		source.output().send(MessageBuilder.withPayload(project).build());
	}

}
