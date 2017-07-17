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
    import java.io.Serializable;

/**
 * Enumeration of available stock types
 *
 * @author rtucker
 */
public enum DayType implements Serializable
{

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

   /* @Override
    public String toString()
    {
        String strResult = "";
        switch (this)
        {
            case MONDAY:
                strResult = "Monday";
                break;
            case TUESDAY:
                strResult = "Tuesday";
                break;
            case WEDNESDAY:
                strResult = "Wednesday";
                break;
            case THURSDAY:
                strResult = "Thursday";
                break;
            case FRIDAY:
                strResult = "Friday";
                break;
            case SATURDAY:
                strResult = "Saturday";
                break;
            case SUNDAY:
                strResult = "Sunday";
                break;
        }    
        return strResult;
    }
*/
}
