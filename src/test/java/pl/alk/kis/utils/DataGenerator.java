package pl.alk.kis.utils;

import com.github.javafaker.Faker;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataGenerator {

    private static final Faker faker = new Faker();

    public static final String generateFirstName() {
        return faker.name().firstName();
    }
    public static final String generateMiddleName() {
        return faker.name().name();
    }
    public static final String generateLastName() {
        return faker.name().lastName();
    }
    public static final String generateEmailAddress() {
        return generateFirstName() + "." + generateLastName() + "@.mail.com";
    }
    public static final String generatePhoneNumber() {
        return faker.phoneNumber().cellPhone();
    }

    public static final String generateDateOfBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String dateOfBirth = faker.date().birthday(17, 79).toString();
        return String.format(dateOfBirth, formatter);
    }
    public static final String generateCityOfBirth() {
        return faker.address().city();
    }
    public static final String generateStreetName() {
        return faker.address().streetName();
    }
    public static final String generateHouseNumber() {
        return faker.address().streetAddressNumber();
    }
    public static final String generateApartmentNumber() {
        return faker.address().buildingNumber();
    }

}
