public abstract class Item {
    private String title;

    Item(){

    }
    Item(String title){
        setTitle(title);
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    abstract public String getListing();

    @Override
    public String toString(){
        return title;
    }

}
