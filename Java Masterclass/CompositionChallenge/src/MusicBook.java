public class MusicBook {
    private String name;

    public MusicBook(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void openMusicBook(){
        System.out.println("The music book opens to a Sergei Rachmaninoff piece.");
    }
    public void closeMusicBook(){
        System.out.println("The music book is now closed.");
    }
}
