package tasks1;

public class TestRoom {
    public static void main(String[] args) {
        Room pom = new Room();
        pom.setAirConditioner(true);
        pom.setTemperature(20);
        pom.setYardage(18);

        System.out.println(pom.getInfo(pom));
        System.out.println(pom.lowerTemperatureAndGetInfo(pom.getTemperature(),pom.lowerTemperature()));
        System.out.println(pom.lowerTemperatureAndGetInfo(pom.getTemperature(),pom.lowerTemperature()));
        System.out.println(pom.lowerTemperatureAndGetInfo(pom.getTemperature(),pom.lowerTemperature()));
        System.out.println(pom.lowerTemperatureAndGetInfo(pom.getTemperature(),pom.lowerTemperature()));
        System.out.println(pom.lowerTemperatureAndGetInfo(pom.getTemperature(),pom.lowerTemperature()));
        System.out.println(pom.lowerTemperatureAndGetInfo(pom.getTemperature(),pom.lowerTemperature()));

    }
}
