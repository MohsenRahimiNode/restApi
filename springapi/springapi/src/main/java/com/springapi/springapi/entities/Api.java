package com.springapi.springapi.entities;

import java.util.UUID;

public class Api {

	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private long noOfTrucks;
	private long weight;
	private String comment;
	private UUID shipperId;
	private String date;
	
	public Api(String loadingPoint, String unloadingPoint, String productType, String truckType, long noOfTrucks,
			long weight, String comment, UUID shipperId, String date) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}

	public Api() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public long getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public UUID getShipperId() {
		return shipperId;
	}

	public void setShipperId(UUID shipperId) {
		this.shipperId = shipperId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Api [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + "]";
	}
	
	
	
}
