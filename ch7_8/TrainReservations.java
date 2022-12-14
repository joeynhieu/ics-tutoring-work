package ch7_8;

import java.util.Scanner;

public class TrainReservations {

    public static void main (String[] args) {
        
        //input from the user
        Scanner input = new Scanner(System.in); 
        //Declare the variables for menu selection and row selection
        int menuSelect, rowSelection; 
        //Declare the variable for seat option 
        char seatOption;
      
        //Each one dimensional array is initialized to the seat letter ('A', 'B', 'C'). 
        char[] seatArray1 = {'A', 'B', 'C'};
        char[] seatArray2 = {'A', 'B', 'C'};
      //  char[] seatArray3 = {'A', 'B', 'C'};
      //  char[] seatArray4 = {'A', 'B', 'C'};
       // char[] seatArray5 = {'A', 'B', 'C'};
        
        //Use a loop to print out a menu and perform the appropriate task:  
        while (true)
        {
            // Prompts user with menu options
            System.out.println("\nMenu");
            System.out.println("1. Print Seating Chart");
            System.out.println("2. Select Seat");
            System.out.println("3. Exit");
            
            //Ask the user to enter the choice
            System.out.print("Choice: ");
            //Store user input in variable menu selection
            menuSelect = input.nextInt(); 
            
            //If user input (menu selection) is 1, display seating chart
            if (menuSelect == 1) 
            {
                System.out.println("\nSeating Chart");
                //Display seating chart
                for(int i = 0; i < 2; i++)
                {   System.out.print("Row " + (i + 1) + ": ");
                    for(int k = 0; k < 3; k++) 
                    {
                        System.out.print(seatArray1[k] + " ");
                    }//Close inner for loop
                    System.out.println();
                }//Close outer for loop
            }//Close menu selection 1
            
            //If user input (menu selection) is 2, ask the user to select a 
            //seat by entering its corresponding row number and seat option 
            //and replace the corresponding entry in seat chart to 'X' to 
            //indicate that that seat is not available
            else if(menuSelect == 2) 
            {
                //Ask the user to select the row
                System.out.print("Select row (1, 2): ");
                //Read row from the user
                rowSelection = input.nextInt();
                
                //If selected row is invalid
                if(rowSelection < 1 || rowSelection > 2)
                {
                    //Print "Sorry, invalid row selection"
                    System.out.println("Sorry, invalid row selection"); 
                }
                //If selected row is valid
                else
                {
                    //Ask the user to enter a seat option
	                System.out.print("Select seat (A, B, C): ");
                    //Read seat option from the user
                    seatOption = input.next().toUpperCase().charAt(0);
             
                    if (rowSelection == 1 && seatOption == 'A'){
                        seatArray1[0] = 'X';
                        seatArray2[0] = 'A';
                    }
                 
                    if (rowSelection == 1 && seatOption == 'B'){
                        seatArray1[1] = 'X';
                    }

                    if (rowSelection == 1 && seatOption == 'C'){
                        seatArray1[2] = 'X';
                    }

                    if (rowSelection == 2 && seatOption == 'A'){
                        seatArray2[0] = 'X';
                    }
                 
                    if (rowSelection == 2 && seatOption == 'B'){
                        seatArray2[1] = 'X';
                    }

                    if (rowSelection == 2 && seatOption == 'C'){
                        seatArray2[2] = 'X';
                    }

              

                  
        
                }
            }//Close menu selection 2

            //If menu selection is 3, exit the program
            else if (menuSelect == 3)  
            {
                //Print "Thank you for using Train Reservation System"
                System.out.println("\nThank you for using Train Reservation System!");
                //Exit the program
                System.exit(0);
            } // Close menu selection 3
            
            //If user selects invalid choice (other than 1 or 2 or 3)
            else
            {
                //Print "Sorry, invalid option"
                System.out.println("Sorry, invalid option");
            }
        } //Close while
        
    } // Close main

}

