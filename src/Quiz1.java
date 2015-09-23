import java.util.Scanner;

public class Quiz1 {		

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Number of touchdowns: ");
		double TD = scn.nextInt();
		System.out.println("Total yards: ");
		double yards = scn.nextInt();
		System.out.println("Interceptions: ");
		double INT = scn.nextInt();
		System.out.println("Completions: ");
		double comp = scn.nextInt();
		System.out.println("Passes attempted: ");
		double ATT = scn.nextInt();
		
		double a = (((comp/ATT)-.3)*5);
		double b = (((yards/ATT)-3)*.25);
		double c = (((TD/ATT))*20);
		double d = 2.375-((INT/ATT)*25);
		
		double PR = (((a+b+c+d)/6)*100);
		System.out.println("The Passer Ranking of this player is: " +PR);
	}
	
}
