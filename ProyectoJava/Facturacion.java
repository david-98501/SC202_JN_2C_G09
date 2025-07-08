import javax.swing.*;

public class Facturacion {
    //precios
    public static float iva =0.13f;
    public static int semanaCompleta=50000;
    public static  int dosNoches=70000;
    public static int vip=10000;
    public static int recreativas=120000;

    Registro rg = new Registro();

    // metodos
    public void mostrarFactura(){
        JOptionPane.showMessageDialog(null,"Estimad@"+rg.getnombre()+"\n" + " su factura es de : "+ Productos.sumaProductos+"\n"+
                "iva = 13% "+"\n" +"el total a pagar es de : "+(Productos.sumaProductos*iva));


    }












}
