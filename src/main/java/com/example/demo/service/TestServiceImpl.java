package com.example.demo.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {

	/**
	 * spring重试机制
	 */
	@Retryable(value = { RuntimeException.class }, maxAttempts = 5, backoff = @Backoff(delay = 5000, multiplier = 2))
	public void doTestRetry() {
		System.out.println("调用失败");
		throw new RuntimeException();

	}

}
