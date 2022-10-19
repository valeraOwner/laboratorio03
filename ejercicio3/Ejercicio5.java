//Laboratorio Nro03 - Ejercicio3
//Autores:
//Michael Hurtado
//Jeanpier Valera
//Maicol Suma
//Gabriela Borda
//Tiempo: 150 minuto
import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Ejercito> ejercito01 = new ArrayList<Ejercito>();
        ArrayList<Ejercito> ejercito02 = new ArrayList<Ejercito>();
        int soldEjer01 = inicializarEjercito(ejercito01);
        int soldEjer02 = inicializarEjercito(ejercito02);
        System.out.println("EJERCITO 01:");
        mostrarEjercito(ejercito01);
        System.out.println("EJERCITO 02:");
        mostrarEjercito(ejercito02);
        if (soldEjer01 < soldEjer02)
            System.out.println(">> El ganador es el Ejercito 02 <<");
        else if (soldEjer01 > soldEjer02)
            System.out.println(">> El ganador es el Ejercito 01 <<");
        else
            System.out.println(">> Empate <<");
    }
    public static int inicializarEjercito(ArrayList<Ejercito> ejercito) {
        int cant = (int)(Math.random()*5+1);
        Ejercito aux;
        for (int i = 0; i < cant; i++){
            aux = new Ejercito("Soldado"+(i+1));
            ejercito.add(aux);
        }
        return cant;
    }
    public static void mostrarEjercito(ArrayList<Ejercito> ejercito){      
        for(int i = 0; i< ejercito.size(); i++)
            System.out.println(ejercito.get(i));                 
    }
}
