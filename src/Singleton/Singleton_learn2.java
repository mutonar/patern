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
 * synchronized синхронизирует несколько потоков но по ресурсам очень трудозатратно
 * по этому синхронизация только в блоке проверки
 * volatile ниже версии 1.5 не верно работает использовать нужно другую синхронизацию
 * 
 */
public class Singleton_learn2 {
    private static  String inFile = "this start \n";
    private static volatile Singleton_learn2 instance; //  volatile - гарантированная работа с переменной при синхронизации потоков
    private Singleton_learn2(){
        System.out.println("One constraction");
    }
    
    public static synchronized Singleton_learn2 getInstance(){ // #3 
      if(instance == null){                     //если объект еще не создан
          synchronized (Singleton_learn2.class){
          if(instance == null){
            instance = new Singleton_learn2();	//создать новый объект
          }
        }
      }
      return instance;                          // вернуть ранее созданный объект
    }
    
    public void setInFile(String str){
    inFile += str + "\n";
    }
    public String getInFile(){
        return inFile;
    }
}
