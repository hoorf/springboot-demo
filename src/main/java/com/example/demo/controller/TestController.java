package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestServiceImpl;

@RestController
public class TestController {

	@Resource
	TestServiceImpl testServiceImpl;

	@RequestMapping("/")
	@ResponseBody
	public String test() {

		int a = 1 / 0;
		return "vvvvvvvvvvvvvv";
	}

	@RequestMapping("/retry")
	@ResponseBody
	public String testRetry() {
		testServiceImpl.doTestRetry();
		return "duvvrdd";

	}
}
