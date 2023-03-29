package pl.alk.kis.utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

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
        return generateFirstName() + "." + generateLastName() + "@testmail.com";
    }
    public static final String generatePhoneNumber() {
        return faker.number().digits(9);
    }

    public static final String generateDateOfBirth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfBirth = sdf.format(faker.date().birthday(17, 79));
        return dateOfBirth;
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
    public static final String generateRandomText() {
        return faker.lorem().characters(50, 150);
    }

}
