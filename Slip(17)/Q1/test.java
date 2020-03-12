
import java.io.*;
import java.util.*;

abstract class staff
{
  String name,addr;
  public staff(String x,String y)
  {
    name=x;
    addr=y;
   }

  abstract void display();
}
class Fulltimestaff extends staff
{
	 String dep;
	 Double salary;
 	public Fulltimestaff(String a,String b,String c,Double d)
 	{
 		  super(a,b);
 		  dep=c;
 		  salary=d;
    }
 	void display()
    {
 	  System.out.println(name+"\t  "+addr+"\t\t"+dep+"\t\t"+salary);
    }
}
class Parttimestaff extends staff
{
   	int hours;
   	Double rate;
   public Parttimestaff(String p,String q,int s,Double t)
   {
      	 super(p,q);
      	 hours=s;
      	 rate=t;
   }
   void display()
   {
     System.out.println(name+"\t  "+addr+"\t\t"+hours+"\t\t"+rate);
   }
}
class test
{
  public static void main(String args[]) throws Exception
  {
    
   		 int i;
   		 Scanner s=new Scanner(System.in);
   		 System.out.println("Enter how many objects:");
   		 int n=s.nextInt();
   		 Fulltimestaff[] f=new Fulltimestaff[n];
   		 Parttimestaff[] f1=new Parttimestaff[n];
    	 System.out.println("Enter type of staff:");
   		 String d=s.next();
      if(d.equals("fulltimestaff"))
    {
      for(i=0;i<n;i++)
      {
      System.out.println("Enter name:");
      String a=s.next();
      System.out.println("Enter address:");
      String b=s.next();
      System.out.println("Enter department:");
      String c=s.next();
      System.out.println("Enter Salary");
      Double e=s.nextDouble();
      f[i]=new Fulltimestaff(a,b,c,e);
    }
      System.out.println("Name \t Address \t Depart \t Salary ");
      for(i=0;i<n;i++)
      f[i].display();
    }
    else
    {
      for(i=0;i<n;i++)
      {
      System.out.println("Enter name:");
      String a1=s.next();
      System.out.println("Enter address:");
      String b1=s.next();
      System.out.println("Enter No of hours:");
      int c1=s.nextInt();
      System.out.println("Enter Rate per hour");
      Double d1=s.nextDouble();
      f1[i]=new Parttimestaff(a1,b1,c1,d1);
      }
      System.out.println("Name \t Address \t Depart \t Salary ");
      for(i=0;i<n;i++)
      f1[i].display();
    }
  }
}

