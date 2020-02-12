package fr.helloyou;

import fr.helloyou.personne.api.Personne;
import fr.helloyou.personne.impl.PersonneImpl;

import org.tinylog.Logger;

public class Main
{
    public static void main(String[] args)
    {
        Personne thomas = new PersonneImpl("Thomas");

        Logger.info("Hello " + thomas.getName() + "!");
    }
}
