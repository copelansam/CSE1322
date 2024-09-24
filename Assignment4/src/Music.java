public class Music extends Media implements IAudioStandard{
    private String audioCodec;

    Music(String name, String codec){
        super(name);
        audioCodec = codec;
    }
    public String getAudioCodec(){
        return "Audio codec: " + audioCodec;
    }
    public String getMediaInfo(){
        return "Music ID: " + getId()
                +"\nMusic Name: " + getFileName()
                +"\n" + getAudioCodec()+ "\n";
    }
}
