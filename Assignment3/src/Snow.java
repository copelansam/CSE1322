public class Snow extends Precipitation{
    private double temperature;

    Snow(String location, boolean active, double rateOfFall, double temperature){
        super(rateOfFall, location, active);
        setTemperature(temperature);
    }

    public void setTemperature(double temperature){
        if (temperature <= 32 && temperature >= -459.67){
            this.temperature = temperature;
        }
        else{
            this.temperature = 32.00d;
        }
    }
    public double getTemperature(){
        return temperature;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Temperature: " + getTemperature() + "F\n";
    }
}
