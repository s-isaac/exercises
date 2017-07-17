/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

//import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Day extends SetDay{
     
    String [] dayArray;
    
    public void setArray(String[] array)
    {
        dayArray = array;
    }
   
    public boolean varDay(String cineDay){
    boolean check;
    String day = cineDay;
        
    SetDay userDay = new SetDay();
    
     check = userDay.checkDay(day);
        
        return check;
    }
}
    /*if day == "Wednesday"
    for (price){
-2
}
   */ 

