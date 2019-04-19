package objects;

import java.util.Scanner;

public class ShapeUtils {
    public ShapeUtils() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество сторон Вашей фигуры: ");
        int corners = sc.nextInt();
        if (corners == 3) {
            System.out.println("Ваша фигура - треугольник!");
        } else if (corners == 4) {
            System.out.println("Ваша фигура четырехугольник. Сколько в ней прямых углов?");
            int corners2 = sc.nextInt();
            if (corners2 == 4) {
                System.out.println("Это прямоугольник!");
            } else {
                System.out.println("Эх... параллелограмм");
            }
        } else {
            System.out.println("Это точно не треугольник и не прямоуголник");
        }

    }
}
