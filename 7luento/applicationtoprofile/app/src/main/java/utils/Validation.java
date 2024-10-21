package utils;

public class Validation {

    public static void validateAirportCode(String name) {
        validateNotEmpty(name);
        if (name.length() != 3) {
            throw new IllegalArgumentException("Airport code must be 3 characters long!");
        }
    }

    public static void validateTimezone(String timezone) {
        validateNotEmpty(timezone);
        if (!timezone.startsWith("+") && !timezone.startsWith("-")) {
            throw new IllegalArgumentException("Timezone must be in the format +/-number.");
        }
    }

    public static void validateNumber(String nbr) {
        validateNotEmpty(nbr);
        if (!nbr.matches("\\d+")) {
            throw new IllegalArgumentException("Must be a number.");
        }
    }

    public static void validateNotEmpty(String strng) {
        if (strng.isEmpty()) {
            throw new IllegalArgumentException("String must not be empty.");
        }
    }

    public static void validateTime(String tme) {
        System.out.println("todo: validate time format!");
    }

    public static void validateDate(String dte) {
        System.out.println("todo: validate date format!");
    }

    public static void main(String[] args) {
        try {
            validateAirportCode("ABC");
            validateTimezone("+02:00");
            validateNumber("123");
            validateNotEmpty("Hello");
            validateTime("14:30");
            validateDate("2023-08-14");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}

