package Task7;

public class Task7 {

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i * 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {

        return (flower1 + flower2) % 2 == 1;

    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        return Integer.toString(num);
    }

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i: args) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static String countingSheep(int num) {
        //Add your code here
        StringBuilder sheeps = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sheeps.append(i).append(" sheep...");
        }
        return sheeps.toString();
    }
}
