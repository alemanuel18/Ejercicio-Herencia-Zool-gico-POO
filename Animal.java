class Animal{
    protected String nombreCientifico;
    protected String habitad;
    protected int esperanzaVida;

    public Animal(String nombreCientifico, String habitad, int esperanzaVida){
        this.nombreCientifico=nombreCientifico;
        this.habitad=habitad;
        this.esperanzaVida=esperanzaVida;
    }

    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }
    public int getEsperanzaVida() {
        return esperanzaVida;
    }
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
    public String getHabitad() {
        return habitad;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    

}