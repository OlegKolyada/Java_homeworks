package ua.kolyada.hw7;

public class Main {
    public static void main(String[] args) {
        Car volksWagen = new Car();
        volksWagen.setManufacturer("VolksWagen");
        volksWagen.setColor("Black");
        volksWagen.setEnginePower(200);
        volksWagen.setPetrol(100);

        Car mercedes = new Car();
        mercedes.setManufacturer("Mercedes");
        mercedes.setColor("Black");
        mercedes.setEnginePower(250);
        mercedes.setPetrol(100);

        Car zapor = new Car();
        zapor.setManufacturer("ZAZ");
        zapor.setColor("Rusty");
        zapor.setEnginePower(-10);
        zapor.setPetrol(0);

        System.out.println("The first car is " +volksWagen.getManufacturer() +", the color is " +volksWagen.getColor()
                +", engine has " +volksWagen.getEnginePower() +" HP, fuel level is " +volksWagen.getPetrol() +" percents");
        System.out.println();
        System.out.println("The second car is " +mercedes.getManufacturer() +", the color is " +mercedes.getColor()
                +", engine has " +mercedes.getEnginePower() +" HP, fuel level is " +mercedes.getPetrol() +" percents");
        System.out.println();
        System.out.println("The third car is " +zapor.getManufacturer() +", the color is " +zapor.getColor()
                +", engine has " +zapor.getEnginePower() +" HP, fuel level is " +zapor.getPetrol() +" percents");
        System.out.println();
        startEngine(mercedes.getManufacturer());
        startEngine(volksWagen.getManufacturer());
        startEngine(zapor.getManufacturer());
        System.out.println("VolksWagen's fuel level is " +isEnoughPetrol(volksWagen.getPetrol()));
        System.out.println("Mercedes's fuel level is " +isEnoughPetrol(mercedes.getPetrol()));
        System.out.println("ZAZ's fuel level is " +isEnoughPetrol(zapor.getPetrol()));
    }
    public static void startEngine(String manufacturer) {
        System.out.println(manufacturer +" started engine");
    }

    public static boolean isEnoughPetrol(int petrol) {
        int i = petrol;
        boolean b;
        if (petrol < 50) {
            b = false;
        }
        else {
            b = true;
        }
        return b;
    }
}
