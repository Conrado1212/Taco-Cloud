package tacos;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class Order {
    @NotBlank(message="Imie jest wymagane")
    private String name;
    @NotBlank(message="Ulica jest wymagane")
    private String street;
    @NotBlank(message="Miejscowosc jest wymagane")
    private String city;
    @NotBlank(message="Wojewodztwo jest wymagane")
    private String state;
    @NotBlank(message="Kod pocztowy jest wymagany")
    private String zip;
    @CreditCardNumber(message="Nie wazny numer kardy kredytowej")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
            message="Musi byc w formacie MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Nie poprawny kod  CVV")
    private String ccCVV;
}
