package ie.gmit;
//import org.junit.Assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest
{

        @Test
        void ValidTitleTest()
        {
            Passenger pass = new Passenger("Mrs","Shiela", "MKV562060b","0879073600",34);
            assertTrue(pass.GetTitle() == "Mr" || pass.GetTitle() == "Mrs" || pass.GetTitle() == "Ms");
        }
        @Test
        void ValidNameTest()
        {
            Passenger pass = new Passenger("Mrs","Shiela", "MKV562060b","0879073600",34);
            assertTrue(pass.GetName().length() >= 3);
        }

    @Test
    void ValidIDTest()
    {
        Passenger pass = new Passenger("Mrs","Shiela", "MKV562060b","0879073600",34);
        assertEquals(10, pass.GetId().length());
    }
    @Test
    void ValidPhoneTest()
    {
        Passenger pass = new Passenger("Mrs","Shiela", "MKV562060b","0879073600",34);
        assertEquals(10, pass.GetPhone().length());
    }
    @Test
    void ValidAgeTest()
    {
        Passenger pass = new Passenger("Mrs","Shiela", "MKV562060b","0879073600",34);
        assertTrue(pass.GetAge() > 16);
    }

    @Test
    void InvalidTitleTest()
    {
        final String invalid ="Must be Mr, Mrs Ms";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Zhr","Shiela", "MKV562060b","0879073600",34));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void InvalidNameTest()
    {
        Passenger pass = new Passenger("Mrs","Sh", "MKV562060b","0879073600",34);
        assertTrue(pass.GetName().length() < 3);
    }

    @Test
    void InvalidIDTest()
    {
        Passenger pass = new Passenger("Mrs","Shiela", "MKV56206","0879073600",34);
        assertEquals(10, pass.GetId().length());
    }
}
