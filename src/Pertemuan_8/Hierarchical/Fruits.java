package Hierarchical;

public class Fruits 
{
    protected String name, color;

    public Fruits(String name, String color) 
    {
        this.name = name;
        this.color = color;
    }

    public String describe() 
    {
        return "Buah " + name + " berwarna " + color + ".";
    }
}