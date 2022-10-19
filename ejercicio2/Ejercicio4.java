//Laboratorio Nro03 - Ejercicio2
//Autores:
//Michael Hurtado
//Jeanpier Valera
//Maicol Suma
//Gabriela Borda
//Tiempo: 150 minutos
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String nomb,niv;
        soldado listaSoldados[]=new soldado [5];
                
        for(int i=0;i<listaSoldados.length;i++){    
            listaSoldados[i] = new soldado();
        	System.out.println("\nSoldado "+(i+1));
		    System.out.print("Nombre: ");
		    nomb=sc.next();
		    System.out.print("nivel de salud ");
		    niv=sc.next();
                           
                        
			listaSoldados[i].setNombre(nomb);
			listaSoldados[i].setNivelDeVida(niv);
        }   
    
        for(int i=0;i<listaSoldados.length;i++){   
        	System.out.println("\nSoldado "+(i+1));
		System.out.print("Nombre: "+listaSoldados[i].getNombre());
		System.out.print("nivel de salud: "+listaSoldados[i].getNivelDeVida());
        }
    }
}
