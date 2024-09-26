import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PersonTests {
    Person person = new Person("Petya", 14, Sex.MAN);
    Person person1 = new Person("Katya", 24, Sex.WOMAN);
    Person person2 = new Person("Vasya", 10, Sex.MAN);
    Person person3 = new Person("Sveta", 3, Sex.WOMAN);


    @Test
    public void getPerson() {

        List<Person> expected = Person.getPerson();
        List<Person> actual = new ArrayList<>();
        actual.add(person);
        actual.add(person1);
        actual.add(person2);
        actual.add(person3);


        assertEquals(expected, actual);

    }

    @Test
    public void getPersonNoNull() {
        List<Person> expected = Person.getPerson();

        assertNotNull(expected);


    }

    @Test
    public void getHowManyPerson() {

        int expected = Person.getHowManyPerson();

        assertEquals(expected, 4);

    }

    @Test
    public void getAgePeople() {

        int expected = Person.getAgePeople();
        assertEquals(expected, 51);
    }

    public void middleAge() {

        int expected = Person.middleAge();
        assertEquals(expected, 12);
    }
}
