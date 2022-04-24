package com.springapi.springapi.services;

import java.util.List;
import java.util.UUID;

import com.springapi.springapi.entities.Api;

public interface restApi {

	public List<Api> loadapi();

	public Api getapi(UUID Id);

	public String addApi(Api ap);

	public String delApi(UUID id);

	public Api changeApi(UUID id, Api api);
	
	
}
