package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

        int num = pedirNumero();

        if (num < 0) {
            System.err.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
        }

        
	}
	
	public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero mayor o igual que 0: ");
        return sc.nextInt();
	}

}