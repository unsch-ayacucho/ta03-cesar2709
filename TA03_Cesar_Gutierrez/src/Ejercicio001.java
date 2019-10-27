import java.util.Scanner;

public class Ejercicio001 {
    public static void main(String[] args) {
        
        //INICIAMOS EL ARREGLO
        int numero [] = new int [100];
        
        /*usamos un for donde que el valor inicial sea cero y menor que 100, teniendo una sentencia
          aleatoria de 20 numeros */
        for(int i = 0; i < 100; i++){
            numero[i] = (int)(Math.random()*21);
         System.out.print(numero[i] + "  ");
        }
        
        /*Ahora ingresamos un numero que se encuentre en pantalla para poder sistuirla con otro numero*/
        
        Scanner VALOR = new Scanner(System.in);
        System.out.println("\n SUSTITUIMOS DICHOS NUMEROS");
        System.out.println("\n Introduzca un numero que se muestra en la pantalla:");
        int VAlOR1 = VALOR.nextInt();
        System.out.println("Introduzca un numero por cual desea sustituir:");
        int VAlOR2 = VALOR.nextInt();
         
        //usando la estructura de control
        for(int i = 0;i<100;i++){
            if(numero[i]== VAlOR1){
                numero[i]=VAlOR2;
                System.out.print("\" " + numero[i] + "\"  ");                
            }
            else{
                System.out.print(numero[i] + "  ");
            }            
        } 
        System.out.println();
    }
   
}
    

