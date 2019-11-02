package task3;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 3 ДЗ_2
 *
 * @author Александр Коваленко
 */
public class Main {
    /**
     * Константа задающая размер массива
     */
    public static final int N = 10000;

    public static void main(String[] args) {

        Person[] massiv = new Person[N];
        generateMassiv(massiv);
        Person[] massiv2 = massiv; //продублируем массив для сравнения методов сортировки


        long startTime = System.currentTimeMillis();
        Arrays.sort(massiv, new PersonComparator1());
        System.out.println(System.currentTimeMillis() - startTime);

        PersonComparator2 personComparator2 = new PersonComparator2();
        long startTime2 = System.currentTimeMillis();
        personComparator2.sort(massiv2);
        System.out.println(System.currentTimeMillis() - startTime2);


        //  for (int i = 0; i < massiv.length; i++) {
        //       System.out.println(massiv[i]);
        //  }
    }

    /**
     * Метод заполнения массива Person[]
     *
     * @param massiv массив объектов Person
     */
    public static void generateMassiv(Person[] massiv) {

        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            int nSex = random.nextInt(2);
            Sex sex;
            if (nSex == 1) {
                sex = Sex.MAN;
            } else
                sex = Sex.WOMAN;
            massiv[i] = new Person(random.nextInt(80), "a" + random.nextInt(5), sex);
            // System.out.println(massiv[i]);
        }
    }
}
