class Primate extends Mamifero{
    protected String especie;
    protected int inteligenciaLV;

    public Primate(String nombreCientifico, String habitad, int esperanzaVida, float pesoKg, int tiempoGestion, boolean pelibroExticion, String especie, int inteligenciaLV){
        super(nombreCientifico, habitad, esperanzaVida, pesoKg, tiempoGestion, pelibroExticion);
        this.especie=especie;
        this.inteligenciaLV=inteligenciaLV;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }
    public void setInteligenciaLV(int inteligenciaLV) {
        this.inteligenciaLV = inteligenciaLV;
    }
    public int getInteligenciaLV() {
        return inteligenciaLV;
    }
    
    public float calcularAlimento() {
        float gramosAlimentoPorKg = 0;

        if (especie.equalsIgnoreCase("Monos")) {
            gramosAlimentoPorKg = 25; 
        } else if (especie.equalsIgnoreCase("Monos ardillas")) {
            gramosAlimentoPorKg = 30; 
        }else if (especie.equalsIgnoreCase("Temarinos")) {
            gramosAlimentoPorKg = 30; 
        }
        return gramosAlimentoPorKg * pesoKg;
    }
    
}
