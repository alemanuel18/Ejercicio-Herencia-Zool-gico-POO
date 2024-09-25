
class Mamifero extends Animal{
    protected float pesoKg;
    protected int tiempoGestion;
    protected boolean peligroExtincion;

    public Mamifero(String nombreCientifico, String habitad, int esperanzaVida, float pesoKg, int tiempoGestion, boolean pelibroExticion){
        super(nombreCientifico, habitad, esperanzaVida);
        this.pesoKg=pesoKg;
        this.tiempoGestion=tiempoGestion;
        this.peligroExtincion=pelibroExticion;
    }
    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }
    public float getPesoKg() {
        return pesoKg;
    }
    public void setTiempoGestion(int tiempoGestion) {
        this.tiempoGestion = tiempoGestion;
    }
    public int getTiempoGestion() {
        return tiempoGestion;
    }
    public void setPelibroExticion(boolean pelibroExticion) {
        this.peligroExtincion = pelibroExticion;
    }
    public boolean getPeligroEstincion() {
        return peligroExtincion;
    }

    public float calcularAlimento() {
        int gramosAlimentoPorKg = 0;

        return gramosAlimentoPorKg;
    }
    
}