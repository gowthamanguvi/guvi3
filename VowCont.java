package vowl;
import java.util.*;

public class VowCont {

	public static void main(String[] args) {
	     Scanner g=new Scanner(System.in);
   	     System.out.println("Enter the alphabet");
   	     char c=g.next().charAt(0);
	     int a=c;
	     if(64<a && 91>a)
	     {
	    	 switch(c)
		     {
		     case 'A':
		    	 System.out.println("vowel");
		    	 break;
		     case 'E':
		    	 System.out.println("vowel");
		    	 break;
		     case 'I':
		    	 System.out.println("vowel");
		    	 break;
		     case 'O':
		    	 System.out.println("vowel");
		    	 break;
		     case 'U':
		    	 System.out.println("vowel");
		    	 break;
		     default:
		            System.out.println("consonant");
		             break;
		            
		     
			  }
	     }
	     
	     else if (96<a && 123>a)
	    {
	     switch(c)
	     {
	     case 'a':
	    	 System.out.println("vowel");
	    	 break;
	     case 'e':
	    	 System.out.println("vowel");
	    	 break;
	     case 'i':
	    	 System.out.println("vowel");
	    	 break;
	     case 'o':
	    	 System.out.println("vowel");
	    	 break;
	     case 'u':
	    	 System.out.println("vowel");
	    	 break;
	     default:
            System.out.println("consonant");
             break;
            
		  }
	    
	    }
	    
	    else {
	   
	    	 System.out.println("Invalid input");
	    	
	    }
	}

}
