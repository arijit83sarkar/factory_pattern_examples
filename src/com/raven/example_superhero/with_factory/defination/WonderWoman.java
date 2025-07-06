package com.raven.example_superhero.with_factory.defination;

// Our mighty champions! It is our "Concrete Products."
public class WonderWoman implements ISuperhero {

    @Override
    public String displayPower() {
        return "Super Strength, Flight, Lasso of Truth!";
    }

    @Override
    public String catchPhrase() {
        return "By the gods!";
    }

}
