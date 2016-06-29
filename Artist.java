public class Artist {

    int age;
    int born;
    int died;
    String name;

    public Artist(String artistName){
      name = artistName;
    }

    public int lifeTime(int born, int died){
      age = died - born;
      return age;
    }

    public static void main(String[] args) {
        Artist speakerKnockerz = new Artist("speaker knockerz");
        System.out.println(speakerKnockerz.name + " was only " + speakerKnockerz.lifeTime(1997, 2016));
    }

}
