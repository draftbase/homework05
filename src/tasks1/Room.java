package tasks1;

public class Room {
    private double yardage;
    private int temperature;
    private boolean airConditioner;
    private final int minTemperature = 16;

    public double getYardage() {
        return yardage;
    }

    public void setYardage(double yardage) {
        this.yardage = yardage;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    private boolean lowerTemperature(){
        if (airConditioner && temperature>minTemperature) {
            //setTemperature(temperature-1);
            temperature -= 1;
            return true;
        } else {
            return false;
        }
    }

    public String lowerTemperatureAndGetInfo(){
        return "Zmniejszam temperaturę " + temperature + " o jeden stopień.\n" +
               "Czy się udało: " + lowerTemperature() + ". Aktualna temperatura to " + temperature;
    }

    public String getInfo(){
        return "Informacje o pomieszczeniu: \n" +
                "Aktualna temperatura " + temperature +"\n"+
                "Metraż " + yardage +"\n"+
                "Czy jest klimatyzacja " + airConditioner;

    }

}
