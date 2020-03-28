
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
    
        int arroba=0;
        
        boolean punto = false; /*
        es una bandera para evaluar si se encuentr acon un punto
        */
        
        String mail = JOptionPane.showInputDialog("Introduce un email");/*vamos a pedirle
        al usuario que introduzca en una venta el mail x medio de JOptionPane
        Vamos a recorrer con un bucle for caracter a caracter es adirección 
        de email tenga la longitud que tenga en busca de la arroba*/
        
        /*
        Pero que pasa si el email tiene más de una arroba?
        */
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i)=='@') {
                arroba++;   /*
                Aqui lo que hacemos es que la variable entera arroba
                se incrementara en 1
                lo que ocaciona es que si nuestra dr de email tiene un arroba 
                el arroba valdra 1, pero si se encuentra con mas
                el valor se incrementará
                */             
            }  
            if (mail.charAt(i)=='.') {
                punto=true;/*
                Es decir si no encuentra ningun punto jamás entrar a este if
                */
            }
            
            
        }
        if (arroba==1 && punto == true)/*la variable si es verdad que se incremento osea que encontro al
        mentos un arroba entonce el email es correcto*/ {
            System.out.println("El email es correcto");            
        }
        else{
            System.out.println("No es correcto");
        }
    }
    
}
