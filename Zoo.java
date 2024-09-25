import java.util.Scanner;

public class Zoo {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int eleccion;

        System.out.println("Ingresa los datos de los felinos");
        Felino F1= new Felino(nombreF(), nombreH(), esperanzaVida(), pesoKg(), tiempoGestion(), menu2(), menu3(), colorP());
        Felino F2= new Felino(nombreF(), nombreH(), esperanzaVida(), pesoKg(), tiempoGestion(), menu2(), menu3(), colorP());
        System.out.println("Ingresa los datos de los primates");
        Primate P1= new Primate(nombreF(), nombreH(), esperanzaVida(), pesoKg(), tiempoGestion(), menu2(), menu4(), inteligenciaLV());
        Primate P2= new Primate(nombreF(), nombreH(), esperanzaVida(), pesoKg(), tiempoGestion(), menu2(), menu4(), inteligenciaLV());

        eleccion=menu();
        while (eleccion!=2) {
            if (eleccion == 1) {
                
                System.out.println("Al "+ F1.getNombreCientifico()+ " se le debe dar "+ F1.calcularAlimento()+"g de comida.\nAl "+ F2.getNombreCientifico()+ " se le debe dar "+ F2.calcularAlimento()+"g de comida.\nAl "+ P1.getNombreCientifico()+" se le debe dar "+ P1.calcularAlimento()+"g de comida.\nAl "+ P2.getNombreCientifico()+" se le debe dar "+ P2.calcularAlimento()+"g de comida.");
                eleccion=menu();
            }
        }
        System.out.println("Gracias por preferirnos, hasta la proxima.");
    }

    /**
     * 
     * @return eleccion dle menu principal
     */
    public static int menu(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\nSeleccion lo que deses realizar\n1. Revisar porciones de alimento\n2. Salir");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>2){
                    System.out.println("Ingrese una de las opciones del menu");
                }else
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioi;
    }
    public static boolean menu2(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        boolean peligro=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\n¿Este animal se encuentra en peligro de extincion?\n1. Si\n2. No");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>2){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        peligro=true;
                        verificador=true;
                    }else if (eleccionUsuarioi==2) {
                        peligro=false;
                        verificador=true;
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return peligro;
    }
    public static String menu3(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\n¿Que especie es este felino\n1. Gato\n2. Puma\n3. Leopardo");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>3){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Gatos monteses";
                        verificador=true;
                    }else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Pumas";
                        verificador=true;
                    }else if (eleccionUsuarioi==3) {
                        eleccionUsuarioS="Leopardos";
                        verificador=true;
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }

    public static String menu4(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\n¿Que especie es este primate?\n1. Mono\n2. Mono ardilla\n3. Tamarino");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>3){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Monos";
                        verificador=true;
                    }else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Monos ardillas";
                        verificador=true;
                    }else if (eleccionUsuarioi==3) {
                        eleccionUsuarioS="Temarinos";
                        verificador=true;
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }

    public static String nombreF(){
        Scanner teclado=new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre cientifico del animal");
        nombre=teclado.nextLine();
        return nombre;
    }
    public static String nombreH(){
        Scanner teclado=new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el nombre del habitad");
        nombre=teclado.nextLine();
        return nombre;
    }
    public static int esperanzaVida(){
        Scanner teclado=new Scanner(System.in);
        String Es;
        int Ei=0;
        boolean verificador=false;

        while (verificador==false) {
            System.out.println("Ingrese la esperanza de vida del animal");
            Es=teclado.nextLine();

            try { 
                Ei=Integer.parseInt(Es);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return Ei;
    }
    public static float pesoKg(){
        Scanner teclado=new Scanner(System.in);
        String Es;
        float Ei=0;
        boolean verificador=false;

        while (verificador==false) {
            System.out.println("Ingrese el peso en Kg del animal");
            Es=teclado.nextLine();

            try { 
                Ei=Float.parseFloat(Es);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero");
            } 
        }
        return Ei;
    }

    public static int tiempoGestion(){
        Scanner teclado=new Scanner(System.in);
        String Es;
        int Ei=0;
        boolean verificador=false;

        while (verificador==false) {
            System.out.println("Ingrese el tiempo de gestion del animal");
            Es=teclado.nextLine();

            try { 
                Ei=Integer.parseInt(Es);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return Ei;
    }

    public static String colorP(){
        Scanner teclado=new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese el color del felino");
        nombre=teclado.nextLine();
        return nombre;
    }

    public static int inteligenciaLV(){
        Scanner teclado=new Scanner(System.in);
        String Es;
        int Ei=0;
        boolean verificador=false;

        while (verificador==false) {
            System.out.println("Ingrese el nivel de inteligencia del primate");
            Es=teclado.nextLine();

            try { 
                Ei=Integer.parseInt(Es);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return Ei;
    }
}
