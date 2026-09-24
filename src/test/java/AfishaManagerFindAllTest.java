import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerFindAllTest {

    AfishaManager manager = new AfishaManager();
    String movie1 = "Бладшот";
    String movie2 = "Вперед";
    String movie3 = "Отель Белград";
    String movie4 = "Джентльмены";
    String movie5 = "Человек-неведимка";
    String movie6 = "Тролли. Мировой тур";
    String movie7 = "Номер один";

    @Test
    public void shouldReturnEmptyWhenMovies() {
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllWhenOneMovie() {
        manager.add(movie1);

        String[] expected = {movie1};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllInOrderOfAdding() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
