package factorial;

public class Factorial {

    public static void main(String[] args) {

        int g;
        int h;

        g = 8;

        int i;
        if (g == 0) {
            h = 1;
        } else {
            h = 1;
            for (i = g; i >= 1; i--) {
                h = h * i;
            }
        }

        System.out.println(h);

    }

}
