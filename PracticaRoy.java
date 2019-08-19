package roy;

import java.util.Scanner;

/**
 * @author Roy Maestre
 * Elabore un programa de computador que lea dos números enteros de tres 
 * dígitos y que determine e imprima el mensaje apropiado si ambos números
 * terminan en el mismo dígito.
 */
public class PracticaRoy {

    public static void main(String[] args) {
        int num1=0, num2=0, uDig1, uDig2;       //Declaro variables para ambos numeros y sus ultimos digitos. Por alguna razon Java me obliga a inicializar los numeros.
        Scanner leer = new Scanner(System.in);  //Se crea un objeto para leer datos ingresados.
        while(true){                            //Se usa un ciclo while para garantizar que se ingresa un numero de tres cifras
            System.out.println("Escriba un numero de tres cifras numero: ");
            try{                                //Se usa Try/Catch para evitar eerores al ingresar datos no numericos enteros.
                num1 = leer.nextInt();          //Se lee el numero entero
            }catch(java.util.InputMismatchException e){  //Se atrapa la excepcion para evitar error
                leer.next();                //Aparentemente esto es necesario para el funcionamiento del Try/Catch, creo que limpia el error en el comando de lectura.
                System.out.print("Debe ser un numero entero y ");
            }
            if(num1>=100 && num1<=999)          //Si esta entre 100 y 999 tiene tres cifras
                break;                          //Si se ingresa correctamente se rompe el ciclo.
            else                                //Si no tiene tres cifras se da el mensaje y vuelve a preguntar por el numero.
                System.out.println("Debe tener tres cifras.");    
        }
        while(true){                            //Proceso igual que el del primer numero
            System.out.println("Escriba otro numero de tres cifras numero: ");
            try{
            num2 = leer.nextInt();
            }catch(java.util.InputMismatchException e){
                leer.next();
                System.out.print("Debe ser un numero entero y ");
            }
            if(num2>=100 && num2<=999)
                break;
            else
                System.out.println("Debe tener tres cifras.");
        }
        uDig1 = num1%10;                        //Se almacena el ultimo dijito de cada numero en su respectiva variable.
        uDig2 = num2%10;
        if(uDig1 == uDig2)                      //Si sus ultimos digitos son iguales da su respectivo mensaje
            System.out.println("Los ultimos digitos de " + num1 + " y " + num2 + " son iguales!");
        else                                    //Sino... tambien.
            System.out.println("Los ultimos digitos de " + num1 + " y " + num2 +" son diferente :(");
             
    }
    
}
