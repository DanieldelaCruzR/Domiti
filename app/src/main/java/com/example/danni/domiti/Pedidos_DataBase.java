package com.example.danni.domiti;

/**
 * Created by danni on 01/12/2017.
 */

public class Pedidos_DataBase {
    private String Cantidad;
    private String Total;
    private String NombreProd;
    private String NombreTienda;
    private String NumPedido;
    private String TiendaId;

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getNombreProd() {
        return NombreProd;
    }

    public void setNombreProd(String nombreProd) {
        NombreProd = nombreProd;
    }

    public String getNombreTienda() {
        return NombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        NombreTienda = nombreTienda;
    }

    public String getNumPedido() {
        return NumPedido;
    }

    public void setNumPedido(String numPedido) {
        NumPedido = numPedido;
    }

    public String getTiendaId() {
        return TiendaId;
    }

    public void setTiendaId(String tiendaId) {
        TiendaId = tiendaId;
    }

    public Pedidos_DataBase() {

    }

    public Pedidos_DataBase(String cantidad, String total, String nombreProd, String nombreTienda, String numPedido, String tiendaId) {

        Cantidad = cantidad;
        Total = total;
        NombreProd = nombreProd;
        NombreTienda = nombreTienda;
        NumPedido = numPedido;
        TiendaId = tiendaId;
    }
}
