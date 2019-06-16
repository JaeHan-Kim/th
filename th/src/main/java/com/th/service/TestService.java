package com.th.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//@Scheduled(cron="0/3 * * * * *")
	public void testMethod() {
		logger.info("test 스케쥴 시작");
	}
	
	@PostConstruct
	public void a() {
		logger.info("wwwww");
	}
}
