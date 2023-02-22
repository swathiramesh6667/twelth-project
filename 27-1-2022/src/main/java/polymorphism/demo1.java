package polymorphism;

public class demo1 {

	public static void main(String[] args) 
	{
     Addition add=new Addition();
     add.add(20, 30);
     add.add(0, 9, 5);
     add.add(7, 9, 6, 10);
	}

}
 class Addition
 {
	 void add (int a, int b)
	 {
		 System.out.println((a+b));
	 }
	 void add (int a, int b, int c)
	 {
		 System.out.println((a+b+c));
	 }
	 void add (int a, int b, int c, int d)
	 {
		 System.out.println((a+b+c+d));
	 }
 }