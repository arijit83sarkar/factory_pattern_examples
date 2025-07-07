package com.raven.example_superhero.without_factory;

public class ManualHeroCreator {
    public Superhero createHero(EHeroType type) {
        if (type.equals(EHeroType.SUPERMAN)) {
            System.out.println("Summoning a hero from the stars!");
            return new Superman();
        } else if (type.equals(EHeroType.BATMAN)) {
            System.out.println("Calling for a dark knight!");
            return new Batman();
        } else if (type.equals(EHeroType.WONDERWOMAN)) {
            System.out.println("Requesting an Amazonian warrior princess!");
            return new WonderWoman();
        } else {
            throw new IllegalArgumentException("Unknown hero type!");
        }
    }
}
