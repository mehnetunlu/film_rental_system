import java.util.Date;

public class Sales {
    private int salesID;
    private int filmID;
    private int customerID;
    private Date salesDate;

    public Sales(int salesID, int filmID, int customerID) {
        this.salesID = salesID;
        this.filmID = filmID;
        this.customerID = customerID;
        this.salesDate = new Date();
    }

    public int getSalesID() {
        return salesID;
    }

    public void setSalesID(int salesID) {
        this.salesID = salesID;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "SalesID=" + salesID +
                ", filmID=" + filmID +
                ", customerID=" + customerID +
                ", SalesDate=" + salesDate +
                '}';
    }
}