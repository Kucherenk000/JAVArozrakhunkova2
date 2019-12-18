import Receiver.Album;
import Track.Track;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    Album album = new Album();

    @Test
    public void create_success() {
        ArrayList<Track> listOne = album.Create();
        ArrayList<Track> listTwo = album.Create();

        assertFalse(listEqualsIgnoreOrder(listOne,listTwo));
    }

    public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) {
        return new HashSet<>(list1).equals(new HashSet<>(list2));
    }

    @Test
    public void calculate_success() {
        int suspected = 3086;

        assertEquals(suspected,album.Calculate());
    }

    @Test
    public void random_success() {
        Track listOne = album.Random();
        Track listTwo = album.Random();

        assertNotEquals(listOne,listTwo);
    }

    @Test
    public void style_success() {
        String iWantMetal = "Metalcore";

        ArrayList<String> OOOnlyMetal = new ArrayList<String >();
        ArrayList<String> founded = album.Style(iWantMetal);

        OOOnlyMetal.add(iWantMetal);

        System.out.println(OOOnlyMetal);
        System.out.println(founded);

        assertEquals(OOOnlyMetal,founded);

    }

    @Test

    public void info_success() {

        String InfoCheck = "\tАвтор програмного продукту - Кучеренко Іван\n\tГрупа - КН-201\n\tТема програми - звукозапис\n\tКоманда Вивести інформацію - Виконана";
       String Info = album.Info();
        assertEquals(InfoCheck,Info);


    }





}