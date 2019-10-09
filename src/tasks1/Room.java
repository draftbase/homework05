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

    public boolean lowerTemperature(){
        if (airConditioner && temperature>minTemperature) {
            //setTemperature(temperature-1);
            temperature -= 1;
            return true;
        } else {
            return false;
        }
    }

    public String lowerTemperatureAndGetInfo(int getTemp, boolean lowerTemp){
        return "Zmniejszam temperaturę " + getTemp + " o jeden stopień.\n" +
               "Czy się udało: " + lowerTemp + ". Aktualna temperatura to " + getTemp;
    }

    public String getInfo(Room rom){
        return "Informacje o pomieszczeniu: \n" +
                "Aktualna temperatura " + rom.getTemperature() +"\n"+
                "Metraż " + rom.getYardage() +"\n"+
                "Czy jest klimatyzacja " + rom.isAirConditioner();

    }

}
