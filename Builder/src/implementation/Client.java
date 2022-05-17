package implementation;

import java.time.LocalDate;

/*  Builder Implementation


    Implementation steps

    Step 1
    • We start by creating a builder.
    • We identify the "parts" of the product and provide methods to create those parts.
    • It should provide a method to "assemble" or build the product/object.
    • It must provide a way/method to get fully built object out. Optionally builder can keep reference to a product
      it has built so the same can be returned again in the future.

    Step 2
    • A director can be a separate class or client can play the role of director.
 */

// This is our client which also works as "director"
public class Client
{
    public static void main(String[] args)
    {
        // Using the builder
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    // Instead of creating a separated class, this method will play the role of director.
    public static UserDTO directBuild(UserDTOBuilder builder, User user)
    {
        // Method chaining.
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser()
    {
        User user = new User();

        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");

        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);

        return user;
    }

}
