package com.raven.example_superhero.with_factory.creator;

import com.raven.example_superhero.with_factory.defination.ISuperhero;

// The grand HQ for all hero recruitment. This is our "Creator" abstract class.
public abstract class HeroRecruitmentAgency {

    // THIS is the Factory Method! It's abstract, so subclasses define the actual
    // hero-summoning.
    // This method returns an object of the "Product" type (Superhero).
    public abstract ISuperhero createHero();

    // This method defines the general process for deploying a hero.
    // It uses the Factory Method to get the actual hero object.
    public ISuperhero deployHeroForMission() {
        // The *real* magic of creation happens here, delegated!
        ISuperhero hero = createHero();
        System.out.println("Hero recruited! Initializing mission protocol for: " + hero.catchPhrase());
        System.out.println("Abilities: " + hero.displayPower());

        return hero;
    }
}
