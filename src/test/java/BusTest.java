import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Gorgie Rd");
        person = new Person();
        busStop = new BusStop("Ocean");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerIfCapacity(){
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removePassenger(){
//        busStop.addPerson(person);
        bus.addPassengerFromBusStop(busStop);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
}
