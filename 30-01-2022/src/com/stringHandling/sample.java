package com.stringHandling;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Demo demo=Demo.getObj();
			demo.show();
			demo.display();
			
			Demo demo1=Demo.getObj();
			demo1.show();
			demo1.display();
			
			Demo1.sh();
		}
	}
	//Singleton design pattern
	class Demo
	{
		private static Demo demo=new Demo();
		
		Demo()
		{
			System.out.println("Constructor");
		}
		
		public static Demo getObj()
		{
			return demo;
		}
		public void show()
		{
			System.out.println("Hello");
		}
		public void display()
		{
			System.out.println("Display");
		}
	}

	class Demo1
	{
		static void sh()
		{
			Demo demo=Demo.getObj();
			demo.show();
			demo.display();
			
			Demo demo1=Demo.getObj();
			demo1.show();
			demo1.display();
	}

}
