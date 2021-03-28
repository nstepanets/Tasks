public class TaskA {

    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }

    public static String remove(String str) {
        // your code here
        return str.substring(1, str.length() - 1);
    }

    static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static String updateLight(String current) {
        String g = "green";
        String y = "yellow";
        String r = "red";

        if (g.equals(current)) {
            return y;
        }
        if (y.equals(current)) {
            return r;
        }
        if (r.equals(current)) {
            return g;
        }
        return "";
    }

    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }
}
