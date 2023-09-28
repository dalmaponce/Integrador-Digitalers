import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.reverseOrder;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        /* Ejercicio 1
         * Hacer un programa que solicite una nota al usuario y dependiendo de la misma imprimir
         * por pantalla, la nota y el detalle siguiente:
        -Insuficiente: 0 - 3
        -Suficiente: 4
        -Bien: 5 y 6
        -Notable: 7 y 8
        -Sobresaliente: 9 y 10*/

        System.out.println("Ingrese una nota");
        int nota = leer.nextInt();

        switch (nota) {

            case 0,1,2,3:

                System.out.println("Insuficiente");
                break;

            case 4:

                System.out.println("Suficiente");
                break;

            case  5, 6:

                System.out.println("Bien");
                break;

            case 7, 8:

                System.out.println("Notable");
                break;

            case 9, 10:

                System.out.println("Sobresaliente");
                break;

            default:

                System.out.println("Ingrese una nota valida");
        }

        System.out.println("{--------------------------------------}");

        /* Ejercicio 2
        * Hacer un programa que solicite al usuario un número entre 0 y 9.999 e imprimir
        * por pantalla cuántas cifras tiene este número.
        Si el valor ingresado por el usuario es menor a cero o mayor a 9.999 deberá informar
        * que no pertenece al rango solicitado.*/

        System.out.println("Ingrese un número entre 0 y 9999");
        int num = leer.nextInt();

        if (num >= 0 && num <= 9999) {

            int cifras = Integer.toString(num).length();
            System.out.println("El numero " + num + " cuenta con " + cifras + " cifras.");

        } else {

            System.out.println("El numero no pertenece al rango solicitado");

        }

        System.out.println("{--------------------------------------}");

        /* Ejercicio 3
        * Hacer un programa que solicite al usuario 5 números y los ordene de mayor a menor
        * y lo mismo pero que ordene de menor a mayor. (Impreso por consola)*/

        Double[] nums = new Double[5];

        System.out.println("Ingrese cinco numeros");
        for (int i = 0; i < 5; i++) {

            nums[i] = leer.nextDouble();
        }

        Arrays.sort(nums);
        System.out.println("Numeros de menor a mayor");
        for (int i = 0; i < 5; i++) {

            System.out.print(nums[i] +", ");
        }
        System.out.println("");

        Arrays.sort(nums, reverseOrder());
        System.out.println("Numeros de mayor a menor");
        for (int i = 0; i < 5; i++) {

            System.out.print(nums[i] + ", ");
        }
        System.out.println("");

        System.out.println("{--------------------------------------}");

        /* Ejecicio 4
        Hacer un programa que solicite al usuario un número de 3 dígitos e imprimir por consola
         TODOS los valores PARES desde el cero hasta el número ingresado.
        * */

        int numer = 0;

        do {

            System.out.println("Ingrese un numero de tres cifras");
            numer = leer.nextInt();

        }while (numer < 100 || numer > 999);

        System.out.println("Los numeros pares entre 0 y " + numer + " son:");
        for (int i = 0; i <= numer; i++) {

            if( i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("");


        System.out.println("{--------------------------------------}");

        /*Ejercicio 5
        Hacer un programa que solicite al usuario un número N, introducir N sueldos e imprimir por pantalla:
        -El sueldo más alto
        -El sueldo más bajo
        -El promedio de TODOS los sueldos ingresados
        * */

        int n = 0;
        System.out.println("Ingrese la cantidad de sueldos a comparar");
        double[] sueldos = new double[n = leer.nextInt()];

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese el sueldo numero " + (i+1));
            sueldos[i] = leer.nextDouble();
        }

        double alto = sueldos[0];
        for (int i = 1; i < sueldos.length; i++) {

            if (sueldos[i] > alto) {

                alto = sueldos[i];
            }
        }
        System.out.println("El sueldo más alto es: $" + alto);

        double bajo = sueldos[0];
        for (int i = 1; i < sueldos.length; i++) {

            if (sueldos[i] < bajo) {

                bajo = sueldos[i];
            }
        }
        System.out.println("El sueldo más bajo es: $" + bajo);

        double suma = 0;
        for (int i = 0; i < sueldos.length; i++) {

            suma = suma + sueldos[i];
        }

        double promedio = suma / sueldos.length;
        System.out.printf("El promedio de todos los sueldos ingresados es: "+ promedio);

    }
}