package com.raven.example_superhero.with_factory.defination;

// Our mighty champions! It is our "Concrete Products."
public class Superman implements ISuperhero {

    @Override
    public String displayPower() {
        return "Flying, Super Strength, Heat Vision!";
    }

    @Override
    public String catchPhrase() {
        return "Up, up, and away!";
    }

}
