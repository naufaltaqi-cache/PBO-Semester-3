package Main;

import Multilevel.Artist;

public class MainEmployee 
{
    public static void main(String[] args) 
    {
        Artist lead = new Artist("Raka", "EMP-101", "Java", 6);
        System.out.println(lead.showInfo());
        System.out.println(lead.code());
        System.out.println(lead.leadTeam());
    }
}