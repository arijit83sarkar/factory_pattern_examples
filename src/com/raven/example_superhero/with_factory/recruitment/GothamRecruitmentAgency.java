package com.raven.example_superhero.with_factory.recruitment;

import com.raven.example_superhero.with_factory.creator.HeroRecruitmentAgency;
import com.raven.example_superhero.with_factory.defination.Batman;
import com.raven.example_superhero.with_factory.defination.ISuperhero;

// Our desk for the grim, gadget-loving heroes! Another "Concrete Creator."
public class GothamRecruitmentAgency extends HeroRecruitmentAgency{

    @Override
    public ISuperhero createHero() {
        System.out.println("Activating the Bat-Signal... (Gotham agency at work)");

        // Specifically creates a Batman
        return new Batman();
    }

}
