abstract public class Media {
    private String fileName;
    private int id;
    private static int nextId = 1;

    Media(){
        id = nextId++;
    }
    Media(String name){
        id = nextId++;
        fileName = name;
    }

    public String getFileName(){
        return fileName;
    }
    public int getId(){
        return id;
    }

}
