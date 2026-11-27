package Hierarchical;

public class Lemon extends Fruits 
{
    private String acidityLevel;

    public Lemon(String name, String color, String acidityLevel) 
    {
        super(name, color);
        this.acidityLevel = acidityLevel;
    }

    public String taste() 
    {
        return name + " memiliki tingkat keasaman " + acidityLevel + ".";
    }
}
