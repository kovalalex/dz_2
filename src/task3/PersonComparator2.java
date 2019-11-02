package task3;

import java.util.Comparator;

/**
 * Класс реализующий сортировку массива
 *
 * @author Александр Коваленко
 */
public class PersonComparator2 implements Comparator<Person> {
    /**
     * Реализация метода compare интерфейса Comparator
     *
     * @param o1
     * @param o2
     * @return int
     */
    @Override
    public int compare(Person o1, Person o2) {
        int x;
        if (o1.getSex().equals(Sex.MAN) && o2.getSex().equals(Sex.WOMAN)) {
            x = -1;
            return x;
        }
        if (o1.getSex().equals(Sex.WOMAN) && o2.getSex().equals(Sex.MAN)) {
            x = 1;
            return x;
        }
        if (o2.getAge() - o1.getAge() != 0)
            return o2.getAge() - o1.getAge();


        return o1.getName().compareTo(o2.getName());
    }

    /**
     * Простейшая сортировка
     *
     * @param massiv Массив объектов класса Person
     */
    public void sort(Person[] massiv) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < massiv.length; i++) {
                if (needSwap(massiv[i], massiv[i - 1])) {
                    swap(massiv, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    /**
     * Метод переставляющий местами два значения в массиве
     *
     * @param array
     * @param ind1
     * @param ind2
     */
    private void swap(Person[] array, int ind1, int ind2) {
        Person tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    /**
     * Метод проверяющий необходимость перестановки местами значений массива,
     * используя {@link PersonComparator2#compare(Person, Person)}
     *
     * @param o1
     * @param o2
     * @return boolean
     */
    private boolean needSwap(Person o1, Person o2) {
        int x = compare(o1, o2);
        return x < 0;
    }
}
