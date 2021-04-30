/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author nazarov
 */
public class test_Singleton {

    private static int it = 0;

    public static void main(String[] args) {
        Singleton_learn.getInstance();
        Singleton_learn.getInstance();
        System.out.println(Singleton_learn.getInstance().getInFile());
        Singleton_learn.getInstance().setInFile("one");
        Singleton_learn.getInstance().setInFile("two");
        Singleton_learn.getInstance().setInFile("thre");
        System.out.println(Singleton_learn.getInstance().getInFile());

    }

    public int getIT() {
        ++it;
        setIT(3);  // Статику в нестаике можно, на оборот нет 
        return it;
    }

    public static void setIT(int i) {
        it = it + i;

    }
}
