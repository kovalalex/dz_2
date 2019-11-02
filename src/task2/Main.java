package task2;

import java.util.Random;

/**
 * Задание 2, ДЗ 2
 *
 * @author Александр Коваленко
 */
public class Main {

    public static void main(String[] args) {
        final int N = 10000;

        int[] massiv = new int[N];

        randMassiv(massiv);

        for (int k = 0; k < massiv.length; k++) {
            // сразу проверим на отрицательность
            try {
                if (massiv[k] < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Ошибка! отрицательное число в масссиве");
                continue;
            }
            double q = Math.sqrt(massiv[k]); //число q соответсвтвующее k

            int integralPart = (int) q; //целая часть числа q

            if (Math.pow(integralPart, 2) == massiv[k]) {
                System.out.println(massiv[k]);
            }
        }
    }

    /**
     * Заполение массива случайными числами
     *
     * @param massiv
     */
    public static void randMassiv(int[] massiv) {
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(); //Для наглядности стоит поставить чтото по типу random.nextInt(80)-10

        }
    }

}
