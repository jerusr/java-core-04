package ua.lviv.lgs;

public class Application {
public static void main(String[] args) {
	
	Robot R = new Robot("Я Robot - я просто працюю!");
	Robot Coffe = new Robot("Я CoffeRobot - я варю каву!");
	Robot Dancer = new Robot("Я RobotDancer - я просто танцюю! ");
	Robot Coocker = new Robot("Я RobotCoocker - я просто готую! ");

	System.out.println("Array");

	Robot[] array = new Robot[4];
	array[0] = R;
	array[1] = Coffe;
	array[2] = Dancer;
	array[3] = Coocker;
	for (int i = 0; i < 4; i++) {
		System.out.println(array[i]);
	}
	
	
	System.out.println();
	System.out.println();


	Animal a = new Animal("Леопард", 7, 20);

	System.out.print("Назва тварини = " + a.getName());
	System.out.print(", Вік тварини = " + a.getAge());
	System.out.print(", Швидкість тварини = " + a.getSpeed());
	System.out.println();

	a.setName("Бик");
	a.setSpeed(2);
	a.setAge(14);

	System.out.println(a);

 }
}

