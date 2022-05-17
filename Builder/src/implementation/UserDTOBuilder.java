package implementation;

import java.time.LocalDate;

// Abstract builder. Notice that all the methods return a Builder object.
public interface UserDTOBuilder
{
    // Methods to build "parts" of product at a time.
    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    // Method to "assemble" final product.
    UserDTO build();

    // Method to fetch already built object.
    UserDTO getUserDTO();

}
