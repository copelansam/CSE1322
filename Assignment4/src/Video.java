public class Video extends Media implements IAudioStandard, IImageStandard{
    private String imageCodec;
    private String audioCodec;

    Video(String name, String audio, String image){
        super(name);
        imageCodec = image;
        audioCodec = audio;
    }
    public String getImageCodec(){
        return "Image Codec: " + imageCodec;
    }
    public String getAudioCodec(){
        return "Audio codec: " + audioCodec;
    }
    public String getMediaInfo(){

            return "Video ID: " + getId()
                    +"\nVideo Name: " + getFileName()
                    +"\n" + getImageCodec()
                    +"\n" + getAudioCodec() +"\n";

    }
}
