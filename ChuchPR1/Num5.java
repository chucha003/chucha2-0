package ChuchPR1;

import java.text.DecimalFormat;

public class Num5 {
    public static void main(String[] args) {
        System.out.println("Числа гармоничиского ряда: ");
        double numbers = 0;
        DecimalFormat rounding = new DecimalFormat("#.####");
        for(int i=1;i<=10;i++){
            numbers+= (double) 1/i;
            System.out.println(i + ". " + rounding.format(numbers));
        }
    }
}