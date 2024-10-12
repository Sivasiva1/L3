package FlightBooking;

import TaxiBooking.TaxiBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Booking 2.Canceling 3.display");
            int ip = sc.nextInt();
            switch (ip) {
                case 1: {
                    System.out.println("Enter the passenger name");
                    String customreName = sc.next();
                    System.out.println("Enter the Flight No");
                    int FlightNo = sc.nextInt();
                    System.out.println("Enter the flight name");
                    String FlightName = sc.next();
                    System.out.println(FlightBookings.bookings(customreName, FlightNo, FlightName));
                    break;
                }
                case  2: {
                    System.out.println("Enter the flight no to be cancelled");
                    int cancelFlight = sc.nextInt();
                    System.out.println(FlightBookings.cancellation(cancelFlight));
                    break;
                }
                case 3: {

                   FlightBookings.display();
                   break;
                }

            }
        }
    }
}
