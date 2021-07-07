/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton;

/**
 *
 * @author nazarov
 * 
 * два потока одновременно могут все же создать два экземпляра
 * // можно при инициирование создавать и передавать только готовый
 * 
 */
public class Singleton_learn1 {
    private static  String inFile = "this start \n";
    private static Singleton_learn1 instance = instance = new Singleton_learn1(); 
    private Singleton_learn1(){
        System.out.println("One constraction");
    }
    
    public static Singleton_learn1 getInstance(){ // #3 
      return instance;                          // вернуть ранее созданный объект
    }
    
    public void setInFile(String str){
    inFile += str + "\n";
    }
    public String getInFile(){
        return inFile;
    }
}
