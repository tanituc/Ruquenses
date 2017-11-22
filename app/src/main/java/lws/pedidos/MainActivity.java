package lws.pedidos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import lws.pedidos.Modelos.Pedido;
import lws.pedidos.Modelos.Producto;
import lws.pedidos.Servicios.PedidosDbHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PedidosDbHandler db= new PedidosDbHandler(this);
        Producto prodTest= new Producto(1);
        db.nuevoPedido(new Pedido(1, prodTest ,20,5));
        db.nuevoPedido(new Pedido(2, prodTest ,25,52));
        db.nuevoPedido(new Pedido(3, prodTest ,26,50));
        db.nuevoPedido(new Pedido(4, prodTest ,2,51));
        Log.d("Pedidos1:", "Pedi21:");
        Pedido pedido=db.obtenerPedido(1);
        Log.d("Pedido 1:", "Id:" + pedido.getIdPedido() + "ProductoId: " + pedido.getProducto().getIdProducto() + "Total: " + pedido.getTotal());
        Pedido pedido1=db.obtenerPedido(2);
        Log.d("Pedido 2:", "Id:" + pedido1.getIdPedido() + "ProductoId: " + pedido1.getProducto().getIdProducto() + "Total: " + pedido1.getTotal());
        Pedido pedido2=db.obtenerPedido(3);
        Log.d("Pedido 3:", "Id:" + pedido2.getIdPedido() + "ProductoId: " + pedido2.getProducto().getIdProducto() + "Total: " + pedido2.getTotal());
    }

}
//puto el que lee x2