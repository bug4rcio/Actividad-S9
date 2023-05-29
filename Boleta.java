/*
Elaborar el siguiente reporte ASCII:
(S09.s1 - Material.pdf)

• Crear la clase Boleta.
• Todos los datos deben estar inicializados.
• Identificar y programar los arreglos paralelos necesarios.
• El programa debe calcular el monto por cada producto, el igv y el importe total.
*/

import java.util.Random;
import java.util.Scanner;

public class Boleta {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        String cajero, cliente;
        int ruc, cantidad;
        double opgravada = 0, igv, monTotal;

        ruc = (int) (Math.random() * 1000000000);
        
        ////////////////////////////////////////////////
        
        System.out.print("Ingresar nombre del(a) cajero(a): ");
        cajero = sc.next();
        
        System.out.print("Nombre del cliente: ");
        cliente = sc.next();
        System.out.println("");
        
        ////////////////////////////////////////////////
        
        System.out.print("Ingresar cantidad de productos que desea comprar: ");
        cantidad = sc.nextInt();
        System.out.println("");
        
        int [] codigo_delProd = new int [cantidad];
        String [] nombre_delProd = new String [cantidad];
        int [] cantidad_delProd = new int [cantidad];
        double [] precio_delProd = new double [cantidad];
        double [] total_delProd = new double [cantidad];
        
        ////////////////////////////////////////////////
        
        for(int i = 0; i < cantidad; i++){
            System.out.println("-> PRODUCTO N°: "+(i+1));
            codigo_delProd[i] = random.nextInt(1000000);
            System.out.println("Nombre: ");
            nombre_delProd[i] = sc.next();
            System.out.println("Precio: ");
            precio_delProd[i] = sc.nextDouble();
            System.out.println("Cantidad: ");
            cantidad_delProd[i] = sc.nextInt();
            System.out.println("");
            
            total_delProd[i] = (precio_delProd[i] * cantidad_delProd[i]);
            opgravada += total_delProd[i];
        }
        
        igv = (opgravada * 0.18);
        monTotal = (opgravada + igv);
        
        ////////////////////////////////////////////////
        
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("             E-Market             ");
        System.out.println("          RUC: 28"+ruc+"         ");
        System.out.println("            Piura, Perú           ");
        System.out.println("");
        System.out.println("        RESUMEN DE COMPRAS        ");
        System.out.println("----------------------------------");
        System.out.println("CAJERO: "+cajero);
        System.out.println("----------------------------------");
        for(int i = 0; i < cantidad; i++){
            System.out.println(codigo_delProd[i]+"\t"+nombre_delProd[i]
            +"\n \t"+cantidad_delProd[i]+"  x \t"+precio_delProd[i]+"  =>   "+total_delProd[i]);
            System.out.println("");
        }
        System.out.println("OP. GRAVADA: "+opgravada);
        System.out.println("I.G.V: "+igv);
        System.out.println("IMPORTE TOTAL: S/."+monTotal);
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("CLIENTE: "+cliente);
        System.out.println("----------------------------------");
        System.out.println("");
    } 
}