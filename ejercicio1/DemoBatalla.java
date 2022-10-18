
//Laboratorio Nro03 - Ejercicio1
//Autores:
//Michael Steve Hurtado Bejarano	
//Jeanpier Michaelson Valera Yana
//
//
//Tiempo:  1:30 minutos


import java.util.Scanner;
public class DemoBatalla {

	public static void main (String[]args) {
		Nave[]misNaves=new Nave[10];
		Scanner sc=new Scanner(System.in);
		//Variables
		String nomb, col;
		int fil, punt;
		boolean est;
		//FOR para ingresas datos
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
		aleatorio(misNaves);
		
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
		
		//FOR para buscar nave igual al nombre
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
		//FOR para imprimir datos de las naves que cumplan la condicion
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
		//FOR para guardar la nave con mayor numero de puntos
		for(int i=0;i<flota.length;i++) {
			
			if(k<flota[i].getPuntos()) {
				k=flota[i].getPuntos();
				l=i;
			}
		}
		
		return flota[l];
	}
	//Crear un método que devuelva un nuevo arreglo de objetos con todos los objetos previamente ingresados
    //pero aleatoriamente desordenados
    public static void aleatorio(Nave [] flota){
        int cantidad = flota.length;
		//Creación de un segundo arreglo de objetos(aleatorio)
        Nave [] flota2 = new Nave[cantidad];
        //FOR de aleatorios para el nombre
        int i=0;
        flota2[i] = new Nave();
        flota2[i].setNombre(flota[(int) (Math.random()*cantidad)].getNombre());
        for (i=1;i<cantidad;i++){
            flota2[i] = new Nave();
            flota2[i].setNombre(flota[(int) (Math.random()*cantidad)].getNombre());
            for (int j=0;j<i;j++){
                if (flota2[i].getNombre()==flota2[j].getNombre()){  
                    i--;
                }
            }
        }
        //FOR de aleatorios para los puntos
        i=0;
        flota2[i].setPuntos(flota[(int) (Math.random()*cantidad)].getPuntos());
        for (i=1;i<cantidad;i++){
            flota2[i].setPuntos(flota[(int) (Math.random()*cantidad)].getPuntos());
            for (int j=0;j<i;j++){
                if (flota2[i].getPuntos()==flota2[j].getPuntos()){  
                    i--;
                }
            }
        }
        //FOR de aleatorios para las filas
        i=0;
        flota2[i].setFila(flota[(int) (Math.random()*cantidad)].getFila());
        for (i=1;i<cantidad;i++){
            flota2[i].setFila(flota[(int) (Math.random()*cantidad)].getFila());
            for (int j=0;j<i;j++){
                if (flota2[i].getFila()==flota2[j].getFila()){  
                    i--;
                }
            }
        }
        //FOR de aleatorios para las columnas
        i=0;
        flota2[i].setColumna(flota[(int) (Math.random()*cantidad)].getColumna());
        for (i=1;i<cantidad;i++){
            flota2[i].setColumna(flota[(int) (Math.random()*cantidad)].getColumna());
            for (int j=0;j<i;j++){
                if (flota2[i].getColumna()==flota2[j].getColumna()){  
                    i--;
                }
            }
        }
        //FOR de aleatorio para estados
        for (i=0;i<cantidad;i++){
            int rdm = (int) (Math.random()*2);
            if (rdm==1){
                flota2[i].setEstado(false);
            }
            else flota2[i].setEstado(true);
        }
		System.out.println("NAVES COMPLETAMENTE ALEATORIAS: ");
        for (int k=0;k<cantidad;k++){
            System.out.println("- Nave"+k+"\tNombre:"+flota2[k].getNombre()+"\tFila:"+flota2[k].getFila()+
            "\tColumna:"+flota2[k].getColumna()+"\tEstado: "+flota2[k].getEstado()+"\tPuntos: "+flota2[k].getPuntos());
        }
    }
}








