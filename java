import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a[] =new int[7];
	    System.out.println("values are :");
	    for (int i=0;i<7;i++){
	      a[i]=in.nextInt();
	    }
	      int m=a[0];
	    for (int i=0;i<7;i++){
	      if(m<a[i]){
	         m=a[i];
	      }
	    }
	    System.out.println("maximum value is :" +m);
	}
}
