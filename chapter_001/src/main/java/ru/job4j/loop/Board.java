package ru.job4j.loop;

/**
 * Created by Home on 19.01.2018.
 */
public class Board {

    public static void main(String[] args) {
        Board b = new Board();
        System.out.println(b.paint(5, 4));
    }


    public String paint(int width, int height) {

        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int x = 1; x<=height; x++ ) {
            for (int y = 1; y<=width; y++ ) {
                if ((x+y)%2==0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
