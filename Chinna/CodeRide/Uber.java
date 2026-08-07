package Chinna.CodeRide;

import java.util.*;

public class Uber {
     public static void main(String[] args) {
        // Hardcode the variables using wrapper classes and correct types
        String riderName = "Ankit Sharma";
        Double distanceKm = 25.0;
        Double pricePerKm = 15.0;
        Double discount = 0.0;

        // Calculate total fare before discount
        Double totalFare = distanceKm * pricePerKm;

        // Apply discount if distance is greater than 20 km
        if (distanceKm > 20.0) {
            discount = totalFare * 0.15;
        }

        // Calculate final fare
        Double finalFare = totalFare - discount;

        // Print output matching the exact expected format
        System.out.println("Rider: " + riderName);
        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Price per km: " + pricePerKm);
        System.out.println("Total Fare: " + totalFare);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Fare: " + finalFare);
    }
}
