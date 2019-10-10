package tasks1;

public class TestRoom {
    public static void main(String[] args) {
        Room pom = new Room();
        pom.setAirConditioner(true);
        pom.setTemperature(20);
        pom.setYardage(18);

        System.out.println(pom.getInfo());
        System.out.println(pom.lowerTemperatureAndGetInfo());
        System.out.println(pom.lowerTemperatureAndGetInfo());
        System.out.println(pom.lowerTemperatureAndGetInfo());
        System.out.println(pom.lowerTemperatureAndGetInfo());
        System.out.println(pom.lowerTemperatureAndGetInfo());
        System.out.println(pom.lowerTemperatureAndGetInfo());
    }
}
