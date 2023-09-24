package com.java;
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	String quType;
	String airName;
	String destination;
	int toLand;
	String callSignTo;
	
	public Main() {
		int menu;
		do {
			Menu();
		try {
			menu = sc.nextInt();
			sc.nextLine();
			
		}catch(Exception e) {
			menu = 0;
			System.out.println("Input must be numeric!");
			sc.nextLine();
		}
		switch (menu){
		
		case 1: AddRunwayQueue();
		break;
		
		case 2: TakeoffOrLand();
		break;
		
		case 3: ViewRunwayQueue();
		break;
		
		default:
			break;
		
		}
			
		}while(menu !=4);
		
	}

	private void AddRunwayQueue() {
		do {
			System.out.println("Enter queue type [ Takeoff / Landing ]: ");
			quType = sc.nextLine();
		}while(!quType.equals("Takeoff") || !quType.equals("Landing"));
		
		do {
			System.out.println("Enter airplane name [Starts with airbus / boeing]: ");
			airName = sc.nextLine();
		}while (!airName.startsWith("Airbus") && !airName.startsWith("Boeing"));
		
		if(quType.equals("Takeoff")) {
			do {
				System.out.println("Enter flight destination [2 - 20 characters]: ");
				destination = sc.nextLine();
			}while(destination.length()<2 || destination.length()>20);
			
			do {
				System.out.println("Enter minimum takeoff runway length [ more than 0]:");
				toLand = sc.nextInt();
				sc.nextLine();
			}while(toLand <=0); 
			
			Scanner rand = null;
			callSignTo = ("TO" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9));
			
		}
		
	}

	private void TakeoffOrLand() {
		// TODO Auto-generated method stub
		
	}

	private void ViewRunwayQueue() {
		// TODO Auto-generated method stub
		
	}

	private void Menu() {
		System.out.println("1. Add Runway Queue");
		System.out.println("2. Takeoff / Land");
		System.out.println("3. View Runway Queue");
		System.out.println("4. Exit");
		System.out.println(">> ");
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
