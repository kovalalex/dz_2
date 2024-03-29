package task3;

/**
 * Класс Person
 *
 * @author Александр Коваленко
 */
public class Person implements Comparable {

    /**
     * Поле содержащее возраст
     */
    private int age;
    /**
     * Поле содержащее имя
     */
    private String name;
    /**
     * Поле содержащее пол
     */
    private Sex sex;

    public Person(int age, String name, Sex sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Person))
            return -1;
        Person p2 = (Person) o;
        int x;
        if (this.getSex().equals(Sex.MAN) && p2.getSex().equals(Sex.WOMAN)) {
            x = -1;
            return x;
        }
        if (this.getSex().equals(Sex.WOMAN) && p2.getSex().equals(Sex.MAN)) {
            x = 1;
            return x;
        }
        if (p2.getAge() - this.getAge() != 0)
            return p2.getAge() - this.getAge();


        return this.getName().compareTo(p2.getName());

    }
}
