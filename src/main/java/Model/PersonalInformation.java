package Model;

import com.github.javafaker.Faker;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String password;
    private Faker faker = new Faker();

    public PersonalInformation(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = faker.internet().password(5,10);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
}
