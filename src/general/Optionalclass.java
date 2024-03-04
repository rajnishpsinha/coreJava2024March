package general;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
public class Optionalclass {

	private String colour;
	private int speed;
	private LocalDate dateOfPurchase;

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Optional<LocalDate> getDateOfPurchase() {
		return Optional.ofNullable(dateOfPurchase);
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public Optionalclass(String colour, int speed, LocalDate localDate) {
		super();
		this.colour = colour;
		this.speed = speed;
		this.dateOfPurchase = localDate;
	}
 public static void main(String[] args) {
	 Optionalclass maruticar = new Optionalclass("Red",80, LocalDate.of(2018, 05, 21));
	 Optionalclass santrocar = new Optionalclass("Red",80, null);
	 System.out.println(maruticar.getDateOfPurchase().orElseGet(()->LocalDate.of(2015, 02, 14)));
	 System.out.println(santrocar.getDateOfPurchase().orElseGet(()->LocalDate.of(2015, 02, 14)));

}
	
}
