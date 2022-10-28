class Adition{


public static String add(int a,int b){

int sum=a+b;

return "The sum of "+a+" and "+b+ " is "+sum;
}


public static void main(String[] args)
{

java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a=sc.nextInt();
System.out.println("Enter 2nd Number");
int b=sc.nextInt();

System.out.println(add(a,b));
}

}