import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private String surname;
    private String email;
    private String password;

    public Customer(int customerID, String name, String surname, String email, String password) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Login failed. Invalid email or password.");
            return false;
        }
    }

    public void createAccount() {
        System.out.println("New account created: " + name + " " + surname);
    }

    public void searchFilm(List<Film> filmList, String filmName) {
        for (Film film : filmList) {
            if (film.getTitle().equalsIgnoreCase(filmName)) {
                System.out.println("Film found: " + filmName);
                return;
            }
        }
        System.out.println("Film not found: " + filmName);
    }

    public void buyFilm(Film film) {
        if (film.getStock() > 0) {
            film.setStock(film.getStock() - 1);
            System.out.println("Film purchased. Film ID: " + film.getFilmID());
        } else {
            System.out.println("Film out of stock. Film ID: " + film.getFilmID());
        }
    }
}