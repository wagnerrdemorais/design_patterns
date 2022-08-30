package creational.builder;

import creational.builder.abstract_builder.User;
import creational.builder.abstract_builder.UserDTO;
import creational.builder.abstract_builder.UserDTOBuilder;
import creational.builder.abstract_builder.UserWebDTOBuilder;
import creational.builder.inner_class_builder.PersonDTO;

import java.time.LocalDate;

/**
 * Director role of builder
 */
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO userDTO = directBuildUserDTO(builder, user);
        System.out.println(userDTO);

        Address address = createAddress();
        PersonDTO personDTO = PersonDTO.getBuilder()
                .firstName("Wagner")
                .lastName("Rodakevicz")
                .address(address)
                .age(LocalDate.of(1893, 3, 19))
                .build();

        System.out.println(personDTO);
    }

    private static UserDTO directBuildUserDTO(UserDTOBuilder builder, User user) {
        return builder.firstName(user.getFirstName())
                .lastName(user.getLastName())
                .birthday(user.getBirthday())
                .address(user.getAddress())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1950, 1, 23));
        user.setFirstName("Wagner");
        user.setLastName("Morais");

        Address address = createAddress();

        user.setAddress(address);
        return user;
    }

    private static Address createAddress() {
        Address address = new Address();
        address.setNumber("999");
        address.setCity("Curitiba");
        address.setState("Paraná");
        address.setZipCode("999999999");
        return address;
    }
}
