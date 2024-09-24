public class Image extends Media implements IImageStandard{
    private String imageCodec;

    Image(String name, String codec){
        super(name);
        imageCodec = codec;
    }

    public String getImageCodec(){
        return "Image Codec: " + imageCodec;
    }
    public String getMediaInfo(){
        return "Image ID: " + getId()
                +"\nImage Name: " + getFileName()
                +"\n" + getImageCodec()+"\n";
    }
}
