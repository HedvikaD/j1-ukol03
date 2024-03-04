package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        if (vyuziteMisto > kapacita) {
            System.err.println("Na disku není dost místa pro vytvoření souboru.");
            return;
            }
        this.vyuziteMisto = vyuziteMisto;
    }

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }



    public String toString() {
        return "kapacita: " + getKapacita() + " B, využité místo: " + getVyuziteMisto() + " B";
    }
}
