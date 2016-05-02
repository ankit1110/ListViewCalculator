package ohmsoftwaresinc.com.listviewcalculator;

/**
 * Created by Ankitkumar on 5/1/2016.
 */
public class Product
{
    private String item_name;
    private int item_price;
    public Product(String item_name, int item_price) {
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }
}
