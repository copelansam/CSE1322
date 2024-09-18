abstract public class Obscuration extends WeatherEvent{
    private int visibility;

    Obscuration(String location, boolean active, int visibility){
        super(location ,active);
        setVisibility(visibility);
    }

    public void setVisibility(int visibility){
        if (visibility > 0){
            this.visibility = visibility;
        }
    }
    public int getVisibility(){
        return visibility;
    }

    @Override
    public String toString(){
        String sight = "";
        if (getVisibility() >= 56){
            sight = "Normal";
        }
        else{
            sight = getVisibility() +"/8 mi";
        }
        return super.toString() +
                "Visibility: " + sight +"\n";
    }
}
