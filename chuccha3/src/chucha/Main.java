package chucha;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(2,2,1,0,4);
        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);
    }
}
