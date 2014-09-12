/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

public class Character {

	//for constructor
	String name;
	int pilot, flight, trade, engineer; 
	int health = 10; //arbitrary starting health

	public Character(String name, int pilot, int flight, int trade, int engineer) {
		self.name = name;
		self.pilot = pilot;
		self.flight = flight;
		self.trade = trade; 
		self.engineer = engineer; 
	}

	//setters
	private void setPilot(int num){pilot += num;}

	private void setFlight(int num){flight += num;}

	private void setTrade(int num){trade += num;}

	private void setEngineer(int num){engineer += num;}

	private void setHealth(int num){health += num;}

	//getters
	private int getPilot(){return pilot;}

	private int getFlight(){return flight;}
	
	private int getTrade(){return trade;}

	private int getEngineer(){return engineer;}

	private int getHealth(){return health;}


}
