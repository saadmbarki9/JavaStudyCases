package manager;

public class Interim {
    
    private Person colab;
    private boolean dispo;

    public Interim(Person colab, boolean dispo) {
        this.colab = colab;
        this.dispo = dispo;
    }
    public Person getColab() {
        return colab;
    }
    public boolean isDispo() {
        return dispo;
    }
    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }
    public void setColab(Person colab) {
        this.colab = colab;
    }
    
    

}