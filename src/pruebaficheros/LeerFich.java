package pruebaficheros;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oquintansocampo
 */
public class LeerFich {

    Scanner sc;

    public void leerLinea(String nombreF) {
        String resposta;
        try {
            sc = new Scanner(new File(nombreF));
            while (sc.hasNextLine()) {
                resposta = sc.nextLine();
                System.out.println(resposta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        } finally {
            sc.close();
        }
    }

    public void leerElemento(String nombreF) {
        String resposta;
        try {
            sc = new Scanner(new File(nombreF));
            while (sc.hasNext()) {
                resposta = sc.next();
                System.out.println(resposta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        } finally {
            sc.close();
        }
    }

    public void leerNum(String nombreF) {
        int resposta;
        try {
            sc = new Scanner(new File(nombreF));
            while (sc.hasNextInt()) {
                resposta = sc.nextInt();
                System.out.println(resposta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        } finally {
            sc.close();
        }
    }

    public void leerDelimit(String nombreF, String delimitador) {
        int resposta;
        try {
            sc = new Scanner(new File(nombreF)).useDelimiter(delimitador);
            while (sc.hasNextInt()) {
                resposta = sc.nextInt();
                System.out.println(resposta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        } finally {
            sc.close();
        }
    }

    public void leerArray(String nombreF, String delimitador) {
        String resposta;
        ArrayList<Alumno> al = new ArrayList();
        try {
            sc = new Scanner(new File(nombreF)).useDelimiter(delimitador);
            while (sc.hasNextLine()) {
                resposta = sc.nextLine();
                String[] alum = resposta.split(",");
                for (int i = 0; i < alum.length; i = i + 2) {
                    al.add(new Alumno(alum[i], Integer.parseInt(alum[i + 1])));
                }
            }
            for (int j = 0; j < al.size(); j++) {
                System.out.println(al.get(j));
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
