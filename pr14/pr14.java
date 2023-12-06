package kat;
import java.util.ArrayList;
import java.util.LinkedList;
public class pr14 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Алгебра");
        states.add("Русский язык");
        states.add("Геометрия");
        states.add("Литература");
        states.add(1, "Физика");
        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Химия"); // установка нового значения для 2-го объект

        System.out.printf("В списке %d элементов \n", states.size());
        for (String state : states) {

            System.out.println(state);}
            if (states.contains("Алгебра")) {
                System.out.println("Список содержит предмет алгебра");
            }
            states.remove("Алгебра");
            states.remove(2);

            Object[] countries = states.toArray();
            for (Object country : countries) {

                System.out.println(country);
            }
        }
    }

