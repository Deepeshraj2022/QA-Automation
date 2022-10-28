class Methodoverload1{


//Method Overloading


public static int addition(int a,int b){

return a+b;
}
public static String addition(boolean b1,boolean b2){

return b1+" and "+b2;
}

public static void main(String[] args)
{

System.out.println("Intvalue="+addition(45,67));
System.out.println("Intvalue="+addition(true,true));
}
}