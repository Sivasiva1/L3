package FlightBooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightBookings {
    private static ArrayList<Flight> flights = new ArrayList<>();
    private static ArrayList<Flight> history = new ArrayList<>();
    static Map<String,String>map = new HashMap<>();
    static int flightlimit = 10;
    static int idGenerator = 1;

    public static String bookings(String customreName, int flightNo, String flightName) {
        if(flights.size()<flightlimit){
            Flight newFlight = new Flight(flightNo, flightName, 50);
            flights.add(newFlight);
            }
            int capacity = 50;
            int booked = 0;
            Flight readyflight = null;
            for(Flight flight:flights){
                if (flight.getFlightNo()==flightNo && flight.getFlightName()==flightName){
                    booked++;
                    readyflight = flight;
                }
            }
        if (readyflight != null) {
            readyflight.setCustomerNo(idGenerator++);
            readyflight.setCustomerName(customreName);
            readyflight.setEarnings(readyflight.getFlightNo()*5000);
            history.add(readyflight);
        }
        return booked < capacity ? "Flight " + flightNo + " is allocated " : " sorry not allocated ";
        }

    public static String cancellation(int cancelFlight) {
        int cancel = 0;
        int newEarning = 0;
        Flight cancelflight = null;
        for (Flight flight:flights){
            if(flight.getFlightNo()==cancelFlight){
                 cancel = cancelFlight;
                  cancelflight = flight;
                  newEarning = Math.abs(flight.getEarnings() - 500);
            }
        }
        if (cancelflight!=null) {
            cancelflight.setEarnings(newEarning);
        }

        return cancel == cancelFlight ? " Flight No " + cancelFlight + " cancelled ": "No entry";
    }

    public static void display() {

        for (Flight flight : history) {
            System.out.println(flight.toString());
        }
        for(Flight flight : history){
            map.put(flight.getCustomerName(),flight.getFlightName());
        }
        System.out.println(map);
    }
}

