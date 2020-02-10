/**
 * 
 */

/**
 * @author Dell
 *
 */
public class Item {
	
	/*attribute*/
	private String item_ID;
	private String name;
	private String description;
	private String category;
	private String supplier_name;
	private int supplier_contact;
	private double price;
	private int available_qty;
	static int totalItems = 0;
	
	/**
	 * default constructor
	 */
	public Item() {}
	
	/**
	 * 8 parameter
	 * @param item_ID
	 * @param name
	 * @param description
	 * @param category
	 * @param supplier_name
	 * @param supplier_contact
	 * @param price
	 * @param available_qty
	 */
	public Item(String item_ID, String name, String description, String category, String supplier_name, int supplier_contact,
			double price, int available_qty) {
		this.item_ID = item_ID;
		this.name = name;
		this.description = description;
		this.category = category;
		this.supplier_name = supplier_name;
		this.supplier_contact = supplier_contact;
		this.price = price;
		this.available_qty = available_qty;
	}
	/*------------------------------------------------*/
	/*--------------------GETTER----------------------*/

	/**
	 * @return the item_ID
	 */
	public String getItem_ID() {
		return item_ID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the supplier_name
	 */
	public String getSupplier_name() {
		return supplier_name;
	}

	/**
	 * @return the supplier_contact
	 */
	public int getSupplier_contact() {
		return supplier_contact;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the availablr_qty
	 */
	public int getAvailable_qty() {
		return available_qty;
	}

	/*-----------------------------------------------*/
	/*-----------SETTER------------------------------*/
	
	/**
	 * @param item_ID the item_ID to set
	 */
	public void setItem_ID(String item_ID) {
		this.item_ID = item_ID;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param supplier_name the supplier_name to set
	 */
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	/**
	 * @param supplier_contact the supplier_contact to set
	 */
	public void setSupplier_contact(int supplier_contact) {
		this.supplier_contact = supplier_contact;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param availablr_qty the availablr_qty to set
	 */
	public void setAvailable_qty(int available_qty) {
		this.available_qty = available_qty;
	}
	
	/*-------------------------------------------*/
	/**
	 * To--String
	 */
	public String toString() {
		return(this.item_ID + " " + this.name+ " "+ this.description+ " "+ this.category+ " "+ this.supplier_name+ " "
				+ this.supplier_contact+ " " + this.price+ " " + this.available_qty);
	}
	
	/*--------------------------------------------------------------*/
	
	public boolean equals(Item p ) {
		if (this.item_ID.equalsIgnoreCase(p.item_ID)) {
			return true;
		}
		else {
			return false ; 
		}
	}
	public String findItemByCat() {
		 return(this.item_ID + "  " + this.name+ "  " + this.description + "  " + this.supplier_name + "  "
	+ this.supplier_contact+ "  " + this.price+ "  " + this.available_qty);
		}
	
		
	public static void totalitem() {
		System.out.println(totalItems);
		}
		public static int totalitems() {
			return totalItems;
	}
}


