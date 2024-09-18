public class Fog extends Obscuration{
    private boolean freezingFog;

    Fog(String location, boolean active, int visibility, boolean freezingFog){
        super(location, active, visibility);
        setVisibility(visibility);
        setFreezingFog(freezingFog);
    }

    public boolean getFreezingFog(){
        return freezingFog;
    }

    public void setFreezingFog(boolean freezingFog){
        this.freezingFog = freezingFog;
    }

    @Override
    public void setVisibility(int visibility){
        if (visibility <= 0 ){
            visibility = 1;
        } else if (visibility >= 5) {
            visibility = 4;
        }
        super.setVisibility(visibility);
    }

    @Override
    public String toString(){
        String total = super.toString();
        if (getFreezingFog()){
            total += "ALERT! FREEZING FOG!\n";
        }
        return total;
    }

}
