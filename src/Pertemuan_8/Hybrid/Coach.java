package Hybrid;

public class Coach extends Person 
{
    private String specialty;

    public Coach(String name, int age, String specialty) 
    {
        super(name, age);
        this.specialty = specialty;
    }

    public String mentor() 
    {
        return name + " melatih cabang " + specialty + ".";
    }
}