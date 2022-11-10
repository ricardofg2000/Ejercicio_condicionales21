package unico;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		/* 
		Implementa el juego piedra, papel y tijera. Primero, 
		el usuario 1 introduce su jugada y luego el usuario 2. 
		Si alguno de los usuarios introduce una opción incorrecta, 
		el programa deberá mostrar un mensaje de error.

		Ejemplo 1:

		Turno del jugador 1 (introduzca piedra, papel o tijera): papel
		Turno del jugador 2 (introduzca piedra, papel o tijera): papel
		Empate
		Ejemplo 2:

		Turno del jugador 1 (introduzca piedra, papel o tijera): papel
		Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
		Gana el jugador 2
		Ejemplo 3:

		Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
		Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
		Gana el jugador 1		 
		*/

		Scanner leer = new Scanner(System.in);
				
		String rjugador1;
		String rjugador2;
		String mensaje = null;
				
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
		rjugador1 = leer.nextLine();
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
		rjugador2 = leer.nextLine();
				
		
		switch (rjugador1) {
			case "piedra":
				switch (rjugador2) {
					case "piedra": mensaje = "Empate";
					case "tijeras": mensaje = "Gana el jugador 2";
					case "papel": mensaje = "Gana el jugador 1";
					default:mensaje = "Error";
					break;
				}
			case "tijeras":
				switch (rjugador2) {
					case "piedra": mensaje = "Gana el jugador 2";
					case "tijeras": mensaje = "Empate";
					case "papel": mensaje = "Gana el jugador 1";
					default:mensaje = "Error";
					break;
				}
			case "papel":
				switch (rjugador2) {
					case "piedra": mensaje = "Gana el jugador 1";
					case "tijeras": mensaje = "Gana el jugador 2";
					case "papel": mensaje = "Empate";
					default:mensaje = "Error";
					break;
				}
			default:mensaje = "Error";
			break;
		}
				
		System.out.println(mensaje);
				

	}

}
