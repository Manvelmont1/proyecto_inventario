package seguimientoarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listas {
    
    private Scanner input;
    private String nombre;
    private String question;
    private String eliminar;
    private String modificar;
    private int precio;
    private int idProducto;
    private int numeroId;
    private int numeroId2;
    boolean bandera;
    boolean bandera2 = true;
    boolean bandera3 = true;
    
    public void array(){
        
        List<claseObjeto> lista = new ArrayList<>();
        input = new Scanner(System.in);
        do{
            bandera = true;
            System.out.println("Ingrese el nombre del producto: ");
            nombre = input.next();
            System.out.println("Digite el precio del producto: ");
            precio = input.nextInt();
            System.out.println("Digite el ID del producto: ");
            idProducto = input.nextInt();
            claseObjeto leer = new claseObjeto(nombre,precio,idProducto);
            lista.add(leer);
            while(bandera == true){
                System.out.println("Desea agregar mas productos? (si/no): ");
                question = input.next();
                if(question.equals("si") || question.equals("no")){
                    bandera = false;
                }
                else{
                    System.out.println("Ingrese si / no");
                    System.out.println(" ");
                    bandera = true;
                }
            } 
        }while(question.equals("si"));
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Producto: "+lista.get(i).name());
            System.out.println("Precio: $"+lista.get(i).price());
            System.out.println("Id: "+lista.get(i).idNum());
            System.out.println(" ");
        }
        
        // Eliminar Producto:
        while(bandera == false){
            
            System.out.println("Desea eliminar algun producto? (si/no): ");
            eliminar = input.next();
            if(eliminar.equals("si")){
                while(bandera2 == true){
                    System.out.println("Ingrese el id del producto "
                            + "a borrar: ");
                    numeroId = input.nextInt();
                    for(int i = 0; i < lista.size(); i++){
                        if(numeroId == lista.get(i).idNum()){
                            lista.remove(i);
                            System.out.println("¡Producto eliminado!");
                            System.out.println(" ");
                            bandera2 = false;
                        }
                    }
                    if(bandera2 == true){
                        System.out.println("¡El Id ingresado No existe!");
                        System.out.println(" ");
                        bandera2 = true;
                    }
                }
                for(int i = 0; i < lista.size(); i++){
                    System.out.println("Producto: "+lista.get(i).name());
                    System.out.println("Precio: $"+lista.get(i).price());
                    System.out.println("Id: "+lista.get(i).idNum());
                    System.out.println(" ");
                }
                bandera = true;
            }
            else if(eliminar.equals("no")){
                bandera = true;
            }
            else{
                System.out.println("Ingrese si / no");
                System.out.println(" ");
                bandera = false;
            }   
        }
        
        // Modificar:
        while(bandera == true){
            System.out.println("Desea modificar algun producto? (si/no)");
            modificar = input.next();
            if(modificar.equals("si")){
                while(bandera3 == true){
                    System.out.println("Ingrese el ID del producto a "
                            + "modificar:");
                    numeroId2 = input.nextInt();
                    for(int i = 0; i < lista.size(); i++){
                        if(numeroId2 == lista.get(i).idNum()){
                            lista.remove(i);
                            System.out.println("Ingrese el nombre del "
                                    + "producto: ");
                            nombre = input.next();
                            System.out.println("Digite el precio del "
                                    + "producto: ");
                            precio = input.nextInt();
                            claseObjeto leer2 = new claseObjeto(nombre,precio,
                                   numeroId2);
                            lista.add(leer2);
                            bandera3 = false;
                        }
                    }
                    if(bandera3 == true){
                        System.out.println("¡El ID ingresado no existe!");
                        System.out.println(" ");
                        bandera3 = true;
                    }   
                }
                for(int i = 0; i < lista.size(); i++){
                    System.out.println("Producto: "+lista.get(i).name());
                    System.out.println("Precio: $"+lista.get(i).price());
                    System.out.println("Id: "+lista.get(i).idNum());
                    System.out.println(" ");
                }
                bandera = false; 
            }
            else if(modificar.equals("no")){
                bandera = false;
            }
            else{
                System.out.println("Ingrese si / no");
                System.out.println(" ");
                bandera = true;
            }  
        }
    }   
}
