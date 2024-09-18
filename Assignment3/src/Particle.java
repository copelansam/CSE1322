public class Particle extends Obscuration{
    private String particleType;

    Particle(String location, boolean active, String particleType, int visibility){
        super(location, active, visibility);
        setParticleType(particleType);
    }

    public void setParticleType(String type){
        if (type.equals("Dust") || type.equals("Ash") || type.equals("Sand")){
            this.particleType = type;

        }
        else{
            particleType = "Other";
        }
    }

    public String getParticleType(){
        return particleType;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Particle Type: " + getParticleType();
    }
}
