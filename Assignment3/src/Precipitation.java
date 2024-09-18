abstract public class Precipitation extends WeatherEvent{
    private double rateOfFall;

    Precipitation(double rateOfFall, String location, boolean active){
        super(location, active);
        setRateOfFall(rateOfFall);
    }

    public void setRateOfFall(double rateOfFall){
        if (rateOfFall > 0){
            this.rateOfFall = rateOfFall;
        }
    }
    public double getRateOfFall(){
        return rateOfFall;
    }

    @Override
    public String toString(){
        String rain ="";
        if (getRateOfFall() > 1.5){
            rain = "Heavy";
        }
        else if (getRateOfFall() < 0.5){
            rain = "Light";
        }
        else{
            rain = "Medium";
        }
        return super.toString() +
                "Rate of Fall: " + getRateOfFall() + " in/h (" + rain +")\n";
    }
}
