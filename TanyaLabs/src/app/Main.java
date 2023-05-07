package app;
import java.util.*;

public class Main {
	public static List<String> userNames = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Data loading...");
		userNames = MySQLAppRepository.getFromDB();
		new Application().start();
		MySQLAppRepository.saveToDB(userNames);
		System.out.println("Data saving...");
	}
}