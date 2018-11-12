package game;

public class Progression {
	String WTypes, Item, Name="chara";
	int level;
	public String Weapon(int weapon) {
		
		if(weapon==0) {
			WTypes="None";
		}else if(weapon==1) {
			WTypes="Stick";
		}else if(weapon==2) {
			WTypes="Toy Sword";
		}else if(weapon==3) {
			WTypes="Toy Knife";
		}else if(weapon==4) {
			WTypes="Burnt Pan";
		}else if(weapon==5) {
			WTypes="Book of Spells";
		}else if(weapon==6) {
			WTypes="King's Trident";
		}else if(weapon==7) {
			WTypes="True Knife";
		}else {
			weapon=0;
			WTypes="None";
		}
		return WTypes;
	}
	
	public String Item(int item) {
		
		if(item==0) {
			Item="None";
		}else if(item==1) {
			Item="Monster Candy";
		}else if(item==2) {
			Item="Spider Donut";
		}else if(item==3) {
			Item="Spider Cider";
		}else if(item==4) {
			Item="Butterscotch/Snail Pie";
		}else {
			item=0;
			Item="None";
		}
		return Item;
	}
	
	public int Level(int levelup) {
		level=levelup+level;
		return level;
	}
	
	public String Naming(String Na) {
		Name=Na;
		return Name;
	}
	
	public String Name() {
		return Name;
	}
	
}

// int map, int inventory, int item