package IntroNumberSystem;
import java.util.Scanner;

public class NumberSystem {
    public static int decimalToAnyBase (int number, int base) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int base = sc.nextInt();

        int converted = 0;
        int place = 0;
        while (number != 0) {
            int currentConvertedValue = number % base * (int)Math.pow(10, place);
            place++;
            converted += currentConvertedValue;
            number /= base;
        }
        return converted;
    }

    public static int anyBaseToDecimal (int number, int base) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int base = sc.nextInt();

        int converted = 0;
        int place = 0;
        while (number != 0) {
            int currentConvertedValue = number % 10 * (int)Math.pow(base, place);
            place++;
            converted += currentConvertedValue;
            number /= 10;
        }
        return converted;
    }

    public static int anyBaseToBase () {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();

        int dec = 0;
        int place = 0;
        while (number != 0) {
            int currentConvertedValue = number % 10 * (int)Math.pow(base1, place);
            place++;
            dec += currentConvertedValue;
            number /= 10;
        }

        int any = 0;
        int place2 = 0;
        while (dec != 0) {
            int currentConvertedValue = dec % base2 * (int)Math.pow(10, place2);
            place2++;
            any += currentConvertedValue;
            dec /= base2;
        }
        return any;
    }

    public static int anyBaseAddition () {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int number = sc.nextInt();
        int number2 = sc.nextInt();

        int decimalNumber = anyBaseToDecimal(number, base);
        int decimalNumber2 = anyBaseToDecimal(number2, base);
        int sum = decimalNumber + decimalNumber2;

        int result = decimalToAnyBase(sum, base);
        return result;
    }

    public static int anyBaseSubtraction () {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int number = sc.nextInt();
        int number2 = sc.nextInt();

        int decimalNumber = anyBaseToDecimal(number, base);
        int decimalNumber2 = anyBaseToDecimal(number2, base);
        int sub = decimalNumber2 - decimalNumber;

        int result = decimalToAnyBase(sub, base);
        return result;
    }

    public static int anyBaseMultiplication () {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int number = sc.nextInt();
        int number2 = sc.nextInt();

        int decimalNumber = anyBaseToDecimal(number, base);
        int decimalNumber2 = anyBaseToDecimal(number2, base);
        int sub = decimalNumber2 * decimalNumber;

        int result = decimalToAnyBase(sub, base);
        return result;
    }
}
