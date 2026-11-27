package Main;

import Hierarchical.Apple;
import Hierarchical.Lemon;

public class MainFruits 
{
    public static void main(String[] args) 
    {
        Apple apple = new Apple("Apel", "Merah", "Fuji");
        Lemon lemon = new Lemon("Lemon", "Kuning", "Tinggi");

        System.out.println(apple.describe() + " " + apple.taste());
        System.out.println(lemon.describe() + " " + lemon.taste());
    }
}