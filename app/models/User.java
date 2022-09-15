package models;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int id;

    public User(int id, String firstName, String lastName, int age) {
        this.id = id ;
        this.firstName = firstName;
        this.lastName = lastName ;
        this.age = age ;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

