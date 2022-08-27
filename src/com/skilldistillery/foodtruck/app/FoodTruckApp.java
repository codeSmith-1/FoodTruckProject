package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruckApp app = new FoodTruckApp();

		int maxTrucks = 5;
		int numOfTrucks = 0;

		FoodTruck[] trucks = new FoodTruck[maxTrucks];

		for (int i = 0; i < maxTrucks; i++) {
			FoodTruck truck = new FoodTruck();

			System.out.println("Name of food truck: ");
			
			String input = kb.next();
			if (input.equalsIgnoreCase("quit")) {
				break;
			} else {
				truck.setTruckName(input);
			}

			System.out.println("Food type: ");
			truck.setFoodType(kb.next());

			System.out.println("Your rating: ");
			truck.setRating(kb.nextInt());

			truck.setTruckId(i);

			trucks[i] = truck;

			numOfTrucks++;
		}

		System.out.println();
		boolean start = true;

		while (start) {
			System.out.println();
			System.out.println("_______MENU______");
			System.out.println("1) See list of food trucks");
			System.out.println("2) See average rating of food trucks");
			System.out.println("3) Display highest rated food truck");
			System.out.println("4) Quit");
			System.out.println();

			System.out.print("Selet an option:");
			int userSelect = kb.nextInt();

			switch (userSelect) {
			case 1:
				app.getTrucks(trucks, numOfTrucks);
				break;
			case 2:
				app.getAverage(trucks, numOfTrucks);
				break;
			case 3:
				app.getHigh(trucks, numOfTrucks);
				break;
			case 4:
				System.out.println("Come back when you're hungry!");
				start = false;
				break;
			default:
				System.err.println("Command not recognized.");
			}
		}
	}

	public void getTrucks(FoodTruck[] array, int numOfTrucks) {
		for (int i = 0; i < numOfTrucks; i++) {
			System.out.println(array[i]);
		}
	}

	public void getAverage(FoodTruck[] arr, int numOfTrucks) {
		double sum = 0;
		for (int i = 0; i < numOfTrucks; i++) {
			double rating = arr[i].getRating();
			sum += rating;
		}
		System.out.println("The average rating is : " + (sum / numOfTrucks));
	}

	public void getHigh(FoodTruck[] arr, int numOfTrucks) {

		FoodTruck maxRating = arr[0];
		for (int i = 1; i < numOfTrucks; i++) {
			if (arr[i].getRating() > maxRating.getRating()) {
				maxRating = arr[i];
			}
		}
		System.out.println(maxRating);
	}
}