package creational.builder.abstract_builder;

import creational.builder.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder birthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder address(Address address) {
        this.address = address.getNumber() + ", " + address.getState() + ", " + address.getCity() + ", " + address.getState() + ", " + address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        this.userWebDTO = new UserWebDTO(firstName + " " + lastName, address, age);
        return userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userWebDTO;
    }
}
