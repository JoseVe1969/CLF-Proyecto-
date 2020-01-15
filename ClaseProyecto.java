import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
            while(true){
            System.out.println("Cual es tu nombre? ");
            String nombre = consola.next();
            System.out.println("*******************************");
            System.out.println("  Bienvenido/a, " + nombre + "!"); 
            System.out.println(" tu conocimiento será puesto   ");
            System.out.println("         a prueba.             ");
            System.out.println("  Necesitas un 60% para pasar. ");
            System.out.println("           Suerte!             "); 
            System.out.println("*******************************");
            System.out.println("Para responder ingresa la opción correspondiente y presiona ENTER."); 
            System.out.println("Estás listo/a? S/N");
            String listo = consola.next();
            if(listo.equalsIgnoreCase("S")){
                ClaseProyecto.preguntas(); //Llamar los metodos correspondientes de la otra clase. 
            }
            else if(listo.equalsIgnoreCase("N"))
                System.exit(0);
            
            //Preguntar por otros usuarios que deseen tomar la prueba.
            System.out.println(" "); 
            System.out.println("Hay alguien más esperando a tomar la prueba? S/N");
            String siguiente = consola.next();
            if(siguiente.equalsIgnoreCase("S"))
                continue; 
            else if(siguiente.equalsIgnoreCase("N"))
                break; 
            } 
    }
} 
