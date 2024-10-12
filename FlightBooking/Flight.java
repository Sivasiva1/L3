package FlightBooking;

public class Flight {
    private int FlightNo;
    private String FlightName;
    private int capacity;
    private int earnings;
    private int customerNo;
    private String customerName;
    public int getEarnings() {
        return earnings;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }


    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public Flight(int flightNo, String flightName, int capacity) {
        FlightNo = flightNo;
        FlightName = flightName;
        this.capacity = capacity;

    }

    public int getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(int flightNo) {
        FlightNo = flightNo;
    }

    public String getFlightName() {
        return FlightName;
    }

    public void setFlightName(String flightName) {
        FlightName = flightName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString()
    {
        return " Flightno " + FlightNo
                + " FlightName " +
                FlightName +
                " Capacity " +
                capacity +
                " Earnings " +
                earnings +
                " customerName " +
                customerName +

                " customerNo " +
                customerNo ;


    }

}
