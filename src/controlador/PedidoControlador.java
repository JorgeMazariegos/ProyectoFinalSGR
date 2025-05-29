package controlador;

import dao.PedidosDAO;
import dao.ClienteDAO;
import java.util.List;
import modelo.Pedido;

public class PedidoControlador {
        PedidosDAO dao = new PedidosDAO();
    
    public List<Pedido> consultarPedidos(){
        return dao.consultarPedido();
    }
    
    public int registarPedido(int numPedido ,String nombreCliente, String nitCliente, double totalGastado, String productos, int cantidad, float descuento, boolean estado, double precioUnitario){
        Pedido pedido = new Pedido(numPedido ,nombreCliente,nitCliente,totalGastado,productos,cantidad,descuento,estado,precioUnitario);
        return dao.registrarPedido(pedido);
    }
    
    public int actualizarPedido(int numPedido, String nombreCliente, String nitCliente, double totalGastado, String productos, int cantidad, float descuento, boolean estado){
        Pedido pedido = new Pedido(numPedido, nombreCliente, nitCliente, totalGastado, productos, cantidad, descuento, estado);
        return dao.actualizarPedido(pedido);
    }
}
