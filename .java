import java.util.*;
import java.lang.*;
import java.io.*;

class Hello
{
	public static void main (String[] args) throws IOException
	{
	    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br1.readLine());
		    int flag=0;
		    n--;
		    int size=Integer.parseInt(br1.readLine());
		    int ar[]=new int[size];
		    int br[]=new int[size];
		    
		    String str[]=br1.readLine().trim().split("\\s+");
		    for(int i=0;i<str.length;i++)
		    {
		        ar[i]=Integer.parseInt(str[i]);
		        br[i]=Integer.parseInt(str[i]);
		    }
	
		    Arrays.sort(br);
		    
		    for(int i=0;i<size;i++)
		    {
		        if(ar[i]==br[i] && i!=0 && i!=size-1)
		        {
		            if(check(i,size,ar))
		            {
		                System.out.println(ar[i]);
		                flag=1;
		                break;
		            }
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println(-1);
		    }
		
	}
	  public static boolean check(int i,int size,int ar[])
	  {
	      for(int j=0;j<i;j++)
	      {
	          if(ar[j]>ar[i])
	          {
	              return false;
	          }
	      }
	      for(int j=i+1;j<size;j++)
	      {
	          if(ar[j]<ar[i])
	          {
	              return false;
	          }
	      }
	      return true;
	  }
}
