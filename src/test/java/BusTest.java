import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Gorgie Rd");
        person = new Person();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerIfCapacity(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
}
