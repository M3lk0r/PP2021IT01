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
public class Main {

    public static void main(String[] args) {
        Menu[] menuList = new Menu[2];

        menuList[0] = new Menu("Menu 1");
        menuList[1] = new Menu("Menu 4");

        Iterator iteratorMenu = new IteratorMenu(menuList);

        while (iteratorMenu.hasNext()) {
            Menu menu = (Menu) iteratorMenu.next();
            System.out.println(menu.nome);
        }
    }

}
