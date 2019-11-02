package task1;

/**
 * Задание 1, ДЗ 2
 *
 * @author Александр Коваленко
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            //throw new NullPointerException();
            // throw new ArrayIndexOutOfBoundsException();
            throw new MyException("Исключение");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException has been caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException has been caught.");
        } catch (MyException e) {
            System.out.println("MyException has been caught and sent message: \"" + e.getMessage() + "\".");
        }
    }

}

