/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Pablo Castro
 */
public class Metodos<T extends Comparable<T>> {

    /**
     * Metodo que me añade un un nodo al arbol con sus respectivos items y
     * archivos
     *
     * @param palabras item con el que se va agregar el nodo
     * @param archivo el nombre de la palabra clave que se va agregar a la lista de
     * archivos del nodo
     * @param arbol el arbol en el que se va agregar el nodo
     */
    public void insert(String palabras, String archivo, BinaryTreeSearch<T> arbol) {
        StringTokenizer token = new StringTokenizer(palabras, " ");

        while (token.hasMoreTokens()) {
            String palabra = token.nextToken();
            arbol.insert((T) palabra, archivo);
        }
    }

    /**
     * Metodo que me busca la lista de archivos de un nodo
     *
     * @param item item del nodo que voy a buscar
     * @param arbol arbol en el que voy a buscar el nodo
     * @return retorna la lista del nodo si lo encuentra, si no lo encuentra
     * retorna null
     */
    public ArrayList<String> buscarArchivosNodo(String item, BinaryTreeSearch<T> arbol) {
        if (arbol.find((T) item) != null) {
            return arbol.find((T) item).getLstNombreArchivo();
        } else {
            return null;
        }
    }

    /**
     * Me llena la tabla de archivos con la palabra que ingrese el usuario
     *
     * @param tblArchivos la tabla que se va llenar
     * @param palabra la palabra que ingresa el usuario para buscar los archivos
     * @param arbol el arbol donde se va buscar la palabra
     */
    public void llenarTablaConFiltro(JTable tblArchivos, String palabra, BinaryTreeSearch<T> arbol) {
        String titulos[] = {"Archivo", "Clave"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        ArrayList<String> datosFila = buscarArchivosNodo(palabra, arbol);
        if (datosFila != null) {
            for (int i = 0; i < datosFila.size(); i++) {
                tm.addRow(new Object[]{datosFila.get(i), palabra});
                tblArchivos.setModel(tm);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta palabra clave no existe");
        }
    }

    /**
     * Este metodo busca un archivo y le cambia su palabra clave por una nueva,
     * en caso de que la palabra quede sin archivos esta se eliminara
     *
     * @param item la palabra clave que tiene el archivo
     * @param newItem la nueva palabra clave que va tener el archivo
     * @param posArchivo la posicion de la lista en la que esta el archivo
     * @param arbol el arbol donde se va buscar la palabra
     */
    public void editarArchivo(String item, String newItem, int posArchivo, BinaryTreeSearch<T> arbol) {
        BinaryNode<T> nodo = arbol.find((T) item);
        String newArchivo = nodo.getLstNombreArchivo().remove(posArchivo);
        arbol.insert((T) newItem, newArchivo);
        if (nodo.getLstNombreArchivo().isEmpty()) {
            arbol.delete(nodo.getItem());
        }
    }

    /**
     * Metodo que le elimina un archivo a una palabra clave, en caso de que la
     * palabra quede sin archivos esta se eliminara
     *
     * @param item
     * @param nombreArchivo
     * @param arbol
     */
    public void eliminarArchivo(String item, String nombreArchivo, BinaryTreeSearch<T> arbol) {
        BinaryNode<T> nodo = arbol.find((T) item);
        nodo.getLstNombreArchivo().remove(nombreArchivo);
        if (nodo.getLstNombreArchivo().isEmpty()) {
            arbol.delete((T) item);
        }
    }

}
