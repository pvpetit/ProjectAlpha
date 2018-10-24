public class AudioPlayer extends  Product implements MultimediaControl {
  private String audioSpecification;
  private ItemType mediaType;

  AudioPlayer(String name, String audioSpecification){
    super(name);

    this.audioSpecification= audioSpecification;
    this.mediaType= ItemType.AUDIO ;

  }

  @Override
  public void play() {
    System.out.println("Playing");

  }

  @Override
  public void stop() {
    System.out.println("Stop");

  }

  @Override
  public void previous() {
    System.out.println("Previous");

  }

  @Override
  public void next() {
    System.out.println("next");

  }

  @Override
  public String toString() {
    return
        super.toString()+
            "\nAudio Spec : " + audioSpecification +
            "\nType : " + mediaType
        ;
  }

  public static void main(String [] args){
    AudioPlayer ap = new AudioPlayer("J","Lw");
    System.out.println(ap.toString());

  }
}