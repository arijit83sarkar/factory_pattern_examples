package com.raven.example_superhero.with_factory.recruitment;

import com.raven.example_superhero.with_factory.creator.HeroRecruitmentAgency;
import com.raven.example_superhero.with_factory.defination.ISuperhero;
import com.raven.example_superhero.with_factory.defination.Superman;

// Our desk for heroes from outer space! This is a "Concrete Creator."
public class KryptonianRecruitmentAgency extends HeroRecruitmentAgency {

    @Override
    public ISuperhero createHero() {
        System.out.println("Dialing the Fortress of Solitude... (Kryptonian agency at work)");

        // Specifically creates a Superman
        return new Superman();
    }

}
