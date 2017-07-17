/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author Student
 */
public class SetDay {
    
     public boolean checkDay(String cineDay){
    boolean check;
        if(cineDay.equals("wednesday")){
           check = true;
        }
        else{    
            check = false;
        }
        return check;
    }
    
}
