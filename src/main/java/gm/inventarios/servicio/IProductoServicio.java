package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {

    public List<Producto> listarProductos();



    public Producto buscarProductoPorId(int idProducto);

    //metodo guardar
    //si el idProducto es igual a null entonces se hace un INSERT
    // si es diferente de null se hace un UPDATE "guardar producto"
    public void guardarProducto(Producto producto);

    public void eliminarProductoPorId(int idProducto);

    public List<Producto>buscarProductoPorCategoria(int idCategoria);

}
