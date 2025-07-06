package com.raven.example_superhero.with_factory.recruitment;

import com.raven.example_superhero.with_factory.creator.HeroRecruitmentAgency;
import com.raven.example_superhero.with_factory.defination.ISuperhero;
import com.raven.example_superhero.with_factory.defination.WonderWoman;

// Our desk for Amazonian warriors! Yet another "Concrete Creator."
public class ThemysciranRecruitmentAgency extends HeroRecruitmentAgency {

    @Override
    public ISuperhero createHero() {
        System.out.println("Summoning from Paradise Island... (Themysciran agency at work)");

        // Specifically creates a WonderWoman
        return new WonderWoman();
    }

}
