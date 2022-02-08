package ua.kolyada.hw7;

public class Car {
    private String manufacturer;
    private String color;
    private int petrol;
    private int enginePower;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setPetrol(int petrol) {
        if (petrol > 50) {
            this.petrol = petrol;
        }
        else {
            this.petrol = 100;
        }
    }

    public int getPetrol() {
        return petrol;
    }
}
