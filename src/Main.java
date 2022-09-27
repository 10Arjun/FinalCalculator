import java.util.Scanner;

public class Main {
    public static double addition(double Number1, double Number2) {
        double Value = Number1 + Number2;
        return Value;
    }

    public static double division(double Number1, double Number2){
        double Value = Number1 / Number2;
        return Value;
    }
    public static double multiplication(double Number1, double Number2){
        double Value = Number1 * Number2;
        return Value;
    }
    public static double subtraction(double Number1, double Number2){
        double Value = Number1 - Number2;
        return Value;
    }

    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running == true) {
            System.out.println("Select the number allocated to the operation");
            System.out.println("1. Multiplication");
            System.out.println("2. Division");
            System.out.println("3. Addition");
            System.out.println("4. Subtraction");
            System.out.println("Any other Number will Quit the Calculator");
            int Operation = sc.nextInt();

            if (Operation >= 5) {
                break;
            }
            if (Operation <=0){
                break;
            }


            System.out.println("Enter your First Value:");
            double Number1 = sc.nextDouble();
            System.out.println("Enter your Second Value:");
            double Number2 = sc.nextDouble();
            if (Operation==2 && Number2 == 0)
            {
                System.out.println("The value is Undefined you will now be redirected to the menu");
                continue;
            }

            if (Operation == 1) {
                System.out.println("Your Final Answer is:");
                System.out.println(multiplication(Number1, Number2));
            }

            else if (Operation == 2) {

                System.out.println("Your Final Answer is:");
                System.out.println(division(Number1, Number2));
            }

            else if (Operation == 3) {
                System.out.println("Your Final Answer is:");
                System.out.println(addition(Number1, Number2));
            }

            else if (Operation == 4) {
                System.out.println("Your Final Answer is:");
                System.out.println(subtraction(Number1, Number2));
            }
        }
    }
}


