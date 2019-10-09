package tasks1;

public class TestRoom {
    public static void main(String[] args) {
        Room pom = new Room();
        pom.setAirConditioner(true);
        pom.setTemperature(20);
        pom.setYardage(18);

        System.out.println("Pomieszczenie 1");
        System.out.println("Aktualna temperatura " + pom.getTemperature());
        System.out.println("Metraż " + pom.getYardage());
        System.out.println("Czy jest klimatyzacja " + pom.isAirConditioner());

        System.out.println("Zmniejszam temperaturę " + pom.getTemperature() + " o jeden stopień.");
        System.out.println("Czy się udało: " + pom.lowerTemperature() + ". Aktualna temperatura to " + pom.getTemperature());
        System.out.println("Zmniejszam temperaturę " + pom.getTemperature() + " o jeden stopień.");
        System.out.println("Czy się udało: " + pom.lowerTemperature() + ". Aktualna temperatura to " + pom.getTemperature());
        System.out.println("Zmniejszam temperaturę " + pom.getTemperature() + " o jeden stopień.");
        System.out.println("Czy się udało: " + pom.lowerTemperature() + ". Aktualna temperatura to " + pom.getTemperature());
        System.out.println("Zmniejszam temperaturę " + pom.getTemperature() + " o jeden stopień.");
        System.out.println("Czy się udało: " + pom.lowerTemperature() + ". Aktualna temperatura to " + pom.getTemperature());
        System.out.println("Zmniejszam temperaturę " + pom.getTemperature() + " o jeden stopień.");
        System.out.println("Czy się udało: " + pom.lowerTemperature() + ". Aktualna temperatura to " + pom.getTemperature());

    }
}
