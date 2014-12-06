//DONE
//
//**************
public class MethodCalls {
    public static void main(String[] arg) {
        int a = 784, b = 22, c;
        c = addDigit(a, 3);
        System.out.println("Add 3 to " + a + " to get " + c);
        c = addDigit(addDigit(c, 4), 5);
        System.out.println("Add 3, 4, and 5 to " + a + " to get " + c);
        System.out.println("Add 3 to -98 to get: " + addDigit(-98, 3));
        c = join(a, b);
        System.out.println("Join " + a + " to " + b + " to get " + c);
        System.out.println("Join 87, 42, and 83 to get " + join(87, join(42, 83)));
        System.out.println("Join -9 and -90 to get " + join(-9, -90));

    }

    public static int addDigit(int number, int x) {
            int y = 0;

            if (number < 0) {
                int n = number * -1;
                number = number + (n * 2);
                String s = Integer.toString(x) + Integer.toString(number);
                y = Integer.parseInt(s);
                y = y * -1;
                return y;
            }

            if (x >= 0 && x <= 1000) {
                String s = Integer.toString(x) + Integer.toString(number);
                y = Integer.parseInt(s);
                return y;
            }

            else if (x < 0 || x > 9) {
                y = number;
                return y;
            }


            else if (x >= 0 && x <= 9) {
                String s = Integer.toString(x) + Integer.toString(number);
                y = Integer.parseInt(s);
                return y;
            }

            return y;
        } //end addDigit

    public static int join(int x, int y) {
            int q = 0;

            q = addDigit(y, x);


            return q;

        } //end join
}
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
