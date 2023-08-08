/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradora;

import java.util.Scanner;

/**
 *
 * @author Jhoel
 */
public class ExtrasG1 {

    private static Scanner leer = new Scanner(System.in);

    public static void calcMin() {
        System.out.println("Ingrese la cantidad de minutos a convertir");
        int min = leer.nextInt();
        double dias = Math.abs(min / 1440);
        double horas = (min / 60);
        while (horas >= 24) {
            horas -= 24;
        }
        System.out.println("Los minutos equivalen a: " + dias + " dias y " + horas + " horas");
    }

    public static void varAlfabe(int A, int B, int C, int D) {
        System.out.println("Valores:"
                + "A= " + A + ""
                + " // B= " + B + ""
                + " // C= " + C + ""
                + " // D= " + D);
        int X = A;

        A = D;
        D = B;
        B = C;
        C = X;
        System.out.println(" Nuevos Valores:"
                + "A= " + A + ""
                + " // B= " + B + ""
                + " // C= " + C + ""
                + " // D= " + D);
    }

    public static void esVocal() {
        System.out.println("Ingrese un caraacter");
        String letra = leer.next();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println(" No es Vocal");
        }
    }

    public static void numRoman() {
        int num;
        do {
            System.out.println("Ingrese un numero entre el 1 y el 10");

            num = leer.nextInt();

        } while (num < 0 || num > 10);
        System.out.println("Su numero en romanos es:");

        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }
    }

    public static void obraSocial() {
        String clase;
        double costo;
        do {
            System.out.println("Ingrese su clase de obra social: A, B o C");
            clase = leer.next();
            System.out.println("Ingrese el costo del tratamiento");
            costo = leer.nextDouble();
            switch (clase) {
                case "A":
                    System.out.println("El costo de la operacion con su descuento es de: " + (costo * 0.5));
                    break;
                case "B":
                    System.out.println("El costo de la operacion con su descuento es de: " + (costo * 0.75));
                    break;
                case "C":
                    System.out.println("Usted no posee ningun tipo de descuento");
                    break;
                default:
                    System.out.println("Ingreso una clase incorrecta, vuelva a intentar");
                    break;
            }
        } while (!clase.equals("A") && !clase.equals("B") && !clase.equals("C"));
    }

    public static void estProm() {
        System.out.println("Ingrese la cantidad de personas que ingresara");
        int N = leer.nextInt();
        double estatura;
        double bajo = 0;
        double sumaBajo = 0;
        double sumaGral = 0;
        double general = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese la altura de la persona " + i);
            estatura = leer.nextDouble();
            if (estatura <= 1.60) {
                bajo++;
                sumaBajo += estatura;

            }
            general++;
            sumaGral += estatura;
        }
        System.out.println("El promedio general de altura de las " + N + " personas es: " + (sumaGral / general) + "m");
        System.out.println("El promedio general de altura de las " + bajo + " personas que no superan los 1.60m es de: " + (sumaBajo / bajo) + "m");
    }

    public static void minMaxProm() {
        System.out.println("Ingrese la cantidad de numeros que ingresara");
        int N = leer.nextInt();
        int aux = 0;
        int num;
        int max;
        int min;
        int suma;
        do {
            System.out.println("Introduzca un numero");
            num = leer.nextInt();
            min = num;
            max = num;
            suma = num;
            if (num < 0) {
                System.out.println("El numero ingresado no es correcto, por favor vuelva a intentarlo");
            }
        } while (num < 0);
        aux++;
        while (N != aux) {
            do {
                System.out.println("Introduzca otro numero");
                num = leer.nextInt();
                if (num < 0) {
                    System.out.println("El numero ingresado no es correcto, por favor vuelva a intentarlo");
                }
            } while (num < 0);
            aux++;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            suma += num;
        }
        System.out.println("El maximo valor ingresado es: " + max);
        System.out.println("El minimo valor ingresado es: " + min);
        System.out.println("El promedio de los " + N + " valores ingresados es: " + (suma / N));
    }

    public static void minMaxProm2() {
        System.out.println("Ingrese la cantidad de numeros que ingresara");
        int N = leer.nextInt();
        int aux = 0;
        int num;
        int max;
        int min;
        int suma;
        do {
            System.out.println("Introduzca un numero");
            num = leer.nextInt();
            min = num;
            max = num;
            suma = num;
            if (num < 0) {
                System.out.println("El numero ingresado no es correcto, por favor vuelva a intentarlo");
            }
        } while (num < 0);
        aux++;
        do {
            do {
                System.out.println("Introduzca otro numero");
                num = leer.nextInt();
                if (num < 0) {
                    System.out.println("El numero ingresado no es correcto, por favor vuelva a intentarlo");
                } 
            }while (num < 0);
            
            aux++;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            suma += num;
            } while (N != aux);
            
                
            

            System.out.println("El maximo valor ingresado es: " + max);
            System.out.println("El minimo valor ingresado es: " + min);
            System.out.println("El promedio de los " + N + " valores ingresados es: " + (suma / N));
        }
    
    

    public static void numPareImpar5() {
        int num;
        int par=0;
        int impar=0;
        int cant=0;
        do {
            System.out.println("ingrese un numero");
            num=leer.nextInt();
            
            if (num>0){
            cant++;
           
           
            if (num%2==0){
               par++;
            } else impar++;}
           
        } while (num%5!=0);
        System.out.println("Cantidad de numeros ingresados "+cant);
        System.out.println("Numeros pares: "+par);
        System.out.println("Numeros impares: "+impar);
    }

    public static void diviResta(){
        int cociente=0;
        int divisor;
        int dividendo;
        do{
            System.out.println("Ingrese el divisor");
            divisor=leer.nextInt();
            System.out.println("Ingrese el dividendo");
            dividendo=leer.nextInt();
            
            if(divisor<0 || dividendo<0){
                System.out.println("Uno de los valores ingresados no es valido, por favor vuelva a intentarlo");
            }
            
        } while (divisor<0 || dividendo<0);
        
        while ( divisor>=dividendo){
            divisor-=dividendo;
            cociente++;
        }
        System.out.println("El cociente de la division es: "+cociente);
        System.out.println("El resto de la division es: " + divisor);
        System.out.println("");
    }
    
//    10. Realice un método para que el usuario adivine el resultado de una multiplicación entre dos
//números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta
//es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su
//respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
//Math.random() de Java.
//    
    
    public static void adivMult(){
        int num;
        int produc = (int)(Math.random()*10) * (int)(Math.random()*10);
        //System.out.println(produc);
        do {
            System.out.println("Adivine el resultado de la multiplicación");
            num=leer.nextInt();
            if(num!= produc){
                System.out.println("incorrecto. Intentalo otra vez!");
            }
        } while (num!= produc);
        System.out.println("Felicitaciones, ha adivinado!");
    }
    
//    11. Escribir un método que lea un número entero y devuelva el número de dígitos que componen
//ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
//Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar
//que las variables de tipo entero truncan los números o resultados.
    
    public static void calcDigi(){
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        int dig=0;
        do{
            num/=10;
            dig++;
        } while (num>10);
        System.out.println("La cantidad de digitos del numero es: "+(dig+1));
    }
    
//    12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0
//al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Crear un método que dé solución a lo propuesto en el enunciado.
    
    public static void contD3(){
//        String aux, aux2;
//        for(int i=0; i<=9; i++){
//            if (i==3){
//                    aux2="E";
//                } else aux2=  Integer.toString(i);
//            for(int j=0; j<=9; j++){
//                if (j==3){
//                    aux="E";
//                } else aux=  Integer.toString(j);
//                for(int k=0; k<=9; k++){
//                    if (k==3){
//                        System.out.println(aux2+"-"+aux+"-E");
//                    } else System.out.println(aux2+"-"+aux+"-"+k);
//                }
//            }
//        }
//    }
    
   
        for(int i=0; i<=9; i++){
            if (i==3){
                  System.out.print("E-");  
                } else System.out.print(i+"-");
            for(int j=0; j<=9; j++){
                if (j==3){
                    System.out.print("E-");
                } else System.out.print(j+"-");
                for(int k=0; k<=9; k++){
                    if (k==3){
                        System.out.print("-E");
                    } else System.out.print(k);
                }
            }
        }
    }

  
    public static void escalerita(){
        System.out.print("Ingrese la altura de la escalera: ");
        int height = leer.nextInt();
        
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void diamant(){
   char input = 'K';
int n = input - 'A' + 1;

int i = 0;
while (i < 2*n-1) {
    int row = i < n ? i : 2*n-2-i;
    int spaces = Math.abs(n-1-row);
    int letters = n - spaces;
    
    int j = 0;
    while (j < spaces) {
        System.out.print(" ");
        j++;
    }
    j = 0;
    while (j < letters) {
        System.out.print((char)('A'+row));
        if (j < letters-1) {
            System.out.print(" ");
        }
        j++;
    }
    System.out.println();
    i++;
}

    }
}