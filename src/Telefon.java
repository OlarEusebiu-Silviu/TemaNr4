abstract class Telefon {
    protected int batteryLifeHours;
    protected String color;
    protected String material;

    public Telefon(int batteryLifeHours, String color, String material) {
        this.batteryLifeHours = batteryLifeHours;
        this.color = color;
        this.material = material;
    }

    public abstract void displayInfo();
}