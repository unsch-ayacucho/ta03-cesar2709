import java.util.Scanner;

public class Ejercicio002 {
    public static void main(String[] args) {
        
         // declarando e inicializando el arreglo 
        int numero []  = new int[10];
        int resultado [] = new int [10];
        
        // declarando e inicializando dichas variables
        int cont = 0;
        int cont_lista = 0;
        int primo = 0;
        int prueba = 0;
                
        //Creando la clase Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Pidiendo al usario 10
        System.out.println("INGRESE 10 NUMEROS: ");
        
        //Usando la estructura control
        for(int i = 0 ; i<10;i++){
            numero[i] = teclado.nextInt();
        }
        
        System.out.println("**************************************************");
        System.out.println("Índice\tValor");
        // MOSTRANDO LA LISTA DE NUMEROS
        for(int i =0;i<10;i++){
             System.out.println(i + "\t" + numero[i]);           
        }
        
        // INDICANDO AL USUARIO QUE ESCRIBA EL INDICE DEL NUMERO               
        for(int i = 0;i<10;i++){
            do{
                primo++;
                prueba=numero[i]%primo;
                if(prueba==0){
                    cont++;
                }
            }while(primo!=numero[i]);
            
            if (cont!=2){
            resultado[cont_lista]=numero[i];
            cont++;
            }
        cont = 0;
        primo=0;
        
        }// final de for
        
        // ahora ponemos en la lista los que quedan
        
        for(int i =0;i<10;i++){
            do{
                primo++;
                prueba=numero[i]%primo;
                
                if(prueba==0){
                    cont++;                    
                }
            }
            while(primo!=numero[i]);
            
            if(cont==2){
                resultado[cont_lista]=numero[i];
                cont_lista++;
                        
            }
            cont=0;
            primo=0;
         }
        
        System.out.println("\n Lista final");
        ////////////////////////
        System.out.println("Índice \t Valor");
        //MOSTRANDO LA LISTA RESULTANTE
        for(int i =0;i<10;i++){
            System.out.println(i + "\t" + resultado[i]);
        }
    }
}
