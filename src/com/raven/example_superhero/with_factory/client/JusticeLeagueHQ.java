package com.raven.example_superhero.with_factory.client;

import com.raven.example_superhero.with_factory.creator.HeroRecruitmentAgency;
import com.raven.example_superhero.with_factory.defination.ISuperhero;
import com.raven.example_superhero.with_factory.recruitment.GothamRecruitmentAgency;
import com.raven.example_superhero.with_factory.recruitment.KryptonianRecruitmentAgency;
import com.raven.example_superhero.with_factory.recruitment.ThemysciranRecruitmentAgency;

// Step 5: The Justice League in Action (The Client)
public class JusticeLeagueHQ {
    public static void main(String[] args) {
        System.out.println("\n--- Justice League Headquarters ---");

        // Need a Kryptonian hero? Go to the Kryptonian Recruitment Agency!
        HeroRecruitmentAgency alienDesk = new KryptonianRecruitmentAgency();
        System.out.println("\nUrgent! Alien invasion! Deploying Kryptonian!");
        ISuperhero missionHero1 = alienDesk.deployHeroForMission();
        System.out.println("Mission complete! Hero: " + missionHero1.getClass().getSimpleName() + " says: "
                + missionHero1.catchPhrase());

        // Need a Bat-Vigilante? Go to the Gotham Recruitment Agency!
        HeroRecruitmentAgency gothamDesk = new GothamRecruitmentAgency();
        System.out.println("\nBank Robbery in Gotham! Deploying Bat-Vigilante!");
        ISuperhero missionHero2 = gothamDesk.deployHeroForMission();
        System.out.println("Mission complete! Hero: " + missionHero2.getClass().getSimpleName() + " says: "
                + missionHero2.catchPhrase());

        // Need an Amazonian warrior? Go to the Themysciran Recruitment Agency!
        HeroRecruitmentAgency amazonDesk = new ThemysciranRecruitmentAgency();
        System.out.println("\nPolitical unrest in Themyscira! Deploying Amazonian!");
        ISuperhero missionHero3 = amazonDesk.deployHeroForMission();
        System.out.println("Mission complete! Hero: " + missionHero3.getClass().getSimpleName() + " says: "
                + missionHero3.catchPhrase());

        System.out.println("\n--- The Justice League's future is bright and flexible! ---");
    }
}
