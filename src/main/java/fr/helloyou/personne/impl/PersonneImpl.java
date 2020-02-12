package fr.helloyou.personne.impl;

import fr.helloyou.personne.api.Personne;

public class PersonneImpl implements Personne
{
    private String name;

    public PersonneImpl(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

}
