package fr.helloyou;

import fr.helloyou.personne.api.Personne;
import fr.helloyou.personne.Impl.PersonneImpl;

public class Main
{
    public static void main(String[] args)
    {
        Personne thomas = new PersonneImpl("Thomas");

        System.out.println("Hello " + thomas.getName() + "!");
    }
}
