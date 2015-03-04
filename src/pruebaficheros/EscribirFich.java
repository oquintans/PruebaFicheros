package pruebaficheros;

import java.io.*;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class EscribirFich {

    PrintWriter fich;

    public void escribir(String nombreF) {
        try {
            fich = new PrintWriter(new File(nombreF));
            String resp = JOptionPane.showInputDialog("Introducir Texto:");
            fich.println(resp);
        } catch (IOException ex) {
            System.err.println("Error de escritura" + ex);
        } finally {
            fich.close();
        }
    }
}
