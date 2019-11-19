import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 1;
        this.passengers = new ArrayList<Person>();

    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengerFromBusStop(BusStop busStop) {
        if(passengerCount() < capacity) {
            Person person = busStop.removePerson();
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
