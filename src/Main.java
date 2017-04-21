import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input: ");

        while (s.hasNextLine()) {
            String input = s.nextLine();
            int letterIndex = 0;
            for (int i = 0; i < input.length() && !Character.isAlphabetic(input.charAt(i)); i++) {
                letterIndex = i + 1;
            }
            System.out.println("Result: " + convert(input.substring(letterIndex, letterIndex + 2),
                    Float.parseFloat(input.substring(0, letterIndex))));
        }
    }

    public static String convert(String conversion, double number) {

        switch (conversion) {
            case "rd":
                number = number * 180 / Math.PI;
                break;
            case "dr":
                number = number * Math.PI / 180;
                break;
            case "kc":
                number = number - 273.15;
                break;
            case "kf":
                number = number * 9 / 5 - 459.67;
                break;
            case "ck":
                number = number + 273.15;
                break;
            case "fk":
                number = (number + 459.67) * 5 / 9;
                break;
            case "cf":
                number = number * 9 / 5 + 32;
                break;
            case "fc":
                number = (number - 32) * 5 / 9;
                break;
            default:
                return "No candidate for conversion";
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return decimalFormat.format(number) + conversion.charAt(1);
    }
}