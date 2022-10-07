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

        int actualSize1 = App.take(numbers1, 3).size();
        assertThat(actualSize1).isEqualTo(3);

        List<Integer> actualList1 = App.take(numbers1, 3);
        assertThat(actualList1).isEqualTo(Arrays.asList(1, 2, 3));


        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(5, 15, 18, 19));

        int actualSize2 = App.take(numbers2, 10).size();
        assertThat(actualSize2).isEqualTo(4);

        List<Integer> actualList2 = App.take(numbers2, 10);
        assertThat(actualList2).isEqualTo(Arrays.asList(5, 15, 18, 19));

        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(5, 15, 18, 19));
        List<Integer> actualList3 = App.take(numbers3, 0);
        assertThat(actualList3).isEmpty();
        // END
    }
}
