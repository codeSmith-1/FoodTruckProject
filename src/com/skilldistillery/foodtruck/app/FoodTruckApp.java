package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		boolean addTrucks = true;
		int maxTrucks = 5;
		int numOfTrucks = 0;
		
		FoodTruck[] trucks = new FoodTruck[maxTrucks];

		for (int i = 0; i < maxTrucks; i++) {
			FoodTruck truck = new FoodTruck();

			System.out.println("Name of truck: ");
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
			System.out.println(truck.getTruckID());
	
			numOfTrucks++;
		}

		System.out.println();
		boolean start = true;

		while (start) {
			System.out.println("_______MENU______");
			System.out.println("1) See list of food trucks");
			System.out.println("2) See average rating of food trucks");
			System.out.println("3) Display highest rated food truck");
			System.out.println("4) Quit");

			System.out.print("Selet an option:");
			int userSelect = kb.nextInt();

			switch (userSelect) {
			case 1:
				truck.getTrucks(trucks, numOfTrucks);
				break;

			default:
				break;
			}
		}

	}

}

// create array of foodtrucks
// if statements