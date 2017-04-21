import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        System.out.print("Give the number in radians: ");
        Scanner convert = new Scanner(System.in);
        a = convert.nextDouble();
        System.out.print(a + " radians is ");
        a = Math.toDegrees(a);
        System.out.println(a + " degrees");

        double b;
        System.out.print("Give the number in degrees: ");
        b = convert.nextDouble();
        System.out.print(b + " degrees is ");
        b = Math.toRadians(b);
        System.out.print(b + " radians");


    }

}

