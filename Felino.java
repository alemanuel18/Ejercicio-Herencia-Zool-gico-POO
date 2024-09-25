class Felino extends Mamifero{
    protected String especie;
    protected String colorPelaje;

    public Felino(String nombreCientifico, String habitad, int esperanzaVida, float pesoKg, int tiempoGestion, boolean pelibroExticion, String especie, String colorPelaje){
        super(nombreCientifico, habitad, esperanzaVida, pesoKg, tiempoGestion, pelibroExticion);
        this.especie=especie;
        this.colorPelaje=colorPelaje;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    public String getColorPelaje() {
        return colorPelaje;
    }
    public float calcularAlimento() {
        float gramosAlimentoPorKg = 0;

        if (especie.equalsIgnoreCase("Gatos monteses")) {
            gramosAlimentoPorKg = 25; 
        } else if (especie.equalsIgnoreCase("Pumas")) {
            gramosAlimentoPorKg = 30; 
        }else if (especie.equalsIgnoreCase("Leopardos")) {
            gramosAlimentoPorKg = 30; 
        }
        return gramosAlimentoPorKg * pesoKg;
    }
    
}
