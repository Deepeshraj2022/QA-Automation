class conditional1
{


public static void main(String[] args)
{
//if condtional statement

java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
 if(a%2==0 || a%5==0)
{
System.out.println( a+" is a even number or also divisible by 5");
}else
{
System.out.println( a+" is a not even number or also not divisible by 5");
}

}
}