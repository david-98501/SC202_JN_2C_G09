import javax.swing.*;

public class Facturacion {
    //precios
    public static float iva =0.13f;
    public static int semanaCompleta=50000;
    public static  int dosNoches=70000;
    public static int vip=10000;
    public static int recreativas=120000;
    public static int senderismo=25000;
    public static int camping=10000;






    // metodos


    public void mostrarFactura(Registro rg){
        System.out.println("Estimad@"+"" + rg.getNombre()+"\n" + " su factura es de : "
                + Productos.sumaProductos+"\n"+
                "iva = 13% "+"\n" +"el total a pagar es de : "+(Productos.sumaProductos*(1+iva))+"\n"+"la factura sera remitida al correo:" + rg.getCorreo()
                +" y al numero :"+ rg.getCelular()+"le llegara un mensaje de aviso");


    }












}
