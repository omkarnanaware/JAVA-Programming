package src;
import java.util.List;
import java.util.ArrayList;



public class Order 
{
    private int id;
    private String name;
    private List<Lineitem> LineItems;    

    public Order(int iIvalue, String sValue)
    {
        this.id = iIvalue;
        this.name = sValue;
        this.LineItems = new ArrayList<Lineitem>();
    }

    public void addItem(int id,int quantity,Product p)
    {
        this.LineItems.add(new Lineitem(id, quantity, p));
    }



}
