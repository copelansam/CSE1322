public class Rain extends Precipitation{
    private double dropSize;

    Rain (double dropSize, String location, boolean active, double rateOfFall){
        super(rateOfFall, location, active);
        setDropSize(dropSize);
    }

    public void setDropSize(double dropSize){
        if (dropSize < 0.02){
            this.dropSize = 0.02;
        }
        else{
            this.dropSize = dropSize;
        }
    }
    public double getDropSize(){
        return dropSize;
    }

    @Override
    public String toString(){
        String drops = "";
        if (getDropSize() < 0.66){
            drops = "Small";
        }
        else if (getDropSize() > 0.112){
            drops = "Large";
        }
        else{
            drops = "Medium";
        }
        return super.toString() +
                "Drop Size: " + getDropSize() + " (" + drops +")\n";
    }
}
