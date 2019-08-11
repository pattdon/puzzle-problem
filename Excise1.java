/*f
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excise1;
import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;
/**
 *
 * @author pattadon nutes
 */



public class Excise1 {
       final int size = 4;


        
       public static void main(String[] args) {
           System.out.println(findValue(0,0,"t",1));
           System.out.println(findValue(0,0,"t"));
       }

       
       public static Boolean findValue(int row,int column,String orientation){
           Boolean value = false;
            String[][] a = {
            {"t","h","i","s"}, 
            {"w","a","t", "s"}, 
            {"o","a","h","g"},
            {"f","g","d","f"},
           };
           
           for(int i = 0;i < 4; i++){
                for(int j = 0;j < 4; j++){
                    //System.out.println(a[i][j]);
                    if(a[i][j] == orientation ){
                        value = true;
                    }
                }
            }
           return value;
       }
       
         public static Boolean findValue(int row,int column,String orientation,int numChar){
           Boolean value = false;
           
            String[][] a = {
            {"t","h","i","s"}, 
            {"w","a","t", "s"}, 
            {"o","a","h","g"},
            {"f","g","d","f"},
           };
           
           for(int i = 0;i < 4; i++){
                for(int j = 0;j < 4; j++){
                    //System.out.println(a[i][j]);
                    if(a[i][j] == orientation && a[i][j].length() == numChar){
                        value = true;
                    }
                }
            }
           return value;
       }
 }
    
  



  













































































































































































































































































































































































































































































































