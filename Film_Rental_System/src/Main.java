import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Mehmet", "Unlu", "mehmetunlu@gmail.com", "123456");
        Executive executive = new Executive(11, "Suleyman", "Unlu", "suleyman@gmail.com", "654321");

        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film(1, "Film1", "Action", 49.99, 100));
        filmList.add(new Film(2, "Film2", "Horror", 38.99, 150));

        customer.createAccount();
        executive.addFilm(filmList, 3, "Film3", "Comedy", 69.99, 50);

        customer.searchFilm(filmList, "Film2");
        customer.buyFilm(filmList.get(1));

        for (Film film : filmList) {
            film.showInfo();
        }
    }
}