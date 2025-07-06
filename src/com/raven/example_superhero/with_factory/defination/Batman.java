package com.raven.example_superhero.with_factory.defination;

// Our mighty champions! It is our "Concrete Products."
public class Batman implements ISuperhero {

    @Override
    public String displayPower() {
        return "Peak Human Condition, Genius Intellect, Gadgets!";
    }

    @Override
    public String catchPhrase() {
        return "I'm Batman.";
    }

}
