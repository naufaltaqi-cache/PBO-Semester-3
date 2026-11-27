package Multilevel;

public class Developer extends Employee 
{
    protected String language;

    public Developer(String name, String id, String language) 
    {
        super(name, id);
        this.language = language;
    }

    public String code() 
    {
        return name + " menulis kode menggunakan " + language + ".";
    }
}