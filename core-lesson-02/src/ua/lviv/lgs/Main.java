package ua.lviv.lgs;


public class Main {

public static void main(String[] args) {

   System.out.println ("Rectangle");
   
   System.out.println ();
   
   Rectangle a1 = new Rectangle();
// Створення обьекта по конструкціїї 2
   Rectangle a2 = new Rectangle (3, 1);
   System.out.println ("Прямокутник 1 = " + a1);
   System.out.println ("Прямокутник 2 = " + a2);
   System.out.println ();


	System.out.println ("Площа прямокутника 1 = " + a1.GetArea (a1.getLength(),a1.getWidth()));
	System.out.println ("Площа прямокутника 2 = " + a2.GetArea (a2.getLength(),a2.getWidth()));

	System.out.println ();

	System.out.println ("Периметр прямокутника 1 = " + a1.GetPerim (a1.getLength(),a1.getWidth()));
	System.out.println ("Периметр прямокутника 2 = " + a2.GetPerim (a2.getLength(), a2.getWidth()));

	System.out.println ();

	System.out.println ("Circle");

	Circle a = new Circle (5,10);

	System.out.println ( a );
	
	System.out.println ("Площа кола = " + a.area(a.getDiameter()));
	System.out.println ("Довжина кола = " + a.length((a.getRadius())));
	
 }

}

