package creational.builder;

import creational.builder.abstract_builder.User;
import creational.builder.abstract_builder.UserDTO;
import creational.builder.abstract_builder.UserDTOBuilder;
import creational.builder.abstract_builder.UserWebDTOBuilder;
import creational.builder.inner_class_builder.PersonDTO;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

/**
 * Director role of builder
 * <p>
 * In the builder pattern, we have four different roles, which are:
 * <p>
 * Product= We want to create objects of this class in our builder.
 * <p>
 * Builder/Concrete Builder= Defines methods to build parts of our final object, one part at a time
 * also provides method to build the final object, as well as an optional method that we can use to get
 * the final object of the object. - Can be implemented as an interface or abstract class, as well as inner class.
 * <p>
 * Director= Knows how to user the builder class, know the steps and sequence in order to build the final object.
 * It is rarely implemented as a separated class, usually the class who uses the builder plays the role of Director
 * <p>
 * The builder patter is used usually when there is an object with a complex constructor, or an object that is built
 * in multiple steps.
 * <p>
 * The StringBuilder can be used as an example of builder design pattern, however, it does not conform 100% with the
 * GOF definition.
 * <p>
 * A Great example of this pattern is the java.util.Calendar.Builder that provides methods that allows us to build
 * the Calendar.
 * <p>
 * A problem that may occur when using builder design pattern is that sometimes the build object may have some missing
 * properties, if required properties are missing, build method should provide suitable defaults, or throw exception.
 */
public class Client_Director {

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

        //Example of builder pattern in Java 8
        Calendar.Builder calendarBuilder = new Calendar.Builder();
        calendarBuilder.setWeekDate(3, 3, 3);
        calendarBuilder.setLocale(Locale.getDefault());
        Calendar calendar = calendarBuilder.build();
        System.out.println("Built calendar> " + calendar);
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
