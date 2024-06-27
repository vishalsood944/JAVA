package Practice;

public class constructor {

	// Java Practice 
	// Constructor with This keyword
	
	
	public constructor()
	{
		this(33);
		System.out.println("Global constructer");
	}
	
	public constructor(int a, int b)
	{
		this(54,55,44);
		System.out.println("2 parametrized constructer");
	}
	
	public constructor(int a)
	{this(54,55);
		System.out.println("1 parametrized constructer");
	}
	
	public constructor(int a, int b, int c)
	{
		System.out.println("3 parametrized constructer");
	}
	
	public constructor(int a, int b, int c, int d)
	{
		this();
		System.out.println("4 parametrized constructer");
	}
	
	public static void main(String[] args) {
		
		//constructor vishal=new constructor();
		//constructor visha=new constructor(22,22);
		//constructor vishal2=new constructor(22,22,33);
		//constructor vishal3=new constructor(22);
		constructor vishal4=new constructor(22,22,44,44);

	}
}