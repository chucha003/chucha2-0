package ChuchPR1;

import java.util.Scanner;

public class ChuPR12 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {
        ChuPR12 demo = new ChuPR12();
        demo.exceptionDemo();
    }
}