package Hierarchical;

public class Apple extends Fruits 
{
    private String variety;

    public Apple(String name, String color, String variety) 
    {
        super(name, color);
        this.variety = variety;
    }

    public String taste() 
    {
        return name + " variasi " + variety + " rasanya manis dan renyah.";
    }
}