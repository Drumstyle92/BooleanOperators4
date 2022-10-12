/**
 * @author Drumstyle92
 * class that contains the whole program.
 */
public class Test {
    /**
     *
     * @param args fundamental parameter of main.
     * main method that contains booleans and prints.
     */
    public static void main(String[] args) {
        System.out.println("---------------Result1------------");
        int a = 1;
        int b = 3;
        int c = a * b;
        int d = c;
        boolean result1 = (d / c + 2) >= b || !(c + b - c / a == 3);
        System.out.println("A: " + result1);

        System.out.println("---------------Result2------------");
        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;
        boolean result2 = (x * x - y * y / 2 != 12) || !t && f;
        System.out.println("B: " + result2);
    }
}
