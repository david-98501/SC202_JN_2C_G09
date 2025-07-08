import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Registro rg = new Registro();
        Facturacion ft= new Facturacion();
        Reservas rs =new Reservas();
        Productos pd =new Productos();

        JOptionPane.showMessageDialog(null,"Bienvenido al hotel MM "+"\n"+"Es un placer servirle" );


        rg.setNombre(JOptionPane.showInputDialog("Introduzca su nombre "));
        rg.setCedula(Integer.parseInt(JOptionPane.showInputDialog("introduzca su cedula")));
        rg.setCedula(Integer.parseInt(JOptionPane.showInputDialog("introduzca su celular")));
        rg.setNombre(JOptionPane.showInputDialog("Introduzca su correo "));
        rg.setNombre(JOptionPane.showInputDialog("Introduzca su direccion "));

        if (!rg.edad()){
            return;// este me regresa truo o false
        }

        boolean bandera = true;

        do {
            int lectura1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "Oprima 1 para productos" + "\n" + "Oprima 2 para reservar una habitación" + "\n" + "Oprima 3 para mostrar factura"));

            if (lectura1 == 1) {
                pd.escogerDia();
            } else if (lectura1 == 2) {
                rs.reservarHabitacion();
            } else if (lectura1 == 3) {
                ft.mostrarFactura();
            } else {
                bandera = false;
            }

        } while (bandera);






    }
}