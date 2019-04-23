package objects;

import java.util.Scanner;

public class ShapeUtils {

    public static void type() {
        int side = getSide();
        if (side == 3) {
            System.out.println(figura(side));
        } else if (side == 4) {
            int corners = getCorners();
            System.out.println(quadrangle(corners));
        }
    }

    public static int getSide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество сторон Вашей фигуры: ");
        return sc.nextInt();
    }

    public static int getCorners() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество прямых Вашей фигуры: ");
        return sc.nextInt();
    }

    public static String figura(int side) {
        if (side == 3) {
            return "Ваша фигура - треугольник!";
        } else if (side == 4) {
            return "Ваша фигура четырехугольник! Сколько в ней прямых углов?";
        } else {
            return "Это точно не треугольник и не прямоуголник";
        }
    }

    public static String quadrangle(int corners) {
        if (corners == 3 || corners == 4) {
            return "Это прямоугольник!";
        } else {
            return "Это просто четырехугольник. Ну максимум трапеция или параллелограмм.";
        }
    }
}

//        if (corners == 3) {
//            System.out.println("Ваша фигура - треугольник!");
//        } else if (corners == 4) {
//            System.out.println("Ваша фигура четырехугольник. Сколько в ней прямых углов?");
//            int corners2 = sc.nextInt();
//            if (corners2 == 4||corners2 == 4) {
//                System.out.println("Это прямоугольник!");
//            } else {
//                System.out.println("Эх... параллелограмм");
//            }
//        } else {
//            System.out.println("Это точно не треугольник и не прямоуголник");
//        }
//    }