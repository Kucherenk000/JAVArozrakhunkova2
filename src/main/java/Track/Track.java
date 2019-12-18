package Track;
/*Receiver class*/

public class Track {

    private String Author;
    private String Name;
    private String Genre;
    private int Duration;


    public void setAuthor(String author) {
        Author = author;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public Track() {}

    public String getAuthor() {
        return Author;
    }

    public String getName() {
        return Name;
    }

    public String getGenre() {
        return Genre;
    }



    public Track(String Author, String Name, String Genre, int Duration) {
        this.Author = Author;
        this.Name = Name;
        this.Genre = Genre;
        this.Duration = Duration;
    }

    public String GetAuthor()
    {
        return Author;
    }
    public String GetName()
    {
        return Name;
    }
    public String GetGenre()
    {
        return Genre;
    }
    public int getDuration() {
        return Duration;
    }


}

