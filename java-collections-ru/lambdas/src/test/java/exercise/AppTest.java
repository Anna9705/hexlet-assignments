package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testApp() {
        String[][] image1 = new String[0][0];
        String[][] expected1 = new String[0][0];
        String[][] actual1 = App.enlargeArrayImage(image1);
        assertThat(actual1).isEqualTo(expected1);

        String[][] image2 = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] expected2 = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        String[][] actual2 = App.enlargeArrayImage(image2);
        assertThat(actual2).isEqualTo(expected2);

        String[][] image3 = {
                {"|", "*", "*", "*"},
                {"*", " ", "^", "@"},
                {"*", "$", " ", "@"},
                {"*", "*", "*", "*"},
        };
        String[][] expected3 = {
                {"|", "|", "*", "*", "*", "*", "*", "*"},
                {"|", "|", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", "^", "^", "@", "@"},
                {"*", "*", " ", " ", "^", "^", "@", "@"},
                {"*", "*", "$", "$", " ", " ", "@", "@"},
                {"*", "*", "$", "$", " ", " ", "@", "@"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        String[][] actual3 = App.enlargeArrayImage(image3);
        assertThat(actual3).isEqualTo(expected3);
    }
}
// END
