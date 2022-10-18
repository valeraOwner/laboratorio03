package laboratorio3;
import java.util.*;
public class DemoBatalla {

	public static void main (String[]args) {
		Nave[]misNaves=new Nave[4];
		Scanner sc=new Scanner(System.in);
		String nomb, col;
		int fil, punt;
		boolean est;
		
		for(int i=0;i<misNaves.length;i++) {
			System.out.println("\nNave "+(i+1));
			System.out.print("Nombre: ");
			nomb=sc.next();
			System.out.print("Fila: ");
			fil=sc.nextInt();
			System.out.print("Columna: ");
			col=sc.next();
			System.out.print("Estado: ");
			est=sc.nextBoolean();
			System.out.print("Puntos ");
			punt=sc.nextInt();
			
			
			misNaves[i]=new Nave();
			
			misNaves[i].setNombre(nomb);
			misNaves[i].setFila(fil);
			misNaves[i].setColumna(col);
			misNaves[i].setEstado(est);
			misNaves[i].setPuntos(punt);			
		}
		
		System.out.println("\nNaves Creadas");
		mostrarNaves(misNaves);
		mostrarPorNombre(misNaves);
		mostrarPorPuntos(misNaves);
		System.out.println("\nNave con mayor numero de puntos: "+mostrarMayorPuntos(misNaves).getNombre());
		
	}
	//Metodo para mostrar todas las naves
	public static void mostrarNaves(Nave[] flota) {
		for(Nave datos: flota) {
			System.out.println("- "+datos.getNombre());
		}
	}
	//Metodo para mostrar todas las naves de un nombre que se le pide por teclado
	public static void mostrarPorNombre(Nave[] flota) {
		Scanner scan =new Scanner(System.in);
		System.out.println("\nBuscar nave");
		System.out.println("Ingrese nombre de Nave: ");
		String nombre=scan.next();
		
		for(int i=0;i<flota.length;i++) {
			if(flota[i].getNombre().equals(nombre)) {
				System.out.println("- "+flota[i].getNombre()+": Fila-"+flota[i].getFila()+", Columna-"+flota[i].getColumna()
						+", Puntos-"+flota[i].getPuntos());
			}
		}
	
	}
	//Metodo para mostrar todas las naves con un numero de puntos inferior o igual
	//al numero de puntos que se le pide por teclado
	public static void mostrarPorPuntos(Nave[] flota) {
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("\nNaves por puntaje");
		System.out.println("Ingrese puntos Maximos: ");
		int pMax=teclado.nextInt();
		System.out.println("\nNaves:");
		
		for(int i=0;i<flota.length;i++) {
			if(flota[i].getPuntos()<=pMax) {
				System.out.println(flota[i].getNombre()+", Puntos-"+flota[i].getPuntos());
			}
		}
		
	}
	//Metodo que devuelve la Nave con mayor numero de puntos
	public static Nave mostrarMayorPuntos(Nave[] flota) {
		int k=0;
		int l=0;
		for(int i=0;i<flota.length;i++) {
			
			if(k<flota[i].getPuntos()) {
				k=flota[i].getPuntos();
				l=i;
			}
		}
		
		return flota[l];
	}
	
}








