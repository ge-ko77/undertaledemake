package game;

public class Tools {
	public static void waita(int i) {
		try {
			Thread.sleep( i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		}

