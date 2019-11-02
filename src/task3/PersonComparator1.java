package task3;

import java.util.Comparator;

/**
 * Класс реализующий сортировку массива
 *
 * @author Александр Коваленко
 */
public class PersonComparator1 implements Comparator<Person> {
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

}
