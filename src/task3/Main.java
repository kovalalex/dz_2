package task3;

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
    public static final int N = 1000;

    public static void main(String[] args) {

        Person[] massiv = new Person[N];
        generateMassiv(massiv);
        Person[] massiv2 = massiv; //продублируем массив для сравнения методов сортировки

        PersonSortable sort1 = new PersonSort1();
        long startTime = System.currentTimeMillis();
        sort1.sort(massiv);
        System.out.println(System.currentTimeMillis() - startTime);

        PersonSortable sort2 = new PersonSort2();
        long startTime2 = System.currentTimeMillis();
        sort2.sort(massiv2);
        System.out.println(System.currentTimeMillis() - startTime2);


//          for (int i = 0; i < massiv.length; i++) {
//               System.out.println(massiv[i]);
//          }
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
