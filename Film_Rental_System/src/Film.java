public class Film {
    private int filmID;
    private String title;
    private String type;
    private double price;
    private int stock;

    public Film(int filmID, String title, String type, double price, int stock) {
        this.filmID = filmID;
        this.title = title;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void showInfo() {
        System.out.println("Film ID: " + filmID +
                ", Title: " + title +
                ", Type: " + type +
                ", Price: " + price +
                ", Stock: " + stock);
    }
}