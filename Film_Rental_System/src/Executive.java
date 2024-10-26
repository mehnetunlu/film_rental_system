import java.util.List;

public class Executive {
    private int executiveID;
    private String name;
    private String surname;
    private String email;
    private String password;

    public Executive(int executiveID, String name, String surname, String email, String password) {
        this.executiveID = executiveID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public int getExecutiveID() {
        return executiveID;
    }

    public void setExecutiveID(int executiveID) {
        this.executiveID = executiveID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addFilm(List<Film> filmList, int filmID, String title, String type, double price, int stock) {
        Film newFilm = new Film(filmID, title, type, price, stock);
        filmList.add(newFilm);
        System.out.println("New film added: " + title);
    }

    public void editFilm(Film film, String title, String type, double price, int stock) {
        film.setTitle(title);
        film.setType(type);
        film.setPrice(price);
        film.setStock(stock);
        System.out.println("Film edited: " + title);
    }

    public void deleteFilm(List<Film> filmList, int filmID) {
        filmList.removeIf(film -> film.getFilmID() == filmID);
        System.out.println("Film deleted. Film ID: " + filmID);
    }

    @Override
    public String toString() {
        return "Executive{" +
                "executiveID=" + executiveID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}