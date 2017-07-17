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
public class Price {
    private String ticketType;
    private int price;

public int getPrice(){
    return price;
}    

public String getTicketType(){
    return ticketType;
}

public void setPrice(int newPrice){
    price = newPrice;
}

public void setTicketType(String newTicketType){
    ticketType = newTicketType;
}


}
