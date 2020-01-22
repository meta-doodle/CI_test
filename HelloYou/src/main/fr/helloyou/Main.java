package main.fr.helloyou;

import main.fr.helloyou.personne.Impl.PersonneImpl;
import main.fr.helloyou.personne.api.Personne;

public class Main
{
    public static void main(String[] args)
    {
        Personne thomas = new PersonneImpl("Thomas");

        System.out.println("Hello " + thomas.getName() + "!");
    }
}
