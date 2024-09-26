import java.util.*;

public class Person {
    private static Map<Integer, Person> allPerson = new HashMap<>();
    private static int countId = 0;
    private String name;
    private int age;
    private Sex sex;
    private int id;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        if (!hashPerson()) {
            countId++;
            this.id = countId;
            allPerson.put(id, this);
        }
    }

    public static List<Person> getPerson() {
        return new ArrayList<>(allPerson.values());
    }

    public static int getHowManyPerson() {
        return allPerson.size();

    }

    public static int getAgePeople() {
        int countAge = 0;
        for (Person person : allPerson.values()) {
            countAge += person.age;
        }
        return countAge;
    }

    public static int middleAge() {
        return getAgePeople() / getHowManyPerson();
    }

    public static void setAllPerson(Map<Integer, Person> allPerson) {
        Person.allPerson = allPerson;
    }

    private boolean hashPerson() {
        for (Person person : allPerson.values()) {
            if (person.equals(this) && person.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id" + id +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}
