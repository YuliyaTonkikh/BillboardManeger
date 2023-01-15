import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmManeger;

public class FilmManagerTest {
    @Test
    public void test() {
        FilmManeger maneger = new FilmManeger();
        maneger.addFilm("Film 1");
        maneger.addFilm("Film 2");
        maneger.addFilm("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = maneger.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        FilmManeger maneger = new FilmManeger();
        maneger.addFilm("Film 1");
        maneger.addFilm("Film 2");
        maneger.addFilm("Film 3");
        maneger.addFilm("Film 4");
        maneger.addFilm("Film 5");
        maneger.addFilm("Film 6");
        maneger.addFilm("Film 7");
        maneger.addFilm("Film 8");
        maneger.addFilm("Film 9");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9"};
        String[] actual = maneger.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FilmManeger maneger = new FilmManeger();
        maneger.addFilm("Film 1");
        maneger.addFilm("Film 2");
        maneger.addFilm("Film 3");
        maneger.addFilm("Film 4");
        maneger.addFilm("Film 5");
        maneger.addFilm("Film 6");
        maneger.addFilm("Film 7");
        maneger.addFilm("Film 8");
        maneger.addFilm("Film 9");
        maneger.addFilm("Film 10");
        maneger.addFilm("Film 11");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10", "Film 11"};
        String[] actual = maneger.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        FilmManeger maneger = new FilmManeger();
        maneger.addFilm("Film 1");


        String[] expected = {"Film 1"};
        String[] actual = maneger.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        FilmManeger maneger = new FilmManeger();
        maneger.addFilm("Film 1");
        maneger.addFilm("Film 2");
        maneger.addFilm("Film 3");
        maneger.addFilm("Film 4");
        maneger.addFilm("Film 5");
        maneger.addFilm("Film 6");
        maneger.addFilm("Film 7");
        maneger.addFilm("Film 8");
        maneger.addFilm("Film 9");
        maneger.addFilm("Film 10");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = maneger.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        FilmManeger maneger = new FilmManeger(3);
        maneger.addFilm("Film 1");
        maneger.addFilm("Film 2");
        maneger.addFilm("Film 3");
        maneger.addFilm("Film 4");
        maneger.addFilm("Film 5");
        maneger.addFilm("Film 6");
        maneger.addFilm("Film 7");
        maneger.addFilm("Film 8");
        maneger.addFilm("Film 9");
        maneger.addFilm("Film 10");
        maneger.addFilm("Film 11");


        String[] expected = {"Film 11", "Film 10", "Film 9"};
        String[] actual = maneger.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }


}
