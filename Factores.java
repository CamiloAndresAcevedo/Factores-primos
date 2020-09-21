package Laboratorios;

import java.util.Scanner; //clase utilizada para obtener la entrada de scanner.

//Programa que descompone numeros en factores primos.
//Creado por Camilo Andres Acevedo.
//Inspirado en https://www.youtube.com/watch?v=E8Y8H8ZVAvQ

public class Factores {

	public static void main(String[] args) {
		int  factor; // int para nuestra funcion factor
		
		Scanner entrada = new Scanner (System.in); //objeto para recibir entradas por parte del usuario
		System.out.print("Ingrese numero que desea descomponer: \n"); //Se pide al usuario ingresar el número a descomponer
		int numero = entrada.nextInt(); //Definimos el valor del int dado por el usuario.
		
		for (factor=2; factor<=numero; factor ++) { //Ciclo de ejecucion de nuestras funciones.
			while (numero%factor==0){ //Ciclo de ejecucion de la descomposicion
				System.out.println(numero + " | " + factor); //Se imprime el resultado de la descomposicion.
				numero/=factor; //Vamos diviendo el valor en el numero primo hasta llegar a nuestro final.
			}
		}

	}

}
