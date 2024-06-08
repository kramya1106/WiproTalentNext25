import java.util.*;
class Command
{
public static void main(String args[])
{
if(args.length==0)
{
System.out.println("no values");
}
else
{
System.out.println("values entered");
System.out.print(args[0]);
for(int i=1;i<args.length;i++)
{
System.out.print(" , "+args[i]);
}
}
}
}
