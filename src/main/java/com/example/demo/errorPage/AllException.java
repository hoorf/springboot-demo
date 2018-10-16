package com.example.demo.errorPage;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常
 */
@ControllerAdvice(basePackages = { "com.example.demo" })
public class AllException {

	@ResponseBody
	@ExceptionHandler({ Exception.class })
	public Map<String, Object> exceptionHandler(HttpServletRequest request, Exception e) {
		Map<String, Object> result = new HashMap<>();
		result.put("sss", "eee");
		result.put("e", e.getMessage());
		result.put("url", request.getRequestURI());

		return result;
	}
}
