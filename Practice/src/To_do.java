import java.util.ArrayList;
import java.util.Scanner;

public class To_do {

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		int option = 0;
		String txt;
		int id;
		
		Scanner scn = new Scanner(System.in);
		
		while (option != 4) {
			System.out.println("\n                          TASK LIST");
			System.out.println(" _________________________________________________________");
			System.out.println("| ID  |    TASK                              |   STATUS   |");
			System.out.println("|---------------------------------------------------------|");
			
			// Printing all items
			for (int i=0; i<items.size(); i++) {
				System.out.print(String.format("| %-4d" + "|    ", items.get(i).getId()) + String.format("%-33s", items.get(i).getText()) + " ");
				if (items.get(i).getStatus()) 
					System.out.println("|  Finished  |");
				else
					System.out.println("|  Pending   |");
			}
			
			System.out.println("|                                                         |");
			System.out.println("|_________________________________________________________|");
			// Waiting for the next action
			System.out.println("\n\n\n1. Add task | 2. Remove task | 3. Complete task | 4. Exit");
			try {
				option = scn.nextInt();
			} catch (Exception e){
				System.out.println("ERROR: Enter a valid option.");
				return;
			} 
			switch (option) {
			case 1:
				System.out.print("Enter the task: ");
				scn.nextLine();
				txt = scn.nextLine();
				items.add(new Item(items.size(), txt));
				break;
			case 2: 
				System.out.print("Enter the ID to be removed: ");
				do {
					id = scn.nextInt();
					
					if (id >= items.size())
						System.out.println("Enter a valid ID. Try again.");
					else {
						items.remove(id);
						for (int i=0; i<=items.size()-1; i++) {
							items.get(i).setId(i);
						}
					}
				} while (id >= items.size());
				break;
			case 3:
				System.out.print("Enter the ID: ");
				do {
					id = scn.nextInt();
					
					if (id >= items.size())
						System.out.println("Enter a valid ID. Try again.");
					else 
						items.get(id).setCompleted();
				} while (id >= items.size());
				break;
			case 4:
				System.out.println("Bye!");
				break;
			default: 
				System.out.println("Enter a valid option.");
			}
		}
		scn.close();
	}
}

class Item {
	private boolean isComplete = false;
	private String text;
	private int id;
	
	public Item(int id, String texto) {
		setText(texto);
		setId(id);
	}
	
	String getText() {
		return text;
	}
	
	void setText(String text) {
		this.text = text;
	}
	
	void check() {
		this.isComplete = true;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	int getId() {
		return this.id;
	}
	
	boolean getStatus() {
		return this.isComplete;
	}
	
	void setCompleted() {
		this.isComplete = true;
	}
}
