package Hybrid;

public class StudentAthlete extends Student implements Athlete 
{
    private String sport, scholarship;

    public StudentAthlete(String name, int age, String major, String sport, String scholarship) 
    {
        super(name, age, major);
        this.sport = sport;
        this.scholarship = scholarship;
    }

    @Override
    public void train() 
    {
        System.out.println(name + " berlatih cabang olahraga " + sport + ".");
    }

    public String status() 
    {
        return "Status beasiswa atlet: " + scholarship + ".";
    }
}
