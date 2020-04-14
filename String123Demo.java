import java.util.*;
class String123Demo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any String");
String s1=sc.nextLine();
System.out.println("no of char:"+s1.length());
int d=0,u=0,l=0,L=0,w=0;
char s[]=s1.toCharArray();
for(int i=0;i<s.length;i++)
{
	char ch=s[i];
	if(Character.isDigit(ch))
	{d++;	}
if(Character.isUpperCase(ch))
	{u++;	}
if(Character.isLetter(ch))
	{L++;	}
if(Character.isLowerCase(ch))
	{l++;	}
if(Character.isWhitespace(ch))
	{w++;	}
}
System.out.println("no of digits="+d);
System.out.println("no of LowerCase="+l);
System.out.println("no of UpperCase="+u);
System.out.println("no of Letters="+L);
System.out.println("no ofWhitespace="+w);
}
}
