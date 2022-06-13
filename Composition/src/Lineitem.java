package src;


public class Lineitem 
{
    private int id;
    private int quantity;
    private Product p;

    public Lineitem(int iIdValue,int iQValue, Product p)
    {
        this.id = iIdValue;
        this.quantity = iQValue;
        this.p = p;
    }

    public String toString()
    {
        return "LineItem [id=" + id + ", quantity=" + quantity + ", p=" + p + "]";
    }

}
