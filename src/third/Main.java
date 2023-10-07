package third;

interface Animal{
	void eat();
	void sound();
}
interface Tiredanimal extends Animal{
	void sleep();
}

class Lion implements Animal{
	public void eat() {
		System.out.println("Lions are carnivores and eat meat");
	}
	public void sound() {
		System.out.println("Lions roar loudly");
	}
	public void body(){
		System.out.println("Lions have 4 legs");
	}
}

class Snake implements Tiredanimal{
	public void eat() {
		System.out.println("Snakes swallow their prey whole");
	}
	public void sound() {
		System.out.println("Snakes hiss to communicate");

	}
	public void sleep() {
		System.out.println("Snakes sleep after eating their prey");
	}
	public void body(){
		System.out.println("Snakes have 0 legs");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();
		Snake snake = new Snake();
		lion.eat();
		lion.sound();
		lion.body();
		snake.eat();
		snake.sound();
		snake.sleep();
		snake.body();
	}

}
