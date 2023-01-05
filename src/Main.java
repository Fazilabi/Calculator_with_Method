import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum result : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Minus result : " + result);
        return result;

    }

    static int multiple(int a, int b) {
        int result = a * b;
        System.out.println("Multiple result : " + result);
        return result;
    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.println("Divided result : " + result);
        return result;

    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static void perimeter(int a, int b) {
        int perimeter = 2 * (a + b);
        System.out.println("Perimeter : " + perimeter);
        int area = a * b;
        System.out.println("Area : " + area);


    }

    static void mode(int a, int b) {
        int result = a % b;
        System.out.println("Mode result : "+result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;


        String menu = "1.Sum \n"
                + "2.Minus \n"
                + "3.Multiple \n"
                + "4.Divided \n"
                + "5.Power \n"
                + "6.Perimeter and area \n"
                + "7.Mode \n"
                + "0.EXIT";
        System.out.println(menu);
        while (true)
         {

            System.out.print("Enter any calculation : ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }else if(select>7){
                System.out.println("Select any number range 0-7 :");
                break;
            }
            System.out.println("Enter 1. number : ");
            int a = scan.nextInt();
            System.out.println("Enter 2. number : ");
            int b = scan.nextInt();


            switch (select) {
                case 1:

                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multiple(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Power result : " + power(a, b));
                    break;
                case 6:
                    perimeter(a, b);
                    break;
                case 7:
                    mode(a,b);
                    break;
                default:

            }

        }

    }
}