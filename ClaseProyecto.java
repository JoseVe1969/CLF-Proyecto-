import java.util.*;
public class ClaseProyecto {
    public static final int NUM_PREGUNTAS = 10;
    public static void preguntas(){
        Scanner consola = new Scanner(System.in);
        int porcentaje = 0; //Variable que inicia la calificacion del usuario.
         //Cambiar numero de preguntas si se incrementa o reduce el numero de estas. 
        //Primera pregunta
        System.out.println("Cual es la capital de los Estados Unidos? ");
        System.out.println("A. Los Angeles.");
        System.out.println("B. Boston.");
        System.out.println("C. Washington D.C."); 
        System.out.println("D. Texas.");
        System.out.println("Respuesta: "); 
        String respuesta1 = consola.next();
        if(respuesta1.equalsIgnoreCase("C")){
            System.out.println("Correcto!");
            System.out.println(" ");
            porcentaje++; //La calificacion incrementa si la condicion se cumple. 
        }
        else if(!respuesta1.equalsIgnoreCase("C")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        }
        
        //Segunda pregunta
        System.out.println("Cual es la capital de Mexico? ");
        System.out.println("A. D.F.");
        System.out.println("B. Guanajuato.");
        System.out.println("C. Chiapas.");
        System.out.println("D. Guerrero.");
        System.out.println("Respuesta: ");
        String respuesta2 = consola.next(); 
        if(respuesta2.equalsIgnoreCase("A")){
            System.out.println("Muy bien!");
            System.out.println(" "); 
            porcentaje++;
        }
        else if(!respuesta2.equalsIgnoreCase("A")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
            
        //Tercera pregunta
        System.out.println("Cual es la capital de Argentina? ");
        System.out.println("A. Caracas."); 
        System.out.println("B. Brasiliia.");
        System.out.println("C. Pekin ");
        System.out.println("D. Buenos Aires");
        System.out.println("Respuesta: "); 
        String respuesta3 = consola.next();
        if(respuesta3.equalsIgnoreCase("D")){
            System.out.println("Correcto!");
            System.out.println(" ");
            porcentaje++;
        }
        else if(!respuesta3.equalsIgnoreCase("D")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
            
        //Cuarta pregunta
        System.out.println("Cual es la capital de Venezuela? ");
        System.out.println("A. Tirana.");
        System.out.println("B. Caracas.");
        System.out.println("C. Luanda."); 
        System.out.println("D. Sonora.");
        System.out.println("Respuesta: "); 
        String respuesta4 = consola.next();
        if(respuesta4.equalsIgnoreCase("B")){
            System.out.println("Correcto!");
            System.out.println(" ");
            porcentaje++;
        }
        else if(!respuesta4.equalsIgnoreCase("B")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
        
        //Quinta pregunta
        System.out.println("Cual es la capital de Austria? ");
        System.out.println("A. Tijuana.");
        System.out.println("B. Madrid.");
        System.out.println("C. Viena");
        System.out.println("D. Roma.");
        System.out.println("Respuesta: ");
        String respuesta5 = consola.next();
        if(respuesta5.equalsIgnoreCase("C")){
            System.out.println("Correcto!");
            System.out.println(" ");
            porcentaje++;
        }
        else if(!respuesta5.equalsIgnoreCase("C")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
            
        //Sexta pregunta
        System.out.println("Cual es la capital de España? ");
        System.out.println("A. Madrid.");
        System.out.println("B. Barcelona.");
        System.out.println("C. Valencia.");
        System.out.println("D. Granada.");
        System.out.println("Respuesta: ");
        String respuesta6 = consola.next(); 
        if(respuesta6.equalsIgnoreCase("A")){
            System.out.println("Muy bien!");
            System.out.println(" "); 
            porcentaje++;
        }
        else if(!respuesta6.equalsIgnoreCase("A")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
        
        //Septima pregunta
        System.out.println("Cual es la capital de Italia? "); 
        System.out.println("A. Roma.");
        System.out.println("B.Turin" );
        System.out.println("C. Milan");
        System.out.println("D. Dublin");
        System.out.println("Respuesta: ");
        String respuesta7 = consola.next(); 
        if(respuesta7.equalsIgnoreCase("A")){
            System.out.println("Correcto!");
            System.out.println(" "); 
            porcentaje++;
        }
        else if(!respuesta7.equalsIgnoreCase("A")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
        
        //Octava pregunta
        System.out.println("Cual es la capital de Francia? ");
        System.out.println("A. Versailles.");
        System.out.println("B. Campeche.");
        System.out.println("C. Ottawa.");
        System.out.println("D. París.");
        System.out.println("Respuesta: ");
        String respuesta8 = consola.next(); 
        if(respuesta8.equalsIgnoreCase("D")){
            System.out.println("Muy bien!");
            System.out.println(" "); 
            porcentaje++;
        }
        else if(!respuesta8.equalsIgnoreCase("D")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
            
        //Novena pregunta
        System.out.println("Cual es la capital de Canadá? ");
        System.out.println("A. Elon Musk.");
        System.out.println("B. Ottawa");
        System.out.println("C. Waterloo");
        System.out.println("D. Vancouver");
        System.out.println("Respuesta: ");
        String respuesta9 = consola.next(); 
        if(respuesta9.equalsIgnoreCase("B")){
            System.out.println("Correcto!");
            System.out.println(" "); 
            porcentaje++;
        }
        else if(!respuesta9.equalsIgnoreCase("B")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
        
        //Decima pregunta
        System.out.println("Cual es la capital de Bélgica? ");
        System.out.println("A. Lille.");
        System.out.println("B. Bruselas.");
        System.out.println("C. Amberes.");
        System.out.println("D. Luxemburgo.");
        System.out.println("Respuesta: ");
        String respuesta10 = consola.next(); 
        if(respuesta10.equalsIgnoreCase("B")){
            System.out.println("Correcto!");
            System.out.println(" "); 
            porcentaje++;
        }
        else if(!respuesta10.equalsIgnoreCase("B")){
            System.out.println("Incorrecto");
            System.out.println(" ");
        } 
              
        //Presentar resultados al usuario.
        int resultados = (porcentaje * 100) / NUM_PREGUNTAS;  
        System.out.println("Has obtenido un " + resultados + "%.");
        if(resultados <= 59)
            System.out.println("No has podido pasar la prueba. Vuelve a intentar.");
        else if(resultados >= 60)
            System.out.println("Felicidades! Tu puntuación ha sido satisfactoria.");          
    }
} 
