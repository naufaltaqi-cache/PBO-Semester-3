package Main;

import Hybrid.StudentAthlete;

public class MainPerson 
{
    public static void main(String[] args) 
    {
        StudentAthlete sa = new StudentAthlete("Dina", 20, "TI", "Atletik", "Aktif");
        System.out.println(sa.introduce());
        System.out.println(sa.study());
        sa.train();
        System.out.println(sa.status());
    }
}