package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac.toString());
        mujPocitac.zapniSe();      // Vypíše chybu, protože počítač v tuto chvíli nemá všechny povinné součásti.

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(4_400_000_000L);
        mujProcesor.setVyrobce("Intel");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(16_000_000_000L);

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(952_000_000_000L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        System.out.println(mujPocitac);

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();      // Vypíše chybu, protože počítač už běží

        mujPocitac.vypniSe();
        mujPocitac.vypniSe();      // Nevypíše chybu, ale nic neprovede, protože počítač už je vypnutý

    }

}
