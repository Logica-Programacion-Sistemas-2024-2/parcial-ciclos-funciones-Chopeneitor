
package parcial1g1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        // Implementar la logica de solucion
        int numUsuarios = 0;
        float metrosRecorridos = 0;
        double gasolinaConsumida = 0; 
        float kilometros = 0;
        double litrosAcumulados = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuantos vehiculos participaron: ");
        numUsuarios = sc.nextInt();

        for(int i = 1; i <= numUsuarios; i++){
            System.out.println("Ingrese la cantidad de metros recorridos por el vehiculo " + i);
            metrosRecorridos = sc.nextFloat();
            
            kilometros = metrosRecorridos / 1000;
            
            gasolinaConsumida = calcularConsumoGasolina(kilometros);

            litrosAcumulados += gasolinaConsumida;

            System.out.println("Vehiculo " + i + ": " + kilometros + "km -> " + gasolinaConsumida + " litros de gasolina");          

            if (metrosRecorridos < 0) {
                break;
            }
        }
        System.out.println("Total de gasolina consumida por los " + numUsuarios + " vehiculos: " + litrosAcumulados);
    }

    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float kmRecorrido){
        try {
            return ((kmRecorrido * 55) / 750);

        } catch (Exception e) {
            return -1;
        }         
        
    }
    //------------------------------------------------------------------

}
