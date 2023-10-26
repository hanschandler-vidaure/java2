import javax.swing.text.NumberFormatter;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    protected double total;
    protected double ship = 0;
    protected ArrayList<Item> cart = null;
    public ShoppingCart()
    {
        cart = new ArrayList<Item>();
        total *= 1.1;
    }
    public ShoppingCart(double shipping)
    {
        if (total < 10) ship = shipping;
        total += ship;
        total *= 1.1;
    }
    public void addItem(Item socks) {
        cart.add(socks);
    }
    public Invoice shipOrder(String name, String address, String city, String state, int zip)
    {
        Invoice invoice = new Invoice(name,address,city,state,zip);
        invoice.addItems(cart);
        invoice.setShippingFee(ship);
        invoice.setTotal(total);
        return invoice;
    }

    public void calculateTotal() {
        total = 0;
        for (Item p : cart)
            total += (p.getCost() * p.getNumber());
    }

    public String getTotal() {
        return "$" + String.format("%.2f", total);
    }
}
