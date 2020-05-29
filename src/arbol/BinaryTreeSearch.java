/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Juan Pablo Castro
 * @param <T>
 */
public class BinaryTreeSearch<T extends Comparable<T>> {

    ///////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////
    
    /**
     * La raiz del arbol
     */
    private BinaryNode<T> root;

    ///////////////////////////////////////////////////////
    //Constructor por defecto
    ///////////////////////////////////////////////////////
    public BinaryTreeSearch() {

    }

    ///////////////////////////////////////////////////////
    //Metodos
    ///////////////////////////////////////////////////////
    /**
     * Metodo que verifica si el arbol esta vacio
     *
     * @return Si el arbol esta vacio retorna true, en caso contrario retorna
     * false
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Metodo que me busca un item en el arbol
     *
     * @param item Item que se desea buscar
     * @return Si lo encuentra retorna el nodo, si no retorna null
     */
    public BinaryNode<T> find(T item) {
        BinaryNode<T> current = root;

        while (current != null) {
            if (current.getItem().equals(item)) {
                return current;
            } else if (item.compareTo(current.getItem()) < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return null;
    }

    /**
     * Metodo que agrega un nuevo nodo al arbol
     *
     * @param item item con el que se va crear el nodo
     * @param nombreArchivo archivo que se le va agregar a lista archivos del
     * nodo
     */
    public void insert(T item, String nombreArchivo) {
        ArrayList<String> lst = new ArrayList<>();
        BinaryNode<T> newNode = new BinaryNode<>(item, lst, null, null);
        newNode.getLstNombreArchivo().add(nombreArchivo);

        if (root == null) {
            root = newNode;
        } else {
            BinaryNode<T> current = root;
            BinaryNode<T> parent = root;
            boolean isLeft = false;
            boolean existe = false;

            while (current != null) {
                parent = current;
                if (newNode.compareTo(current) < 0) {
                    current = current.getLeft();
                    isLeft = true;
                } else if (newNode.compareTo(current) > 0) {
                    current = current.getRight();
                    isLeft = false;
                } else {
                    //Agregar a la lista
                    current.getLstNombreArchivo().add(nombreArchivo);
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                if (isLeft) {
                    parent.setLeft(newNode);
                } else {
                    parent.setRight(newNode);
                }
            }
        }
    }
      public void insertAleatorios(T item) {
        
        BinaryNode<T> newNode = new BinaryNode<>(item,null, null,null);
        if(root == null) {
            root = newNode;
            return;
        }
        
        BinaryNode<T> current = root;
        BinaryNode<T> parent = root;
        boolean isLeft = false;
        while(current != null) {
            parent = current;
            if(current.compareTo(newNode) > 0) {
                current = current.getLeft();
                isLeft = true;
            } else {
                current = current.getRight();
                isLeft = false;
            }
        }
        if(isLeft) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
    }

    /**
     * Metodo que me elimina un nodo del arbol
     *
     * @param item Item que tiene el nodo que se va eliminar
     * @return retorna true si lo pudo eliminar, si no lo encontro retorna false
     */
    public boolean delete(T item) {
        // Encontrar el nodo a eliminar y su padre
        BinaryNode<T> current = root;
        BinaryNode<T> parent = current;
        boolean isLeft = false;

        while (current != null) {
            if (current.getItem().compareTo(item) == 0) {
                break;
            } else if (current.getItem().compareTo(item) > 0) {
                parent = current;
                current = current.getLeft();
                isLeft = true;
            } else {
                parent = current;
                current = current.getRight();
                isLeft = false;
            }
            if (current == null) {
                return false;
            }
        }

        // Caso 1: No se tienen hijos
        if (current.getLeft() == null && current.getRight() == null) {
            if (current == root) {
                root = null;
            } else if (isLeft) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if (current.getLeft() != null && current.getRight() == null) {
            // Caso 2: se tiene un hijo izquierdo
            if (current == root) {
                root = current.getLeft();
            } else if (isLeft) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        } else if (current.getLeft() == null && current.getRight() != null) {
            // Caso 2: se tiene un hijo derecho
            if (current == root) {
                root = current.getRight();
            } else if (isLeft) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        } else {
            // Caso 3: se tienen dos hijos
            BinaryNode<T> successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeft) {
                parent.setLeft(successor);
            } else {
                parent.setRight(successor);
            }
            successor.setLeft(current.getLeft());
        }

        return true;
    }

    private BinaryNode<T> getSuccessor(BinaryNode<T> node) {
        BinaryNode<T> successorParent = node;
        BinaryNode<T> successor = node;
        BinaryNode<T> current = successor.getRight();

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeft();

            if (current == null) {
                // hace las conexiones
                if (successorParent != node) {
                    successorParent.setLeft(successor.getRight());
                }
                if (successor != node.getRight()) {
                    successor.setRight(node.getRight());
                }
            }
        }

        return successor;
    }

    /**
     * Metodo que me crea una lista con todos los items del arbol
     *
     * @return Retorna la lista de items
     */
    public ArrayList<String> arregloItems() {
        ArrayList<String> listItems = new ArrayList<>();
        Queue<BinaryNode<T>> cola = new LinkedList();
        cola.add(root);
        while (!cola.isEmpty()) {
            BinaryNode removido = cola.remove();
            listItems.add((String) removido.getItem());

            if (removido.getLeft() != null) {
                cola.add(removido.getLeft());
            }
            if (removido.getRight() != null) {
                cola.add(removido.getRight());
            }
        }
        return listItems;
    }
    
    private String intercambioIzquierdoDerecho (){
      String datos = ""; 
        Queue<BinaryNode<T>> cola = new LinkedList();
        if (root == null) {

        } else {
            cola.add(root);
            while (!cola.isEmpty()) {
                BinaryNode removido = cola.remove();
                datos += (String) removido.getItem();

                if (removido.getLeft() != null) {
                    BinaryNode aux = removido.getRight();
                    removido.setRight(removido.getLeft());
                    removido.setLeft(aux);
                    cola.add(removido.getLeft());
                    
                }
                if (removido.getRight() != null) {
                    BinaryNode aux = removido.getLeft();
                    removido.setLeft(removido.getRight());
                    removido.setRight(aux);
                    cola.add(removido.getRight());
                }
            }
        }
        return datos;
    }

    public ArrayList<ArrayList<String>> arregloNombres() {
        ArrayList<ArrayList<String>> listNombres = new ArrayList<>();
        Queue<BinaryNode<T>> cola = new LinkedList();
        cola.add(root);
        while (!cola.isEmpty()) {
            BinaryNode removido = cola.remove();
            listNombres.add(removido.getLstNombreArchivo());

            if (removido.getLeft() != null) {
                cola.add(removido.getLeft());
            }
            if (removido.getRight() != null) {
                cola.add(removido.getRight());
            }
        }
        return listNombres;
    }

    /**
     * Metodo que me carga todos los archivos del arbol al abrir la aplicacion
     *
     * @return lista con las listas de nombres de los archivos
     */
    public ArrayList<ArrayList<String>> llenarTablaInicio() {
        ArrayList<ArrayList<String>> listNombres = new ArrayList<>();
        Queue<BinaryNode<T>> cola = new LinkedList();
        if (root == null) {

        } else {
            cola.add(root);
            while (!cola.isEmpty()) {
                BinaryNode removido = cola.remove();
                listNombres.add(removido.getLstNombreArchivo());

                if (removido.getLeft() != null) {
                    cola.add(removido.getLeft());
                }
                if (removido.getRight() != null) {
                    cola.add(removido.getRight());
                }
            }
        }
        return listNombres;
    }

    /**
     * Metodo que me crea un string con todos los archivos que tiene un nodo
     *
     * @param nodo El nodo del que necesito obtener la lista
     * @return String con los archivos del nodo
     */
    public String obtenerArchivos(BinaryNode<T> nodo) {
        String rpta = "";
        ArrayList<String> lst = nodo.getLstNombreArchivo();
        for (String a : lst) {
            rpta += a + ",";
        }
        return rpta;
    }

    /**
     * Metodo que me devuelve un String del arbol indicandome de quien es hijo
     * cada nodo y ademas agregando un guion al lado de cada nodo
     * correspondiente al nivel que pertenece
     *
     * @return String del arbol
     */
    public String mostrarArbol() {
        if (root == null) {
            return "El arbol esta vacio";
        } else {
            String rpta = "";
            String sim = "-";
            Queue<BinaryNode<T>> colaPadres = new LinkedList();
            Queue<BinaryNode<T>> colaHijos = new LinkedList();
            colaPadres.add(root);
            rpta += root.getItem() + " (raiz) \n";
            while (!colaPadres.isEmpty()) {
                while (!colaPadres.isEmpty()) {
                    BinaryNode<T> removido = colaPadres.remove();
                    if (removido.getLeft() != null) {
                        colaHijos.add(removido.getLeft());
                        rpta += sim + removido.getLeft().getItem() + " (izq. " + removido.getItem() + ")    ";
                    }
                    if (removido.getRight() != null) {
                        colaHijos.add(removido.getRight());
                        rpta += sim + removido.getRight().getItem() + " (der. " + removido.getItem() + ")    ";
                    }
                }
                while (!colaHijos.isEmpty()) {
                    BinaryNode<T> removido = colaHijos.remove();
                    colaPadres.add(removido);
                }
                sim += "-";
                rpta += "\n";
            }
            return rpta;
        }
    }

    public BinaryNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }
    public static String aleatorio() {
        Random obj = new Random();
        String posibles = "abcdefghijklmnopqrstuvwxyz";
        int longitud = posibles.length();
        char letra;
        int longitudnuevacadena = 6;
        String nuevacadena = "www.";
        for (int i = 0; i < longitudnuevacadena; i++) {
            letra = posibles.charAt(obj.nextInt(longitud - 1));
            nuevacadena += letra;
        }
        nuevacadena += ".com";
        System.out.println(nuevacadena);
        return "";
    }
     public static String mil() {
        String num = "";
        for (int i = 0; i < 10000; i++) {
            num = aleatorio();
        }
        System.out.println(num);
        return "";
    }

}
