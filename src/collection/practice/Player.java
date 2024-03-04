package collection.practice;


public class Player {
	
	private int age;
	private String name;
	private String game;
	
	public Player(int age, String name, String game) {
		super();
		this.age = age;
		this.name = name;
		this.game = game;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}

}
