import java.util.*;
class Char
{
public static void main(String args[])
{
char a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the char1:");
a=sc.next().charAt(0);
System.out.println("enter the char2:");
b=sc.next().charAt(0);
if(a>b)
{
System.out.println("the ascending order is"+b+" "+a);
}
else
{
System.out.println("the ascending order is"+a+" "+b);
}
}
}




