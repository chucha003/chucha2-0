package ChuPR11;

public class ChuPR11 {

    public static void main(String[] args) {
            int originalNumber = 12345;
            int reversedNumber = reverseNumber(originalNumber, 0);
            System.out.println("Reversed number: " + reversedNumber);
        }

        static int reverseNumber(int n, int reversed) {
            if (n == 0) {
                return reversed;
            } else {
                int lastDigit = n % 10;
                int remainingDigits = n / 10;
                return reverseNumber(remainingDigits, reversed * 10 + lastDigit);
            }
        }
    }