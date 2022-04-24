package com.springapi.springapi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.springapi.entities.Api;
import com.springapi.springapi.services.restApi;

@RestController
public class myController {

	@Autowired
	private restApi apis;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@GetMapping("/load")
	public List<Api> loadApi(){
		return this.apis.loadapi();
	}
	
	@GetMapping("/load/{Id}")
	public Api getApi(@PathVariable UUID Id) {
		return this.apis.getapi(Id);
	}
	
	@PostMapping("/load")
	public String addApi(@RequestBody Api ap) {
		
		return this.apis.addApi(ap);
	}
	
	@DeleteMapping("/load/{Id}")
	public String delApi(@PathVariable UUID Id) {
		return this.apis.delApi(Id);
	}

	@PutMapping("load/{Id}")
	public Api changeApi(@PathVariable UUID Id,@RequestBody Api api) {
		return this.apis.changeApi(Id, api);
	}
}
