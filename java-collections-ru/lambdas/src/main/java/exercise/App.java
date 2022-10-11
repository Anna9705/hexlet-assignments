package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static void main(String[] args) {
        String[][] image2 = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] actual2 = App.enlargeArrayImage(image2);
        System.out.println(Arrays.deepToString(actual2));
    }

    public static String[][] enlargeArrayImage(String[][] image) {
        String[][] horizontallyStretched = Arrays.stream(image)
                .map(App::duplicateValues)
                .toArray(String[][]::new);
        return Arrays.stream(horizontallyStretched)
                .flatMap(item -> Arrays.stream(new String[][] {item,item}))
                .toArray(String[][]::new);
    }

    public static String[] duplicateValues(String[] items) {
        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[] {item,item}))
                .toArray(String[]::new);
    }
//    public static String[][] enlargeArrayImage(String[][] image) {
//        if (image.length == 0) {
//            return new String[0][0];
//        }
//        String[][] result = new String[image.length * 2][image[0].length * 2];
//        for (var n = 0; n < image.length; n++) {
//            for (var m = 0; m < image[0].length; m++) {
//                result[n * 2][m * 2] = image[n][m];
//                result[n * 2 + 1][m * 2] = image[n][m];
//                result[n * 2][m * 2 + 1] = image[n][m];
//                result[n * 2 + 1][m * 2 + 1] = image[n][m];
//            }
//        }
//        return result;
//    }
}
// END
