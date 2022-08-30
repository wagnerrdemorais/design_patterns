package creational.builder.abstract_builder;

import creational.builder.Address;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder firstName(String firstName);

    UserDTOBuilder lastName(String lastName);

    UserDTOBuilder birthday(LocalDate date);

    UserDTOBuilder address(Address address);

    UserDTO build();

    UserDTO getUserDTO();
}
