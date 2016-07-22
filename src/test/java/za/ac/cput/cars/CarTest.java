package za.ac.cput.cars;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.cars.Impl.CarsImpl;

/**
 * Created by student on 2016/07/17.
 */
public class CarTest
{
    private Cars car;

    @Before
    public void setUp() throws Exception {
    car = new CarsImpl();

    }

    @Test
    public void testColor() throws Exception
    {
        Assert.assertEquals("Blue",car.carColor("Blue"));

    }

    @Test
    public void testMake() throws Exception
    {
        Assert.assertEquals("BMW",car.carMake("BMW"));
    }

    @Test
    public void testYear() throws Exception
    {
        Assert.assertEquals(2015,car.carYear(2015));
    }
}
