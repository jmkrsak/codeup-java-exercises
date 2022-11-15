public class ConFloEx {

    public static void main(String[] args) {

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

        int y = 100;
        do {
            System.out.println(y);
            y -= 5;
        } while (y >= -10);

        for (int c = 100; c >= -10; c -= 5) {
            System.out.println(c);
        }

        long a = 2;
        do {
            System.out.println(a);
            a *= a;
        } while (a <= 1_000_000);

        for (long b = 2; b <= 1_000_000; b *= b) {
            System.out.println(b);
        }

        for (int d = 1; d <= 100; d++) {
            if (d % 3 == 0 && d % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (d % 5 == 0) {
                System.out.println("Buzz");
            } else if (d % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(d);
            }
        }



    }

}
