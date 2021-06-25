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
public class Test_to_work_git {
    String global_mess = null;
    
    public Test_to_work_git(){
      global_mess = "I am original file";
    }
	
    
     String getMessage(){
       return global_mess;
     }
     
    public static void main(String[] args) {
        //System.out.print("Add print");
        Test_to_work_git newTest = new Test_to_work_git();
        System.out.print(newTest.getMessage());

    }
    
}
