package com.publish.blog.workflow;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableProcessApplication
public class PublishBlogWorkflowCamundaApplication {
	
	@Autowired
	private RuntimeService runtimeService;

	public static void main(String[] args) {
		SpringApplication.run(PublishBlogWorkflowCamundaApplication.class, args);
	}

	@EventListener
	private void processPostDeploy(PostDeployEvent postDeployEvent) {
		runtimeService.startProcessInstanceByKey("blog_post_submission_process");
	}
}
