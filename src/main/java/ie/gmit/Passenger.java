package ie.gmit;

import javafx.beans.binding.Bindings;

public class Passenger
{
    String title ,name, ID, Phone;
    int age;
    public Passenger(String title, String name, String ID, String Phone, int age) {
        if (title == "Mrs" || title == "Ms" || title == "Mr")
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Must be Mr, Mrs Ms");
        }

        if (name.length() > 3)
        {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("Name must be 3 characters or more");
        }

        if (ID.length() == 10)
        {
            this.ID = ID;
        }
        else
        {
            throw new IllegalArgumentException("ID must be 10 characters");
        }

        if (Phone.length() >= 7)
        {
            this.Phone = Phone;
        }
        else
        {
            throw new IllegalArgumentException("Phone must be 7 characters ");
        }

        if (age >= 16)
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("Age must be 16 or over to fly");
        }
    }

    public String GetTitle()
    {
        return title;
    }

    public String GetName()
    {
        return name;
    }

    public String GetId()
    {
        return ID;
    }

    public String GetPhone()
    {
        return Phone;
    }

    public int GetAge()
    {
        return age;
    }
}
