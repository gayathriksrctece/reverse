import java.io.*;
import java.util.*;
public class Reversestring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1="";
int i=0;
int l=s.length();
for(i=l-1;i>=0;i--)
{
s1=s1+s.charAt(i);
}
System.out.println("Reverse string:"+s1);
}
}
