abstract public class WeatherEvent {
    private String location;
    private static int nextId = 0;
    private int id;
    private boolean active;

    WeatherEvent(String location, boolean active){
        setActive(active);
        setLocation(location);
        id = nextId++;
    }


    public void setLocation(String location){
        this.location = location;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public String getLocation(){
        return location;
    }
    public int getId(){
        return id;
    }
    public boolean getActive(){
        return active;
    }

    @Override
    public String toString(){
        return "Weather Event Location: " + getLocation() + "\n" +
                "id: " + getId() +"\n" +
                "Active: " + getActive() +"\n";
    }
}
