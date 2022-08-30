package creational.builder.inner_class_builder;

import creational.builder.Address;

import java.time.LocalDate;
import java.time.Period;

public class PersonDTO {

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static PersonDTOBuilder getBuilder() {
        return new PersonDTOBuilder();
    }

    public static class PersonDTOBuilder {

        private String firstName;
        private String lastName;
        private String address;
        private String age;
        private PersonDTO personDTO;

        public PersonDTOBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonDTOBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonDTOBuilder address(Address address) {
            this.address = address.getState() + ", " + address.getCity() + ", " + address.getStreet() + ", " + address.getNumber() + ", " + address.getZipCode();
            return this;
        }

        public PersonDTOBuilder age(LocalDate date) {
            this.age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public PersonDTO build() {
            this.personDTO = new PersonDTO();
            personDTO.setName(firstName + " " + lastName);
            personDTO.setAddress(address);
            personDTO.setAge(age);
            return this.personDTO;
        }

        public PersonDTO getPersonDTO() {
            return this.personDTO;
        }

    }
}
