package reto12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Reto12 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int numeroKm; 
        int nivelVidaCaballo = 0;
        int nivelVidaUsuario = 100;
        int kmrecorrido = 0; 
        int opcion = 0;
        System.out.println("ingrese la cantidad de km a recorrer. ");
        numeroKm = Integer.parseInt(entrada.readLine()); 
        System.out.println("ingrese el nivel de vida del caballo. ");
        nivelVidaCaballo = Integer.parseInt(entrada.readLine()); 
        
        Random aleatorio = new Random(System.currentTimeMillis());
        for(int kmActual = 0; kmActual <= numeroKm; kmActual++){
            System.out.println("El caballo esta en el km " + kmActual);
            
            if(kmrecorrido == 5){
                kmrecorrido = 0;  
                opcion = aleatorio.nextInt(4) + 1;
                switch(opcion){
                    case 1:
                        nivelVidaUsuario += 10; 
                        System.out.println("--- Encontramos un paquete de vida ---");
                        System.out.println("--- +10 puntos al usuario ---");
                    break;
                    case 2:
                        nivelVidaUsuario -= 5; 
                        nivelVidaCaballo -= 5; 
                        System.out.println("--- Encontramos una bomba ---");
                        System.out.println("--- - 5 puntos al usuario ---");
                        System.out.println("--- - 5 puntos al caballo ---");
                    break; 
                    case 3: 
                        nivelVidaUsuario += 10; 
                        System.out.println("--- Encontramos un paquete de vida ---");
                        System.out.println("--- +10 puntos al usuario ---");
                    break; 
                    case 4: 
                        nivelVidaCaballo -= 5; 
                        System.out.println("--- Encontramos una bomba ---");
                        System.out.println("--- - 5 puntos al caballo ---");
                    break;
                    default: 
                        break;
                }
                
                
            }else{
                opcion = aleatorio.nextInt(3) + 1;
                if (opcion == 1){
                    nivelVidaUsuario += 10; 
                    System.out.println("--- Encontramos un paquete de vida ---");
                    System.out.println("--- +10 puntos al usuario ---");
                }else if(opcion == 2){
                    nivelVidaUsuario -= 5; 
                    nivelVidaCaballo -= 5; 
                    System.out.println("--- Encontramos una bomba ---");
                    System.out.println("--- - 5 puntos al usuario ---");
                    System.out.println("--- - 5 puntos al caballo ---");
                }
            }
            kmrecorrido++;
            if(nivelVidaUsuario == 0 || nivelVidaCaballo == 0 ){
                System.out.println("--- se acabo el juego ---");
                break;
            } 
        }
    }
    
}
