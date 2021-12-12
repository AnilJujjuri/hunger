package com.ltts.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurant")
public class Restaurant {

	@Id
	int RestaurantId;
	String RestaurantName;
	String RestaurantLocation;
	int RestaurantExistance;
	public int getRestaurantId() {
		return RestaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.RestaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return RestaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.RestaurantName = restaurantName;
	}
	public String getRestaurantLocation() {
		return RestaurantLocation;
	}
	public void setRestaurantLocation(String restaurantLocation) {
		this.RestaurantLocation = restaurantLocation;
	}
	public int getRestaurantExistance() {
		return RestaurantExistance;
	}
	public void setRestaurantExistance(int restaurantExistance) {
		this.RestaurantExistance = restaurantExistance;
	}
}
