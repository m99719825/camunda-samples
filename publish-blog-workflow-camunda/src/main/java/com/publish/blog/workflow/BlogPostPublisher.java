package com.publish.blog.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlogPostPublisher implements JavaDelegate {
	
	private static final Logger logger = LoggerFactory.getLogger(BlogPostPublisher.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logger.info("Blog post published.....");
	}
}
