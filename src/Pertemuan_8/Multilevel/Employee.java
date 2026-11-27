package Multilevel;

public class Employee 
{
    protected String name, id;

    public Employee(String name, String id) 
    {
        this.name = name;
        this.id = id;
    }

    public String showInfo() 
    {
        return "ID: " + id + " | Nama: " + name;
    }
}