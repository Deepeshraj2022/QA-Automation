class Method
{

//Syntax
public static void methodTest()
{
System.out.println("MethodTest in Method");
}



public static void main(String[] args)
{
System.out.println("Main method starts");
methodTest();
methodTest();
methodTest();
methodTest1();
System.out.println("Main method ends");

}

public static void methodTest1()
{
System.out.println("MethodTest1 in Method");
}
}