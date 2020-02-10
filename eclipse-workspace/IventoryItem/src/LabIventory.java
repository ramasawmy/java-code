/**
 * 
 */
import java.util.Scanner;
import java.lang.reflect.Array;
/**
 * @author Dell
 *
 */
public class LabIventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keys = new Scanner(System.in);
		String PASSWORD = "DitProg123";  
		
		//declaring variables
	    String item_ID ;
		String name ;
		String description ;
		String category;
		String supplier_name;
		int supplier_contact;
		double price ;
		int available_qty;
		boolean w = true;
		boolean a = true;
		
		System.out.println("Please enter the length of the list? ");
		int size = keys.nextInt();
		
		//creating an array named itemDatabase
		System.out.println("Please enter the number of object in  the item data base : ");
		
		int n = keys.nextInt();
		
		Item [] itemDatabase = new Item[n];
	
		//loop
		while (w == true) {
			
			int time = 0 ;
			
			for(time = 0; time>=0;time++){
				
				System.out.println("What do you want to do ? ");
				System.out.println(" 	  1. Enter a new Item to the inventory (password required)	    ");
				System.out.println(" 	  2. Change information of an existing Item (password required) ");
				System.out.println("  	  3. Display all the Items with the specified category          ");
				System.out.println("      4. Display all Items to be re-ordered                         ");
				System.out.println(" 	  5. Number of Items currently in store                         ");
				System.out.println("	  6. Quit");
				
				System.out.print("Please enter your choice > ");
				
				int ans = keys.nextInt();
				
				if (ans == 1) {
					int count = 0 ;
					
					for (count = 0 ;count <= 3 ;count += 1) {
						System.out.print(" Password : ");
						String pass = keys.next();
								
						if (pass.equalsIgnoreCase(PASSWORD)) {
							
							System.out.println("Please enter the number of object in  the item data base : ");
							
				System.out.println("Please enter the name of the object in the list and its corresponding characteristics : "); 
			
				int i ;
				int t= Item.totalitems();
				for (i=(t) ; i < n ; i ++)
					{
					System.out.print(" Item id : ");
					item_ID = keys.next();
								 
					System.out.print(" name : ");
					name = keys.next();
								
					System.out.print(" description : ");
					description = keys.next();
								
					System.out.print(" category : ");
					category = keys.next();
								
					System.out.print(" supplier name : ");
					supplier_name = keys.next();
								
					System.out.print(" contact : ");
					supplier_contact = keys.nextInt();
								
					System.out.print(" price : ");
					price  = keys.nextDouble();
								
					System.out.print(" quandtity : ");
					available_qty = keys.nextInt();
								
					itemDatabase[i]= new Item(item_ID, name, description, category, supplier_name, supplier_contact, price, available_qty );
					itemDatabase[i].setItem_ID(item_ID);
					itemDatabase[i].setName(name);
					itemDatabase[i].setDescription(description);
					itemDatabase[i].setCategory(category);
				    itemDatabase[i].setSupplier_name(supplier_name);
					itemDatabase[i].setSupplier_contact(supplier_contact);
					itemDatabase[i].setPrice(price);
					itemDatabase[i].setAvailable_qty(available_qty);
					
					}
	
		System.out.println("Item ID "+ " Name " + " Description " + " Category " + " Supplier Name " + " Contact "+ " Price " + " Quantity ");
		
		for (int j=0; j<n ; j++ ) {
			System.out.println(itemDatabase[j]);
			}
		System.out.println( itemDatabase[i] + "/t");
		break;
		}
						else if (!pass.equalsIgnoreCase(PASSWORD)) {
							
	
		System.out.println("Incorrect password. You have " +(3 - (count)) + " chance left."); 
		
		if (count == 2) {
			continue;
			}
		
		else if (time == 3) {
			System.out.println("Program detected suspicious activity and terminating!");
			break;	
			}
		}			

	}   
					   		   
}
				if (ans == 2) {
					int count = 0 ;
				    for (count = 0 ;count < 3 ;count += 1) {
				    	while (a == true) {
				    		
				    		System.out.print(" Password : ");
				    		String pass = keys.next();
				    		
				if (pass.equalsIgnoreCase(PASSWORD)) {
		        	System.out.print("enter the item id you want to update : ");
		String id_input = keys.next();
		
		for (int i=0 ; i <n; i++ ) {
			String q = itemDatabase[i].getItem_ID();
			if(id_input.equalsIgnoreCase(q)) {
		
		System.out.println("Your desired item :");
		System.out.println(itemDatabase[i]);
									
		System.out.println("Item ID : " + itemDatabase[i].getItem_ID());
		System.out.println("Name : " + itemDatabase[i].getName());
		System.out.println("Description : " + itemDatabase[i].getDescription());
		System.out.println("Category : " + itemDatabase[i].getCategory());
		System.out.println("Supplier Name : " + itemDatabase[i].getSupplier_name());
		System.out.println("Supplier Contact : " + itemDatabase[i].getSupplier_contact());
		System.out.println("Price : " + itemDatabase[i].getPrice());
		System.out.println("Quantity qty : " + itemDatabase[i].getAvailable_qty());
		
        System.out.println(" ");
        while(true) {
        	System.out.println("What do you want to change ");
        	System.out.println("     1. Name "+ "\n" + "     2. Description " + "\n" + "     3. Category " +"\n " + "     4.Supplier Name " +
			"\n" + "     5.Supplier Contacts " + "\n" + "     6.Price " + "\n" + "     7.Available qty" + "\n" + "     8.Quit" + "\n" +"choice =>" );
        	int choice = keys.nextInt();
        	if (choice == 1) {
        		System.out.print("Name : ");
        		name = keys.next();
        		
        		itemDatabase[i].setName(name);
        		System.out.println(itemDatabase[i]);
        		}
        	else if (choice == 2 ) {
        		System.out.print("Description : ");
        		description = keys.next();
        		
        		itemDatabase[i].setDescription(description);
        		System.out.println(itemDatabase[i]);
        		}
        	else if (choice == 3) {
        		System.out.print("Category : ");
        		category = keys.next();
        		
				itemDatabase[i].setCategory(category);
				System.out.println(itemDatabase[i]);
				}
        	else if (choice == 4) {
        		System.out.print("Supplier_Name : ");
				supplier_name = keys.next();
												
				itemDatabase[i].setSupplier_name(supplier_name);
				System.out.println(itemDatabase[i]);
				}
        	else if(choice == 5) {
        		System.out.print("Supplier_Contact : ");
				supplier_contact = keys.nextInt();
												
				itemDatabase[i].setSupplier_contact(supplier_contact);
				System.out.println(itemDatabase[i]);
				}
        	else if(choice == 6){
        		System.out.print("Price : ");
				price = keys.nextDouble();
												
				itemDatabase[i].setPrice(price);
				System.out.println(itemDatabase[i]);										
				}
        	
			else if(choice == 7) {
				System.out.print("Available quantity : ");
				available_qty = keys.nextInt();
												
				itemDatabase[i].setAvailable_qty(available_qty);
				System.out.println(itemDatabase[i]);
				}
        	else if(choice == 8){
        		a = false;
        		break;
        		}
        	else {
        		System.out.println("Choose between 1-8 only.");
        		}
        	}
		}
	}
}
		        else if (!pass.equalsIgnoreCase(PASSWORD)) {
		        	System.out.println("Incorrect password. You have " +(3 - (count+1)) + " chance left.");
		        	}
		        a = false;  }
				    	if (count == 2) {
				    		break;
				    		}
				    	}
				}
				if (ans == 4) {
					
				}
				if (ans == 3) {
					System.out.print("Please insert Category of items :" );
					String input_cat = keys.next();
					
					for (int i=0; i <n; i++) {
						String y = itemDatabase[i].getCategory();
					 if(input_cat.equalsIgnoreCase(y)) {
						 System.out.println(itemDatabase[i].findItemByCat());						
					 	}
		
					}
				}
				
				if (ans == 5) {
					System.out.print("The number of Items which have been created so far : ");
					Item.totalitem();
				} 
				if(ans == 6) {
					System.out.println("*****************************");
					System.out.println("           Program Quit      ");
					System.out.println("*****************************");
					w = false;
					break;
				}

}

	}
	
}}
