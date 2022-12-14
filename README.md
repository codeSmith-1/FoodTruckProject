# FoodTruckProject
This program allows users to enter the name, food type, and rating of up to 5 food trucks. Food trucks are assigned a unique ID once created.
A user can stop entering food truck information by typing quit at the subsequent food truck name prompt.

Users will be presented with a menu of 3 options.
1) displays all food trucks. 
2) displays the average rating of all food trucks entered
3) displays the food truck with the highest rating and accompanying details.

## Topics and Tech Used
The program makes use of two classes. The FoodTruck class contains fields, getters, and setters for a food truck object. The FoodTruckApp class contains the program's main. I used the default FoodTruckApp object to call methods outside of the main. After receiving input from the user, a FoodTruck object is created and entered into the FoodTruck array 'trucks'. I track the number of trucks by incrementing numOfTrucks after each entry (loop). I used a while loop and switch to present the menu and allow the user to select various options.

## Lessons Learned
I was puzzled about how to reach a method from the FoodTruck class within the FoodTruckApp class main. I learned to use the default FoodTruckApp object to access methods outside of the main. You can see this on line 12 and in references to the app object. I also sharpened my understanding of initializing objects and putting objects in an array.
