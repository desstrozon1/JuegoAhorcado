/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ahorcado;

import java.util.Scanner;


/**
 *
 * @author desst
 */
public class Principal extends Letras {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Ahorcado clase_Ahorcado = new Ahorcado();
		//Numero de errores acomulados
		int errores = 0;
		// Declaramos la letra que nos van a pedir
		String letra ="";
		//declaramos una cadena con los ----
		String cadenaAciertos = clase_Ahorcado.rellenarCaracteres();
		char[] caracteres=cadenaAciertos.toCharArray();
                String cadena = clase_Ahorcado.getAhorcado();
                
		//Pedimos las distintas letras
		while (errores <=clase_Ahorcado.erroresPermitidos ){
			//mientras que errores acomulados sean menor o igual que 6 se le irá pidiendo cosas
			System.out.println("Introduzca una letra:");
			letra = scanner.next().toLowerCase();
			// comprobar que la letra no haya sido introducida antes
			
			// preguntamos si la cadena contiene la letra introducida
			if(cadena.contains(letra)) {				
                buscarLetra(cadena, letra, caracteres);
				
				cadenaAciertos=String.valueOf(caracteres);
				//mostramos la variable cadenaAciertos para que vea que letras tiene acertadas
				System.out.println(cadenaAciertos);
				if(aciertosLetras(cadenaAciertos, cadena)) break;
			}else { // ha fallado
				// aumentamos los errores en 1
				errores++;
				System.out.println("Esa letra no es correcta, llevas: " + errores + " errores.");

			}
		}
        erroresLetra(errores, cadena);
		System.out.print(clase_Ahorcado.toString());
	}

}
