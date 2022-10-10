package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static boolean isFreeEmail(String email) {
        return email.endsWith("gmail.com")
                || email.endsWith("yandex.ru")
                || email.endsWith("hotmail.com");
    }

    public static long getCountOfFreeEmails(List<String> emailsList) {
        return emailsList.stream()
                .filter(email -> !email.isEmpty())
                .filter(email -> isFreeEmail(email))
                .count();
    }
}
// END
