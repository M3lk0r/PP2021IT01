/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021it01;

/**
 *
 * @author eduar
 */
public class IteratorMenu implements Iterator {

    public Menu[] itens;
    public int cont = 0;

    public IteratorMenu(Menu[] itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        if (cont >= itens.length || itens[cont] == null) {
            return false;
        }

        return true;
    }

    @Override
    public Object next() {
        Menu menu = itens[cont];
        cont++;
        return menu;
    }

}
