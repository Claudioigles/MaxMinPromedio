import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int numeros [],alumnos;

        System.out.println("Ingrese la cantidad de alumnos: ");
        alumnos=entrada.nextInt();

        numeros= new int [alumnos];

        //cargo el arreglo
        System.out.println("Ingrese los numeros deseados: ");
        for (int i=0; i< numeros.length;i++){
            numeros[i]= entrada.nextInt();


        }

        //Muestro los numeros ingresados
        //Para que no quede un "-" de mas
        boolean primero=true;
        for (int i:numeros){
            if (primero){
                System.out.print(i);
                primero = false;
            }else{
                System.out.print("-"+i);
            }


        }

        /*// Muestro el mayor
        int mayor=numeros[0];
        int menor=numeros[0];

        for (int i=0; i<numeros.length;i++){

            if(numeros[i]>=mayor){
                mayor= numeros[i];
            }
            if (numeros[i]<=menor){
                menor=numeros[i];
            }
        }
        System.out.println("El mayor numero es: "+mayor+"y el minimo: "+menor);
*/
        // Muestro el mayor
        int mayor=0;
        int menor=0;

        for (int i=0; i<numeros.length;i++){
            int num= numeros[i];// Voy guardando los numeros en esta variable de acuerdo a las posiciones
            if(num>=mayor || i==0){   // si el numero es mayor o si el contador es el primero
                mayor= num;
            }
            if (num<=menor|| i==0){
                menor=num;
            }
        }
        System.out.println("El mayor numero es: "+mayor+"y el minimo: "+menor);


        // Calculo el promedio
        float suma=0, promedio;
        for (int i =0; i<numeros.length;i++){
            suma+= numeros[i];

        }
        //Muestro Promedio
        System.out.println("La suma es: "+ suma);
        promedio= suma /numeros.length;
        System.out.println("El promedio es: "+ promedio);

    }
}