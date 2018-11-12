package game;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Levels map = new Levels();
		Progression prog = new Progression();
		Tools tools = new Tools();
		String Name, Choice;
		int choice;
		
		map.Map(2);
		prog.Naming(input.nextLine());
		System.out.println(prog.Name());
		map.Map(3);
		map.Map(4);
		Choice = input.nextLine();
		if(Choice.equalsIgnoreCase("no")) {
			System.out.println("You sit in the dark, the sound of nothing reverberating inside you");
			tools.waita(1);
		}else {
			map.Map(5);
		}
		
		map.Map(6);
		map.Map(7);
		Choice = input.nextLine();
		if(Choice.equalsIgnoreCase("no")) {
			map.Map(8);	
		}else if(Choice.equalsIgnoreCase("yes")) {
			map.Map(9);
		}else {
			map.Map(8);
		}
	}

}
