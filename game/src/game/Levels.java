package game;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Levels {
	Scanner input = new Scanner(System.in);
	Tools tools = new Tools();
	Progression prog = new Progression();
	Main main = new Main();
	String Map;
	public String Map(int map) {
		int dummy;
		
		if (map==0) {
			while(1==1) {
				System.out.println("DOG_ROOM");
				
			}
		}else if(map==2) {
			System.out.println("Welcome to Undertale");
			tools.waita(1000);
			System.out.println("Name the fallen human");
		}else if(map==3) {
			if(prog.Name.equalsIgnoreCase("chara")) {
				System.out.println("The True Name.");
				
			}else if(prog.Name.equalsIgnoreCase("mtt")||prog.Name.equalsIgnoreCase("metta")) {
				System.out.println("OOOOH!!! ARE YOU PROMOTING MY BRAND?");
				
			}else if(prog.Name.equalsIgnoreCase("gaster")) {
				while(1==1) {
					System.out.println("👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎");
				}
				
			}else if(prog.Name.equalsIgnoreCase("Alphys")) {
				System.out.println("D-don't do that.");
				
			}else if(prog.Name.equalsIgnoreCase("Undyne")) {
				System.out.println("Get your OWN name!");
				
			}else if(prog.Name.equalsIgnoreCase("Asgore")) {
				System.out.println("You cannot");
				
			}else if(prog.Name.equalsIgnoreCase("Asriel")) {
				System.out.println("...");
				
			}else if(prog.Name.equalsIgnoreCase("Flowey")) {
				System.out.println("I already CHOSE that name.");
				
			}else if(prog.Name.equalsIgnoreCase("sans")) {
				System.out.println("nope");
				
			}else if(prog.Name.equalsIgnoreCase("toriel")) {
				System.out.println("I think you should think of your own name, my child.");
				
			}else if(prog.Name.equalsIgnoreCase("papyrus")) {
				System.out.println("I'LL ALLOW IT!!!");
			
			}else {
				
			}
			
			System.out.println("... " + prog.Name + ". Interesting name.");
			
		}else if(map==4) {
			System.out.println("You find yourself in an empty room. light shines down through the hole that you fell through. below you are golden yellow flowers that probably cushoned your fall");
			input.next();
			System.out.println("There's an exit to the cavern to the left down a long hallway");
			input.next();
			System.out.println("Leave the room?");
			
		}else if (map==5) {
			System.out.println("The next room is pitch black, the exeption being a beam of light iluminating a single golden flower");
			input.next();
			System.out.println("approch the flower?");
		}else if(map==6) {
			System.out.println("You Approch the flower, seeing as there's no other way to go");
			System.out.println();
			input.next();
			System.out.println("The flower judges you with it's beady eyes before noticing your gaze");
			System.out.println("It speaks up");
			System.out.println();
			input.next();
			System.out.println("Flowey: Hiya, I'm Flowey, Flowey the flower!");
			input.next();
			System.out.println("Flowey: Hmmm...");
			System.out.println();
			input.next();
			System.out.println("Flowey: You're new to the undergound, aren'tcha?");
			System.out.println("Flowey: Golly, you must be so confused.");
			input.next();
			System.out.println("Flowey: Someone ought to teach you how things work around here.");
			input.next();
			System.out.println("Flowey: I guess little old me will have to do!");
			input.next();
			System.out.println();
			input.next();
			System.out.println("Flowey: Ready?");
			input.next();
			System.out.println();
			System.out.println("Flowey: Here we go!");
		}else if (map==7) {
			System.out.println("A brillently red heart shaped thing apears in front of you");
			System.out.println("Flowey: See that? That's your soul, the very culmination of your being");
			System.out.println("Your soul floats lazily , but with minimal effort, you figure out how to move it around");
			input.next();
			System.out.println("Flowey: Here in the undergroud, love is shared by \"friendliness pellets\"");
			System.out.println("Flowey: You want some love, don'tcha?");
			System.out.println("A single white sphere appears in front of you, run into it?");
			
		}else if(map==8) {
			System.out.println("You run into the friendliness pellet, you instantly feel like you're burning alive");
			tools.waita(2000);
			System.out.println();
			System.out.print("Flowey: ");
			tools.waita(1000);
			System.out.print("Y");
			tools.waita(1000);
			System.out.print("O");
			tools.waita(1000);
			System.out.print("U");
			tools.waita(1000);
			System.out.print(" ");
			tools.waita(1000);
			System.out.print("F");
			tools.waita(1000);
			System.out.print("O");
			tools.waita(1000);
			System.out.print("O");
			tools.waita(1000);
			System.out.print("L");
			tools.waita(1000);
			
		}else if(map==9) {
			System.out.println("You avoid the pellet, the flower looks at you angerly");
			tools.waita(2000);
			System.out.println();
			System.out.print("Flowey: ");
			tools.waita(1000);
			System.out.print("Y");
			tools.waita(1000);
			System.out.print("O");
			tools.waita(1000);
			System.out.print("U");
			tools.waita(1000);
			System.out.print(" ");
			tools.waita(1000);
			System.out.print("K");
			tools.waita(1000);
			System.out.print("N");
			tools.waita(1000);
			System.out.print("E");
			tools.waita(1000);
			System.out.print("W");
			tools.waita(1000);
			
		}
		
		return Map;
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
		//System.out.println();
	}
	
}


