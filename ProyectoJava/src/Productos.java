import javax.swing.*;

public class Productos {
    // suma para el llevar el total
    public static int sumaProductos=0;

    // METODOS

    public void escogerDia() {
        String[] paquetes = {"1 semana completa", "2  3 dias y 2 noches", "3 vip ", "4 Todas las anteriores +areas recreativas"};
        float[] precios = {50000, 70000, 120000, 150000};



        JOptionPane.showMessageDialog(null, "Bienvenidos a ventas de paquetes, a continuacion se le precentaran 4 opciones de paquetes ");
        JOptionPane.showMessageDialog(null, "1= semana completa con valor de 50.000 " +
                "\n" + "2= 3 dias y 2 noches con un valor de 70.000" + "\n"
                + "3= vip con un valor de 120.000" + "\n" +
                "4= todas las anteriores + areas recreativas con un valor de 150.000");
        JOptionPane.showMessageDialog(null, "escoja su seleccion a comprar");
        String opcion = JOptionPane.showInputDialog("ingrese el numero de paquete que quiera comprar");
        int opcion1 = Integer.parseInt(opcion);

        Facturacion fct = new Facturacion();

        if (opcion1 == 1) {
            JOptionPane.showMessageDialog(null, (paquetes[0] + precios[0]));
            sumaProductos+= Facturacion.semanaCompleta;
        } else if (opcion1 == 2) {
            JOptionPane.showMessageDialog(null, (paquetes[1] + precios[1]));
            sumaProductos+= Facturacion.dosNoches;
        } else if (opcion1 == 3) {
            JOptionPane.showMessageDialog(null, (paquetes[2] + precios[2]));
            sumaProductos= Facturacion.vip;
        } else if (opcion1 == 4) {
            JOptionPane.showMessageDialog(null, (paquetes[3] + precios[3]));
            sumaProductos+= Facturacion.recreativas;
        } else
            JOptionPane.showMessageDialog(null, "seleccion incorrecta");

        }
    }






