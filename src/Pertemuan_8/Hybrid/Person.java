package Hybrid;

public class Person 
{
    protected String name;
    protected int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String introduce() 
    {
        return "Nama saya " + name + ", umur " + age + " tahun.";
    }
}