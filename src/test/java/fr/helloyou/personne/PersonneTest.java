package fr.helloyou.personne;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import fr.helloyou.personne.api.Personne;
import fr.helloyou.personne.impl.PersonneImpl;

class PersonneTest
{
    @Test
    void Personne_getName()
    {
        Personne thomas = new PersonneImpl("Thomas");

        assertTrue(thomas.getName().equals("Thomas"));
    }
}