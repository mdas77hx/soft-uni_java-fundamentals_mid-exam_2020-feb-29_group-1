import java.util.*;

public class MuOnline 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		String firstLine = sc.nextLine();

		String[] rooms = firstLine.split("\\|");
		
		int bitcoins = 0;
		
		int health = 100;
		
		int passedRooms = 0;
		
		for(int i = 0; i < rooms.length; i++){
			String[] commandParts = rooms[i].split(" ");
			int num = Integer.parseInt(commandParts[1]);
			passedRooms++;

			switch(commandParts[0]){
				
					case "potion":
					 
					if(health + num > 100){
						System.out.println( "You healed for " + (100 - health) + " hp.");
						health = 100;
						
					}else{
						health += num;
						System.out.println( "You healed for " + num + " hp.");
						
					} 
					
					System.out.println( "Current health: " + health + " hp." );
					 
					break;
					
					case "chest":
					 
					System.out.println( "You found " + num + " bitcoins." );
					bitcoins += num;
					 
					break;
					
					default:
					 
					health -= num;
					if(health > 0){
						System.out.println("You slayed " + commandParts[0] + ".");
						 
					}else{
						
						System.out.println( "You died! Killed by " + commandParts[0] + "." );
						System.out.println( "Best room: " + passedRooms );
						return;
					}
					break;
			}	
		}
		System.out.println("You've made it!"); 
		System.out.println("Bitcoins: " + bitcoins); 
		System.out.println("Health: " + health); 
    }
}