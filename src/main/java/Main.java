import Commands.*;
import Receiver.Album;
import Invoker.Invoker;
import Track.Track;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Album album = new Album();


        System.out.println("Виберіть команду: ");
        System.out.println("1.Створити збірку");
        System.out.println("2.Підрахувати тривалість всіх треків");
        System.out.println("3.Посортувати за стилем");
        System.out.println("4.Відповідає заданому діапазону довжини");
        System.out.println("5.Вибрати випадковий трек");
        System.out.println("6.Вивести інформацію");
        System.out.println("0.Завершити програму");

/////////////////////////////////
        Track l= new Track();
        Command Create=new CreateCollectionCommand(album);
        Command Calculate = new CalculateDuration(album);
        Command Style = new Style(album);
        Command Match = new MatchesRange(album);
        Command Random = new Random(album);
        Command Info = new Info(album);

        Invoker s = new Invoker(Create,Calculate,Style,Match,Random,Info);
/////////////////////////////////

        int choice = 1;
        while (choice != 0) {
            System.out.print("\n\n\nВведіть команду: ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case (1):
                    System.out.print("\nСтворена збірка:\n");
                    s.Create();
                    break;
                case (2):
                    System.out.print("\nТривалість треків:\n ");
                    s.Calculate();
                    break;
                case (3):
                    System.out.print("\nВідсортовано за стилем:\n ");
                    s.Style();
                    break;
                case (4):
                    System.out.print("\nВідповідають заданому діапазону довжини:\n ");
                    s.Match();
                    break;
                case (5):
                    System.out.print("\nВипадковий трек:\n ");
                    s.Random();
                    break;
                case (6):
                    System.out.print("\nІнформація:\n ");
                    s.Info();
                    break;

                default:
                    choice = 0;
                    break;

            }
        }




    }
}