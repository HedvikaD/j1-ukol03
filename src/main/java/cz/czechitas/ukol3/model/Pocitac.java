package cz.czechitas.ukol3.model;

public class Pocitac {

    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;


    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }


    public String toString() {
        return "procesor - " + getCpu() + ", paměť - " + getRam() + ", disk - " + getPevnyDisk();

    }
    private boolean jeZapnuty; // tady mám problém, když vytvořím metodu, naskakuje mi chyba v metodách vypniSe a zapniSe


    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Počítač nelze zapnout.");
            return;
        }
        jeZapnuty = true;
        System.out.println("Počítač se zapnul.");

    }
    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač se vypnul.");
            jeZapnuty = false;
        }

    }
    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
            System.out.println("uloženo");
        } else {
            System.out.println("nedostatek místa na disku");
        }

    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
        } else {
            System.err.println("Počítač není zapnutý a nelze smazat soubor.");
        }
   }
}
