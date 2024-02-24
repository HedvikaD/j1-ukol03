package cz.czechitas.ukol3.model;

public class Pocitac {

    public Procesor cpu;
    public Pamet ram;
    public Disk pevnyDisk;


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
    private boolean jeZapnuty;

    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Počítač nelze zapnout.");
            return;
        }
        jeZapnuty = true;
        System.out.println("Počítač se zapnul.");

    }
    public void vypniSe() {
        if (jeZapnuty = true) {
            return;
        }
        jeZapnuty = false;
        System.out.println("Počítač se vypnul.");
    }
}
