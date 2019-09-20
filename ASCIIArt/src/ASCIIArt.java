/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 


public class ASCIIArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		antenna();
		face();
		body();
		lowerBody();
	}
	public static void face() {
		// special character /n
		System.out.println("                  |--------------| ");
		System.out.println("                  |   --    --   | ");
		System.out.println("                 _|    |     |   |_ ");
		System.out.println("                | |              | |");
		System.out.print("                | |      /\\      | |");
		System.out.println("\n                | |              | |");
		System.out.println("                - |    \\____/    |-");
		System.out.println("                  |--------------| ");
	}
	public static void body() {
		neck();
		bodyLines();
		bodyLines();
		System.out.println("       ____|----------------------------|____");
		System.out.println("      / - /|----------------------------|\\ - \\");
		System.out.println("     / - / |----------------------------| \\ - \\");
		System.out.println("     |  |  |----------------------------|  |  |");
		System.out.println("     |  |  |----------------------------|  |  |");
		System.out.println("     |  |  |----------------------------|  |  |");
		System.out.println("     |  |  |----------------------------|  |  |");
		System.out.println("     |  |  |----------------------------|  |  |");
		System.out.println("     |  |  |----------------------------|  |  |");
		System.out.println("    / \\ /\\ |----------------------------| / \\ /\\");
		System.out.println("           |____________________________|");

	}
	public static void lowerBody() {
		pairOfLegs();
		pairOfLegs();
		pairOfLegs();
		pairOfLegs();
		pairOfLegs();
		feet();
	}
	public static void antenna() {
		System.out.println("                          _      ");
		System.out.println("                         / \\      ");
		System.out.println("                         |_|        ");
		System.out.println("                         |_|       ");
		System.out.println("                         \\_/      ");
	}
	public static void neck() {
		neckLines();
		neckLines();
	}
	public static void neckLines() {
		System.out.println("                       |----|    ");
	}
	public static void bodyLines() {
		System.out.println("           |----------------------------|");
	}
	public static void pairOfLegs() {
		System.out.println("                |  --  |     |  --  |     ");
	}
	public static void feet() {
		System.out.println("                /------|     |------\\");
		System.out.println("           -----       |     |       -----");
        System.out.println("           |___________|     |____________|");
	}
}
