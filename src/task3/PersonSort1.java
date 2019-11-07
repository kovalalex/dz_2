package task3;

/**
 * Класс сортирующий значения массива методом полного перебора
 *
 * @author Александр Коваленко
 */
public class PersonSort1 implements PersonSortable {
    @Override
    public void sort(Person[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (needSwap(array[i], array[i - 1])) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    /**
     * Метод переставляющий местами два значения в массиве
     *
     * @param array массив Person[]
     * @param ind1  элемент 1
     * @param ind2  элемент 2
     */
    private void swap(Person[] array, int ind1, int ind2) {
        Person tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    /**
     * Метод проверяющий необходимость перестановки местами значений массива,
     * используя compareTo (int to boolean)
     *
     * @param o1 Объект Person 1
     * @param o2 Объект Person 2
     * @return boolean
     */
    private boolean needSwap(Person o1, Person o2) {
        int x = o1.compareTo(o2);
        return x < 0;
    }
}
