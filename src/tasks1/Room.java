package tasks1;

public class Room {
    private double yardage;
    private int temperature;
    private boolean airConditioner;

    public Room() {

    }

    public Room(double yardage, int temperature, boolean airConditioner){

    }

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
        if (this.airConditioner=true && this.temperature>16) {
            setTemperature(this.temperature-1);
            return true;
        } else {
            return false;
        }
    }

}
