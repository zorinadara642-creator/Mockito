import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishamanagerFindLastTest {

    String movie1 = "Бладшот";
    String movie2 = "Вперед";
    String movie3 = "Отель Белград";
    String movie4 = "Джентльмены";
    String movie5 = "Человек-неведимка";
    String movie6 = "Тролли. Мировой тур";
    String movie7 = "Номер один";

    @Test
    public void shouldReturnEmptyWhenNoMovies() {
        AfishaManager manager = new AfishaManager();

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenOneMovie() {
        AfishaManager manager = new AfishaManager();

        manager.add(movie1);

        String[] expected = {movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenLessThanLimit() {
        AfishaManager manager = new AfishaManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] expected = {movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenEqualToLimit() {
        AfishaManager manager = new AfishaManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenMoreThanLimit() {
        AfishaManager manager = new AfishaManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithLimit3() {
        AfishaManager manager = new AfishaManager(3);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {movie5, movie4, movie3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithLimit6() {
        AfishaManager manager = new AfishaManager(6);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenMoviesLessThanCustomLimit() {
        AfishaManager manager = new AfishaManager(10);

        manager.add(movie1);
        manager.add(movie2);

        String[] expected = {movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenMoviesEqualCustomLimit() {
        AfishaManager manager = new AfishaManager(2);

        manager.add(movie1);
        manager.add(movie2);

        String[] expected = {movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyWhenNoMoviesAndCustomLimit() {
        AfishaManager manager = new AfishaManager(3);

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
