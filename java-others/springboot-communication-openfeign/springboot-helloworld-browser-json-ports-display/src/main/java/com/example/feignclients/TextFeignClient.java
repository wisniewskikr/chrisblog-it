package com.example.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.jsons.TextJson;

@FeignClient(name = "text-service", url = "localhost:9090")
public interface TextFeignClient {
	
	@GetMapping(value="/")
	public TextJson provideText();

}
