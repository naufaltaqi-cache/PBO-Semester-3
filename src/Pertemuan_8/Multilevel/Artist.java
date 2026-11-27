package Multilevel;

public class Artist extends Developer 
{
    private int teamSize;

    public Artist(String name, String id, String language, int teamSize) 
    {
        super(name, id, language);
        this.teamSize = teamSize;
    }

    public String leadTeam() 
    {
        return name + " memimpin tim berisi " + teamSize + " developer.";
    }
}