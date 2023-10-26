import java.util.ArrayList;

public class Invoice extends ShoppingCart{
    private String name, address, city, state;
    private int zip;


    public Invoice(String name, String address, String city, String state, int zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setTotal(double total)
    {
        this.total = total;
    }
    public void setShippingFee(double shippingFee)
    {
        this.ship = shippingFee;
    }
    public void addItems(ArrayList<Item> cart)
    {
        this.cart.addAll(cart);
    }
    public String toString()
    {
        String shipping = "Ship to:\n";
        shipping += "\t" + name + "\n\t" + address + "\n\t" + city + ", " + state + " " + zip + "\n";
        shipping += "\n";
        shipping += "Items\n-----\n";


        for (Item item : cart)
        {
            shipping +=  item.getName() + " $" + String.format("%.2f", item.getCost()) + " (" + item.getNumber() +") $"
                    +   String.format("%.2f", item.getCost() * item.getNumber()) + "\n";
        }
        shipping += "\n";
        shipping += "Shipping: ";
        if (ship == 0) shipping += "Free\n";
        else shipping += "$" + String.format("%.2f", ship) + "\n";
        shipping+= "\nTotal Cost\n--------\n";
        shipping += "$" + String.format("%.2f", total);
        return shipping;
    }
}
