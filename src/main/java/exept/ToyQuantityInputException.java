package exept;

public class ToyQuantityInputException extends Throwable {
    public ToyQuantityInputException() {
        super("Количество игрушек должно быть числом, не более 5");
    }
}
