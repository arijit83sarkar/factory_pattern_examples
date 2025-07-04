package com.raven.example_superhero.without_factory;

public class WithoutFactoryMain {
    public static void main(String[] args) {
        ManualHeroCreator creator = new ManualHeroCreator();
        creator.createHero(EHeroType.SUPERMAN);
        creator.createHero(EHeroType.BATMAN);
        creator.createHero(EHeroType.WONDERWOMAN);
        creator.createHero(EHeroType.NONE);
    }
}
