package seguimientoarray;

public class claseObjeto {
    
    private String producto;
    private float precio;
    private int id;
    
    public claseObjeto(String productoObject, float precioObject, int idObject){
        
        if(productoObject != null && precioObject > 0 && idObject > 0){
            
            this.producto = productoObject;
            this.precio = precioObject;
            this.id = idObject;
        }
        else{
            this.producto = null;
            this.precio = 0;
            this.id = 0;
        }
    }
    
    public String name(){
        return this.producto;
    }
    
    public float price(){
        return this.precio;
    }
    
    public int idNum(){
        return this.id;
    }  
}
