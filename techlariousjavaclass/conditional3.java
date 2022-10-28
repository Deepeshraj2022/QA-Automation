class conditional3
{


public static void main(String[] args)
{
//if condtional statement

java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a=sc.nextInt();

if(a%2==0)
      {
        if(a%5==0)
           {
             System.out.println("Number is divisible by 2 and 5");
            }else{
             System.out.println("Number is divisible by 2 but not 5");
                  }
        }
           else{
                 System.out.println("Number is not divisible by 2 and 5 both");
               } 
}
}