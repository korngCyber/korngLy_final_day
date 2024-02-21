package code;
import java.util.Scanner;
public class inputNumber {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        int[] numbers = null;
        int total = 0;
        do {
            System.out.println("\n1/ Input numbers");
            System.out.println("2/ Output numbers");
            System.out.println("0/ Exit");
            System.out.print("Please choose an option: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter amount that you want to input==");
                    int inputNumber = sc.nextInt();
                    int[] temp = new int[total + inputNumber];
                    if (numbers != null) {
                        for(int i = 0; i < total; i++) {
                            temp[i] = numbers[i];
                        }
                    }
                    for (int i = total; i < total + inputNumber; i++) {
                        System.out.print("Input number[" + i + "]: ");
                        temp[i] = sc.nextInt();
                    }
                    numbers = temp;
                    total+= inputNumber;
                    break;
                case 2:
                        System.out.println("Output Numbers you input:");
                        for (int i = 0; i < total; i++) {
                            System.out.println("Number [" + (i + 1) + "]: " + numbers[i]);
                        }
                    break;
                case 0:
                    System.out.println("bye");
                    break;

                default:
                    System.out.println("no this option");
            }
        } while (op != 0);
    }
}
