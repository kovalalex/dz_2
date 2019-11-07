package task3;

import java.util.Random;

/**
 * Класс сортирующий значения массива объектов Person,
 * методом быстрой сортировки
 *
 * @author Александр Коваленко
 */
public class PersonSort2 implements PersonSortable {
    @Override
    public void sort(Person[] array) {
        qSort(array, 0, array.length - 1);
    }

    /**
     * Генератор случайных чисел
     */
    private static final Random RND = new Random();

    /**
     * Метод выполняющий разбиение массива
     *
     * @param array входной массив
     * @param begin начальный элемент
     * @param end   конечный элемент
     * @return int граница разбиения на две части
     */
    private int partition(Person[] array, int begin, int end) {
        int index = begin + RND.nextInt(end - begin + 1);
        Object pivot = array[index];
        swap(array, index, end);
        for (int i = index = begin; i < end; ++i) {
            if (array[i].compareTo(pivot) <= 0) {
                swap(array, index++, i);
            }
        }
        swap(array, index, end);
        return (index);
    }

    /**
     * Метод быстрой сортировки, вызывается рекурсивно
     *
     * @param array массив Person[]
     * @param begin начальный элемент
     * @param end   конечный элемент
     */
    private void qSort(Person[] array, int begin, int end) {
        if (end > begin) {
            int index = partition(array, begin, end);
            qSort(array, begin, index - 1);
            qSort(array, index + 1, end);
        }
    }

    /**
     * Метод переставляющий местами два значения в массиве
     *
     * @param array Массив объектов Person[]
     * @param ind1  Положение первого элемента
     * @param ind2  Положение второго элемента
     */
    private void swap(Person[] array, int ind1, int ind2) {
        Person tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}



