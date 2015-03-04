/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaficheros;

/**
 *
 * @author oquintansocampo
 */
public class PruebaFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LeerFich fich = new LeerFich();
        EscribirFich fich2 =new EscribirFich();
        fich2.escribir("fichero4.txt");
        //fich.leerLinea("Z:\\Programacion\\Evaluacion2\\Extras\\pruebaFicheros\\fichero1.txt");
        //fich.leerElemento("fichero4.txt");
        //fich.leerNum("fichero2.txt");
        //fich.leerDelimit("fichero2.txt",",");
        //fich.leerArray("fichero3.txt",",");
        fich.leerLinea("fichero4.txt");
    }
    
}
