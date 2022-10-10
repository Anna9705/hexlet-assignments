package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> actual1 = App.take(numbers1, 3);
        List<Integer> expected1 = Arrays.asList(1, 2, 3);
        assertThat(actual1).isEqualTo(expected1);


        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(5, 15, 18, 19));
        List<Integer> actual2 = App.take(numbers2, 10);
        List<Integer> expected2 = Arrays.asList(5, 15, 18, 19);
        assertThat(actual2).isEqualTo(expected2);

        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(5, 15, 18, 19));
        List<Integer> actualList3 = App.take(numbers3, 0);
        assertThat(actualList3).isEmpty();

        List<Integer> numbers4 = new ArrayList<>();
        List<Integer> actual4 = App.take(numbers4, 5);
        assertThat(actual4).isEmpty();
        // END
    }
}
