package classes;

/**
 *
 * @author eleaz
 */
public class Articulo {
    private int idProducto;
    private int cantidad;

    public Articulo(int idProducto, int cantidad){
        this.cantidad = cantidad;
        this.idProducto = idProducto;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
