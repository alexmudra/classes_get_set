package ClassPlus;

public class Cat {
	String name;
	String color;
	String weight;
	int age;
	private double speed = 0;
		void fast(){
			System.out.println ("Very speedy Cat");
		}
		void eat(){
			System.out.println ("So angry and");
		}
		void speed(double a){
			speed = speed + a;
		}
		void screaming(){
			System.out.println("So noisy Cat");
		} 
		void print(){
			System.out.println("Name: "+name);
			System.out.println("Color: "+color);
			System.out.println("Weignht:"+weight);
			System.out.println("Age: "+age);
			
		}

}
