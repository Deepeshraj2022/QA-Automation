class uniaryOperator4
{


public static void main(String[] args)
{
int x=1;
int y=1;

      //0 -  1
     x=--x - y--;
      // -1 -   -1
     y=x-- - --y;
System.out.println("x="+x);//-2
System.out.println("y="+y);//0

}
}