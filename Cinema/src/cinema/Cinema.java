/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.*; // This will import the entire java.util package.



/**
 *
 * @author Student
 */
public class Cinema extends Day {

    
        
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int totalPrice = 0;
        int tempPrice = 0;
        int checkPrice = 0;
        
        //Declare a scanner item to read in data from a user input
        Scanner userInputScanner = new Scanner(System.in);
        // TODO code application logic here
       //Type and prices of each ticket initialised
       Price standard = new Price();
       standard.setPrice(8);
       standard.setTicketType("Standard");
       
       Price OAP = new Price();
       OAP.setPrice(6);
       OAP.setTicketType("OAP");
       
       Price student = new Price();
       student.setPrice(6);
       student.setTicketType("Student");
       
       Price child = new Price();
       child.setPrice(4);
       child.setTicketType("Child");

        //Ask which day the customer wants to buy tickets for
        System.out.println("What day would you like to go to the cinema?");
        String userDay = userInputScanner.nextLine();
        
        String cineDay = userDay.toLowerCase();
        
        Day newDay = new Day();
        
        boolean changePrice = newDay.varDay(cineDay);
        
        if(changePrice){
           standard.setPrice(6);
           OAP.setPrice(4);
           student.setPrice(4);
           child.setPrice(2);
        }
        
        System.out.println("\n" + standard.getTicketType() + " : £" + 
                standard.getPrice());
        System.out.println("\n" + OAP.getTicketType() + " : £" + 
                OAP.getPrice());
        System.out.println("\n" + student.getTicketType() + " : £" + 
                student.getPrice());
        System.out.println("\n" + child.getTicketType() + " : £" + 
                child.getPrice());
        
        //Declares that a customers wants more tickets
        String moreTickets = "yes";
        
        while (moreTickets.equals("yes"))
        {
        String ticketType;
        //Checks what type of ticket the user wants
        System.out.println("\n What sort of ticket you you like?");
        ticketType = userInputScanner.nextLine();
        
        String source = ticketType;
        StringBuilder res = new StringBuilder();

    String[] strArr = source.split(" ");
    for (String str : strArr) {
        char[] stringArray = str.trim().toCharArray();
        stringArray[0] = Character.toLowerCase(stringArray[0]);
        str = new String(stringArray);

        res.append(str).append(" ");
    }
        
        //Get price of selected ticket
        switch (ticketType) {

            case "standard": checkPrice = standard.getPrice();
								break; 
            case "oap": checkPrice = OAP.getPrice();
								break;
            case "student": checkPrice = student.getPrice();
                        break;
            case "child": checkPrice = child.getPrice();
								break;
            default: System.out.println("I'm afraid thats not valid");
        }   
        
        //Checks many tickers the user wants of that type
        System.out.println("\n How many " + ticketType + " tickets would you like?");
        String noTickets = userInputScanner.nextLine();
        
        tempPrice = Integer.parseInt(noTickets);
        checkPrice = tempPrice * checkPrice;
        totalPrice = totalPrice + checkPrice;
        
        //Checks if the user wants anymore tickets
        System.out.println("\n Would you like anymore tickets?");
        moreTickets = userInputScanner.nextLine();
        
        source = moreTickets;
    StringBuilder res1 = new StringBuilder();

    String[] strArr1 = source.split(" ");
    for (String str : strArr1) {
        char[] stringArray = str.trim().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        str = new String(stringArray);

        res1.append(str).append(" ");
    }

    
        }
        System.out.println("\n Total cost is: £" + totalPrice);    
      }
          
        
        
    }
    

