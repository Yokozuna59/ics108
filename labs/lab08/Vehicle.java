public class Vehicle {
    private int id, wheels;

    public Vehicle(int id, int wheels) {
        this.id = id;
        this.wheels = wheels;
    }

    public String toString() {
        String result = String.format("ID: %d, Wheels: %d", id, wheels);
        return result;
    }
}
