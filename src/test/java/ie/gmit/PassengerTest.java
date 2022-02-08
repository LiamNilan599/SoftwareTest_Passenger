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
        final String invalid ="Name must be 3 characters or more";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mrs","Sh", "MKV562060b","0879073600",34));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void InvalidIDTest()
    {
        final String invalid ="ID must be 10 characters";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mrs","Shiela", "MKV56206","0879073600",34));
        assertEquals(invalid, exceptionThrown.getMessage());
    }


    @Test
    void InvalidAgeTest()
    {
        final String invalid ="Age must be 16 or over to fly";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mrs","Shiela", "MKV562060b","0879073600",3));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void InvalidPhoneTest()
    {
        final String invalid ="Phone must be 7 characters";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms","Shiela", "MKV562060b","08790",34));
        assertEquals(invalid, exceptionThrown.getMessage());
    }
}
