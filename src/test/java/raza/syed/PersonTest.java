package raza.syed;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void constructorTest01() {
        Person person = new Person("John", "Smith");

        String expected = "First Name: John, Last Name: Smith";
        String actual = person.toString();

        assertEquals(expected, actual);
    }
    @Test
    public void setAndGetFirstName(){
        Person person = new Person("John", "Smith");

        person.setFirstName("John");
        String expected = "John";
        String actual = person.getFirstName();

        assertEquals(expected, actual);
    }
    @Test
    public void setAndGetLastName(){
        Person person = new Person("John", "Smith");

        person.setLastName("Smith");
        String expected = "Smith";
        String actual = person.getLastName();

        assertEquals(expected, actual);
    }
}
