package main.first;

import java.time.LocalDate;
import java.time.Period;

// The concrete builder for UserWebDTO.
// TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder
{
    // Storing fields so that we can use them in the build later.
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname)
    {
        firstName = fname;

        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname)
    {
        lastName = lname;

        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date)
    {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());

        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address)
    {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n" + address.getCity() + "\n" + address.getState() + " " + address.getZipcode();

        return this;
    }

    // Returns the final product.
    @Override
    public UserDTO build()
    {
        dto = new UserWebDTO(firstName + " " + lastName, address, age);

        return dto;
    }

    @Override
    public UserDTO getUserDTO()
    {
        return null;
    }

}
