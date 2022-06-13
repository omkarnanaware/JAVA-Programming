package src ;

public class Product
{
    private int id;
    private String name;
    private String description;

    public Product(int iValue, String sNValue, String sGDString)
    {
        this.id = iValue;
        this.name = sNValue;
        this.description = sGDString;

    }

    public void setId(int iValue)
    {
        this.id = iValue;
    }

    public void setName(String sNValue)
    {
        this.name = sNValue;
    }

    public void setDescription(String sGDvalue)
    {
        this.description = sGDvalue;
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return  this.name;
    }

    public String getDescription()
    {
        return this.description;

    }

    public String toString()
    {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
