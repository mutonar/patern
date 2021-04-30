/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_to_work_git.Thread;

public class ProgresBarMy extends javax.swing.JProgressBar {
    private static ProgresBarMy instance;
   // public ProgresBarMy() {
   // }
    
      public static ProgresBarMy getInstance(){ // #3
      if(instance == null){		//если объект еще не создан
        instance = new ProgresBarMy();	//создать новый объект
      }
      return instance;		// вернуть ранее созданный объект
    }
    
    public void setMin(int s){
        instance.setMinimum(s);
    }
    public void setMax(int s){
        instance.setMaximum(s);
    }
    public void setVal(int s){
        System.out.println(instance.getValue());
        this.setValue(instance.getValue()+s);
    }
}
