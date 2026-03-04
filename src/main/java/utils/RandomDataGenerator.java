package utils;

import java.util.UUID;

public class RandomDataGenerator {

    public static String generateRandomEmail() {
        String randomId = UUID.randomUUID().toString().substring(0, 8);
        return "testuser_" + randomId + "@gmail.com";
    }
}