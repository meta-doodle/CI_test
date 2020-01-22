package tests.fr.helloyou.personne;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.fr.helloyou.personne.Impl.PersonneImpl;
import main.fr.helloyou.personne.api.Personne;

class PersonneTest
{
    @Test
    void Personne_getName()
    {
        Personne thomas = new PersonneImpl("Thomas");

        assertTrue(thomas.getName().equals("Thomas"));
    }
}