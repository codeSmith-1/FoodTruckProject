package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int truckId = 1;
	private String truckName;
	private String foodType;
	private int rating;

//id is auto assigned from a 'static' field that is incremented as each truck is created

	public void getTrucks(FoodTruck[] array, int numOfTrucks) {
		for (int i = 0; i < numOfTrucks; i++) {
			System.out.println(array[i].toString());
		}
	}

	public String toString() {

		return "Name: " + truckName + " Food: " + foodType + " Rating: " + rating + " Truck ID: " + truckId;
	}

	public int getTruckID() {
		return truckId;
	}

	public void setTruckId(int num) {
		this.truckId += num;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
