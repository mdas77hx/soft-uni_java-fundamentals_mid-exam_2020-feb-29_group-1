import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		String firstLine = sc.nextLine();
		
		List<String> inventory = new ArrayList<>( Arrays.asList( firstLine.split(", ") ) );

		String command = sc.nextLine();
		
		while( !command.equals("Craft!") ){
			String[] commandParts = command.split(" - ");
			
			switch(commandParts[0]){
				
					case "Collect":
						if(!inventory.contains(commandParts[1])){
							inventory.add(commandParts[1]); 
						}
						break;
					
					case "Drop":
						if(inventory.contains(commandParts[1])){
							inventory.remove(commandParts[1]); 
						}
						break;
					
					case "Combine Items":
						String[] items = commandParts[1].split(":");
						String oldItem = items[0];
						String newItem = items[1];
					 
						for(int i = 0; i < inventory.size(); i++){
							if( inventory.get(i).equals(oldItem) ){
								 
								inventory.add( i+1, newItem );	
								 	
							}	
						}
				 
						break;
					
					case "Renew":
					if(inventory.contains(commandParts[1])){
						inventory.remove(commandParts[1]);
						inventory.add(commandParts[1]);
					}
					break;
			}
			if(sc.hasNextLine()){
				 command = sc.nextLine();
			}
		}
		String result = String.join(", ", inventory);
		System.out.println(result);
    }
}