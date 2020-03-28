
import javax.swing.JOptionPane;

/*
 *Vampos a establecer un metodo que sea capaz de evaluar dentro de un string
de que tipo es un caracter si un caracter es una arroba o no lo es

vamos a utilizar charAT
y lengh

vamos a la api, en el metodo String charAt(int index) nos devuel un char

tambien necesitamo la longitudo de una cadena de caracteres

int  length() pentenecientes a la clase String
 */
public class Comprueba_mail {

    public static void main(String[] args) {
        // TODO code application logic here
    
        boolean arroba=false;
        
        String mail = JOptionPane.showInputDialog("Introduce un email");/*vamos a pedirle
        al usuario que introduzca en una venta el mail x medio de JOptionPane
        Vamos a recorrer con un bucle for caracter a caracter es adirección 
        de email tenga la longitud que tenga en busca de la arroba*/
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i)=='@') {
                arroba = true;                
            }            
        }
        if (arroba==true) {
            System.out.println("El email es correcto");            
        }
        else{
            System.out.println("No es correcto");
        }
    }
    
}
