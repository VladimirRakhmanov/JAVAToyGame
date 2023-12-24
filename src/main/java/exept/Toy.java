package exept;

public class Toy {
    private int ID;
    private String toyName; // Just name
    private int quantity; // 0 - 5
    private int frequency; // 0 - 100%

    public Toy(int ID, String toyName, int quantity, int frequency) {
        this.ID = ID;
        this.toyName = toyName;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Игрушка {" +
                "ID: " + ID +
                ", Название игрушки: '" + toyName + '\'' +
                ", Количество: " + quantity +
                ", Частота выпадения: " + frequency +
                '}';
    }
}
