import java.lang.Math;
import java.util.Scanner;

public class BonusScoringSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int students = Integer.parseInt(sc.nextLine());
		int lectures = Integer.parseInt(sc.nextLine());
		int bonus = Integer.parseInt(sc.nextLine());
		
		double maxBonus = 0;
		int maxAttend = 0;
		
		for(int i = 0; i < students; i++){
				int attendance = Integer.parseInt(sc.nextLine());
				
				double totalBonus = attendance/(double)lectures*(5+bonus);
				
				if(totalBonus > maxBonus){
						maxBonus = totalBonus;
						maxAttend = attendance;
				}
		}
		System.out.println("Max Bonus: " + Math.round(maxBonus) + ".");   
        System.out.println("The student has attended " + maxAttend + " lectures."); 
	}
}