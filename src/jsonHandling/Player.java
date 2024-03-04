//Using Gson
package jsonHandling;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;



public class Player {
	private String name;
	private String game;
	private byte age;

	public static void main(String[] args) {
Player player = new Player();
player.setName("Virat Kohli");
player.setGame("Cricket");
player.setAge((byte) 29);
GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
Gson gson= builder.create();

try {
FileWriter writer=  new FileWriter("E:\\testJson.json");
gson.toJson(player,writer);
writer.flush();
writer.close();
} catch (JsonIOException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println( "Player is :"+player.getName());

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the game
	 */
	public String getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(String game) {
		this.game = game;
	}

	/**
	 * @return the age
	 */
	public byte getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(byte age) {
		this.age = age;
	}

}
