package controller;

import java.util.List;
import java.util.Scanner;

import com.dao.Restuarant_Inteface;
import com.dao.Search_rest;
import com.model.Reastuarant;

public class mainStudent {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		Restuarant_Inteface resturent1 = new Search_rest();
		int choice = 0;
		do {
			System.out.println("1. Search Restaurant");
			System.out.println("2. Add Restaurant");
			System.out.println("3. Update Restaurant");
			System.out.println("4.Delete Restaurant");
			
			
			System.out.println("Enter your choice");
			choice = scn.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter restuarant name to search the details ");
				String name = scn.next();
				List<Reastuarant> al =resturent1.searchRestuarent(name);
				for(Reastuarant res: al) {
					System.out.println(res.getRest_id()+","+res.getRestua_name() + "," +res.getAddress()+"," +res.getOpening_time()+","+res.getClosing_time()+","+res.isActive());
				}
				
				break;
			case 2:
				System.out.println("Enter the Restuarant ID");
				int rest_id = scn.nextInt();
				System.out.println("Enter the Restuarant Name");
				String rest_name = scn.next();
				
				System.out.println("Enter the Restuarant Address");
				String rest_address = scn.next();
				
				System.out.println("Enter the Restuarant opening Time");
				String opening_Time = scn.next();
				System.out.println("Enter the Restuarant closingTime");
				String closingtime = scn.next();
				System.out.println("Enter the Restuarant Active/Inactive");
				int active = scn.nextInt();
				
				Reastuarant re  =  new Reastuarant(rest_id,  rest_name,  rest_address,  opening_Time, closingtime , active);
				
				resturent1.addRestuarent(re);
				break;
				
			case 3:
				System.out.println("enter the ID you want to update");
				int update_id = scn.nextInt();
				
				 System.out.println("Enter the Restuarant Name");
				 rest_name =scn.next();
			
				
				System.out.println("Enter the Restuarant Address");
				 rest_address = scn.next();
				
				System.out.println("Enter the Restuarant opening Time");
				 opening_Time = scn.next();
				System.out.println("Enter the Restuarant closingTime");
				 closingtime = scn.next();
				System.out.println("Enter the Restuarant Active/Inactive");
				 active = scn.nextInt();
				Reastuarant re1  =  new Reastuarant(update_id,  rest_name,  rest_address,  opening_Time, closingtime , active);
				
				resturent1.UpdateRestuarent(re1);
				break;
			case 4:
				System.out.println("enter the ID you want to Delete");
				int delete_id = scn.nextInt();
				resturent1.deleteRestuarent(delete_id);
				
				
				break;
			
			}
			
		} while(flag);

	}

}
