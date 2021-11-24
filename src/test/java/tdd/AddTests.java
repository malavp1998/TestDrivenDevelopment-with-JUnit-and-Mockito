package tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AddTests {

    @Test
    public void testAdd_TwoNum()
    {
        Add add = new Add();
       int exepectValue = 10;
       int actualValue = add.addTwoNumber(10,4);
       assertEquals(exepectValue,actualValue);
    }
}
