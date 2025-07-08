import javax.swing.*;

public class Registro {

    private String nombre;
    private int cedula;
    private int celular;
    private String correo;
    private String direccion;


    // constructor
    public Registro(){}

    // get y set

    public String getnombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getCedula(){
        return cedula;
    }
    public void setCedula(int cedula){
        this.cedula=cedula;
    }

    public int getCelular(int celular){
        return celular;
    }

    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    //metodo verificador de edad
    public boolean edad() {
        int lectura1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor introduzca su edad"));

        if (lectura1 >= 18) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
            return true; // Puede continuar
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, por políticas del hotel no registramos menores de edad");
            return false;}

    }

    // metodo mostrar datos

    public void mostarregistro(){
        JOptionPane.showMessageDialog(null,"su nommbre es : "+ getnombre());




    }




















}

