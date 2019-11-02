package task1;

/**
 * Класс реализующий свое исключение
 *
 * @author Александр Коваленко
 */
class MyException extends Exception {
    /**
     * Конструктор исключения
     *
     * @param message сообщение передаваемое в конструктор родительского класса
     */
    public MyException(String message) {
        super(message);
    }
}