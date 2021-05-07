package taco.tacocloud;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Order {
    @NotBlank(message="Name is Required")
    private String name;
    @NotBlank(message="street is Required")
    private String street;
    @NotBlank(message="city is Required")
    private String city;
    @NotBlank(message="state is Required")
    private String state;
    @NotBlank(message="zip is Required")
    private String zip;
    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
    
}
