package Receiver;
/*Receiver class*/

import Track.Track;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Album {
    private final static Logger logger = Logger.getLogger(Album.class);
    Track[] Tracks = new Track[16];

    public Album() {
        Tracks[0] = new Track("50 Cent", "Candy Shop", "Hip Hop", 209);
        Tracks[1] = new Track("Lil Peep", "When I Lie", "Hip Hop ", 236);
        Tracks[2] = new Track("Lil Nas", "Old Town Road ", "Country", 113);
        Tracks[3] = new Track("Billy Marchiafava", "Bikini Bottom", "Country", 61);
        Tracks[4] = new Track("Kadi", "Led By A Dollar", "Hip Hop", 246);
        Tracks[5] = new Track("Billie Eilish", "Bad Guy", "Pop", 205);
        Tracks[6] = new Track("The Bad Plus", "Thrift Store Jewelry", "Jazz", 288);
        Tracks[7] = new Track("Ketil Bjornstad", "Drommen Om havet", "Jazz", 255);
        Tracks[8] = new Track("Rob Simonsen ", "Nuit Tombante", "Classical", 228);
        Tracks[9] = new Track("Wind Rose", "Wintersaga", "Metal", 312);
        Tracks[10] = new Track("Cornelia Malecki ", "Easy Piano", "Classical", 160);
        Tracks[11] = new Track("Years Of Denial ", "Endurance", "Techno", 123);
        Tracks[12] = new Track("Johnny and The Hurricanes", "Red River Rock", "Rock'n'roll", 71);
        Tracks[13] = new Track("Adriana Lopez ", "It All Adds Up", "Techno", 260);
        Tracks[14] = new Track("Pilgrims", "Senor Sapiens", "Rock'n'roll", 216);
        Tracks[15] = new Track("Syberia", "26 Days", "Metalcore", 103);
    }

    public ArrayList<Track> Create() {
        logger.info("Log 1 Create ");
        ArrayList<Track> fiveRandom = new ArrayList<Track>();
        ArrayList<Integer> index = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int currentId = Math.abs(random.nextInt() % Tracks.length);
            while (index.contains(currentId)) {
                currentId = Math.abs(random.nextInt() % Tracks.length);
            }
            index.add(currentId);
            fiveRandom.add(Tracks[currentId]);
            System.out.print(Tracks[currentId].GetAuthor());
            System.out.print("   -  \t ");
            System.out.println(Tracks[currentId].GetName());

        }

        return fiveRandom;

    }

    public int Calculate(){
        logger.info("Log 2 Calculate ");
        int duration=0;

    for(int i=0; i<Tracks.length;i++)
{

    duration += Tracks[i].getDuration();

}

        System.out.println("\tПідрахована тривалість - "+ duration + " Секунд ");
        System.out.println("\tПідрахована тривалість - "+ (duration/60 )+ " Хвилин ");
        System.out.println("Команда порахувати тривалість - Виконана");
        return duration;
    }

    public void Style(){
        logger.info("Log 3 Genre ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть жанр - ");
        String genre = in.nextLine();
        boolean hasFound = false;
        for(int i=0; i<Tracks.length;i++)
        {
            if ( Tracks[i].getGenre().equals(genre))
            {
                System.out.print(Tracks[i].GetAuthor());
                System.out.print("   -  \t ");
                System.out.println(Tracks[i].GetName());
                if(hasFound == false)
                    hasFound = true;
            }
        }
        if(hasFound == false)
        {
            System.out.println("\tЗаданий жанр відсутній .......");
        }
            System.out.println("Команда сортування по жанру - Виконана");
    }

    public int Match(){
        logger.info("Log 4 Match ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть початок діапазону в секундах - ");
        int start = in.nextInt();
        System.out.println("Введіть кінець діапазону в секундах - ");
        int end = in.nextInt();
        boolean hasFound = false;
        //System.out.println("start   -   " + start +"\nend   -   " + end);
        ArrayList<Track> Match = new ArrayList<Track>();

        int r = (end - start);

        for (int i = 0; i < 16; i++) {

            if ( Tracks[i].getDuration() > start)
            {
                if ( Tracks[i].getDuration() < end)
                {
                    if(hasFound == false)
                        hasFound = true;
                    Match.add(Tracks[i]);
                    System.out.print(Tracks[i].GetAuthor());
                    System.out.print("   -  \t ");
                    System.out.print(Tracks[i].GetName());
                    System.out.print("   -  \t ");
                    System.out.println(Tracks[i].getDuration());
                    r++;
                }

            }


        }
        if(hasFound == false) {
            System.out.println("\tТреки у заданому діапазоні відсутні .......");
        }

        System.out.println("Команда входить в діапазон - Виконана");
        return r;
    }

    public Track Random(){
        logger.info("Log 5 Commands.Random ");
        Random random = new Random();
        Track fiveRandom = new Track();
        int currentId = Math.abs(random.nextInt() % Tracks.length);
        fiveRandom = Tracks[currentId];
        System.out.print(Tracks[currentId].GetAuthor());
        System.out.print("   -  \t ");
        System.out.println(Tracks[currentId].GetName());
        System.out.println("Команда вибрати випадковий трек - Виконана");
        return fiveRandom;
    }

    public String Info(){
        logger.info("Log 6 Commands.Info ");

      String Info = "\tАвтор програмного продукту - Кучеренко Іван" +
              "\n\tГрупа - КН-201\n\tТема програми - звукозапис" +
              "\n\tКоманда Вивести інформацію - Виконана";

        System.out.println(Info);
        return Info;
    }

    public ArrayList<String> Style(String wantedGenre){

        ArrayList<String> founded = new ArrayList<String>();
        for(int i=0; i<16;i++)
        {
            if ( Tracks[i].getGenre().equals(wantedGenre))
            {
                founded.add(Tracks[i].getGenre());
                System.out.print(Tracks[i].GetAuthor());
                System.out.print("   -  \t ");
                System.out.println(Tracks[i].GetName());
            }
        }
        System.out.println("Команда сортування по жанру - Виконана");
        return founded;
    }
}
