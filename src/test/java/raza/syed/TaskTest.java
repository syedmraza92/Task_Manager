package raza.syed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

    @Test
    public void constructorTask01(){
        Person person = new Person("Olivia","Smith");
        Task task = new Task("Cleaning Bathroom", person, Category.FAMILY);

        String expected = "Task: Cleaning Bathroom, Description: , Owner: Olivia, Category: FAMILY, Is completed: true";
        String actual = task.toString();

        assertEquals(expected,actual);
    }
}
