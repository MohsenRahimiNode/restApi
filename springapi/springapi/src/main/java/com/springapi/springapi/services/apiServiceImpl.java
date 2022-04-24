package com.springapi.springapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.*;

import org.springframework.stereotype.Service;

import com.springapi.springapi.entities.Api;

@Service
public class apiServiceImpl implements restApi {

	List<Api> list;
	
	public apiServiceImpl() {
		 list = new ArrayList<>();
		 list.add(new Api(
				 "delhi","jaipur","chemicals",
				 "center",1,100,"null",UUID.randomUUID(),
				 "12-05-2021"
				 ));
	}
	@Override
	public List<Api> loadapi() {
		return list;
	}
	@Override
	public Api getapi(UUID Id) {
		Api ap = null;
		for(Api api:list) {
			
			if(api.getShipperId().equals(Id)) {
				ap =api;
				break;
			}
		}
	return ap;
	}
	@Override
	public String addApi(Api ap) {
		list.add(ap);
		return "loads details added successfully";
	}
	@Override
	public String delApi(UUID Id) {
		Api ap = null;
		for(Api api:list) {
			if(api.getShipperId().equals(Id)) {
				ap = api;
				list.remove(api);
				break;
			}
		}
	return "Api with shipper Id "+ap.getShipperId()+" deleted successfully !";

	}
	@Override
	public Api changeApi(UUID Id, Api api) {
		
		Api ap1 = null;
		int ind = 0;
		for(Api ap2:list) {
			if(ap2.getShipperId().equals(Id)) {
				ind = list.indexOf(ap2);
				list.set(ind, api);
				ap1 = ap2;
				break;
			}
		}		
		
		return api;
	}

}
