/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 091024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 091024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int opcion; 
		double saldo = 0.0;
		boolean cerrarMenu = false;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		do {
			//Muestro el menú por consola
			mostrarMenu();
			opcion = sc.nextInt();
			//Entro en la opción seleccionada por el usuario
			switch(opcion) {
			case 1:
				System.out.println("Has accedido a la opción para ver el saldo de la cuenta");
				System.out.println("El saldo actual de la cuenta es: " + saldo + "€");
				break;
			case 2:
				System.out.println("Has accedido a la opción para ingresar dinero en la cuenta");
				System.out.println("Introduzca la cantidad que desea ingresar: ");
				double ingreso = sc.nextDouble();
				saldo = saldo + ingreso;
				System.out.println("El ingreso ha sido realizado correctamente y de forma segura");
				break;
			case 3:
				System.out.println("Has accedido a la opción para sacar dinero de la cuenta");
				System.out.println("Introduzca la cantidad que desea retirar: ");
				double retiro = sc.nextDouble();
				saldo = saldo - retiro;
				System.out.println("El retiro ha sido realizado correctamente y de forma segura");
				break;
			case 4:
				System.out.println("Has accedido a la opción para verificar la autenticidad del número de la cuenta");
				System.out.println("Introduzca el número de cuenta: ");
				String numCuenta = sc.next();
				if (numCuenta.matches("\\d+")) {
		            System.out.println("El número de cuenta contiene solo números por lo que es correcto.");
		        } else {
		            System.out.println("El número de cuenta no contiene solo números por lo que no es correcto.");
		            System.out.println("Es aconsejable que se presente en la sucursal más cercana para solucionar el problema.");
		        }
				break;
			case 5:
				cerrarMenu = true;
				System.out.println("Cerrando aplicación...");
				System.out.println("La aplicación ha sido cerrada de forma segura!!!");
				break;
			default:
				System.err.println("La opción seleccionada no es correcta...");
				System.err.println("Inténtelo de nuevo...");
				break;
			}
		}while(!cerrarMenu);

	}
	
	/**
	 * Método que mostrará el menú por consola
	 * rbr - 091024
	 */
	public static void mostrarMenu() {
		System.out.println("----------------------------");
		System.out.println("             MENÚ           ");
		System.out.println("----------------------------");
		System.out.println("1. Saldo de la cuenta");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Sacar dinero");
		System.out.println("4. Número de cuenta");
		System.out.println("5. Cerrar aplicación");
		System.out.println("----------------------------");
		System.out.println("Seleccione la opción que desee: ");
	}

}
