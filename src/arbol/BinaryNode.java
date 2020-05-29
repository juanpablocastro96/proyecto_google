/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arbol;

import java.util.ArrayList;

/**
 *
 * @author Juan Pablo Castro
 */
public class BinaryNode<T extends Comparable<T>> implements Comparable<BinaryNode<T>> {
    
    private T item;
    
    private ArrayList<String> lstNombreArchivo;
    
    private BinaryNode<T> left;
    
    private BinaryNode<T> right;
    
    public BinaryNode(){
        
    }
    
    public BinaryNode(T item, ArrayList<String> lstNombreArchivo, BinaryNode<T> left, BinaryNode<T> right){
        this.item = item;
        this.left = left;
        this.right = right;
        this.lstNombreArchivo = lstNombreArchivo;
    }
    
    @Override
    public String toString(){
        return item.toString();
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof BinaryNode){
            return item.equals( ((BinaryNode)o).getItem() );
        }else{
            return false;
        }
    }
    
    @Override
    public int compareTo(BinaryNode<T> o) {
        return item.compareTo(o.getItem());
    }

    /**
     * @return the item
     */
    public T getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(T item) {
        this.item = item;
    }

    /**
     * @return the left
     */
    public BinaryNode<T> getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public BinaryNode<T> getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    public ArrayList<String> getLstNombreArchivo() {
        return lstNombreArchivo;
    }

    public void setLstNombreArchivo(ArrayList<String> lstNombreArchivo) {
        this.lstNombreArchivo = lstNombreArchivo;
    }
    
    
    
}
