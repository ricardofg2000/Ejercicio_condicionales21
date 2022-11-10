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
				
		if(rjugador1 != "papel" || rjugador1 != "tijera" || rjugador1 != "piedra") {
			mensaje = "Error";
		}
					
		if(rjugador2 != "papel" || rjugador2 != "tijera" || rjugador2 != "piedra") {
			mensaje = "Error";
		}
					
				
		if (rjugador1.equals("papel") && rjugador2.equals("papel")) {
			mensaje = "Empate";
		}
				
		if (rjugador1.equals("papel") && rjugador2.equals("tijera")) {
			mensaje = "Gana el jugador 2";
		}
				
		if (rjugador1.equals("papel") && rjugador2.equals("piedra")) {
			mensaje = "Gana el jugador 1";
		}
				
		if (rjugador1.equals("piedra") && rjugador2.equals("papel")) {
			mensaje = "Gana el jugador 2";
		}
				
		if (rjugador1.equals("piedra") && rjugador2.equals("tijera")) {
			mensaje = "Gana el jugador 1";
		}
				
		if (rjugador1.equals("piedra") && rjugador2.equals("piedra")) {
			mensaje = "Empate";
		}
				
		if (rjugador1.equals("tijera") && rjugador2.equals("papel")) {
			mensaje = "Gana el jugador 1";
		}
				
		if (rjugador1.equals("tijera") && rjugador2.equals("tijera")) {
			mensaje = "Empate";
		}
				
		if (rjugador1.equals("tijera") && rjugador2.equals("piedra")) {
			mensaje = "Gana el jugador 2";
		}			
				
				
		System.out.println(mensaje);
				

	}

}
