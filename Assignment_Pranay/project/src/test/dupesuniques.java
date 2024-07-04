package test;

class StringMethods{
	public String getUnique(String str) {
		
		String res="";
		for (int i = 0; i < str.length(); i++)
	    {
	        int flag = 0;
	        for (int j = 0; j < str.length(); j++)
	        {
	            // checking if two characters are equal
	            if (str.charAt(i) == str.charAt(j) && i != j)
	            {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0)
	            res=str.charAt(i)+"";
	    }
		return res;
	}
	
	public String getDistinct(String str ) {
		String res="";
		  char[] inp = str.toCharArray();
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     res=inp[j] + "";
		     break;
		    }
		   }
		  }
		  return res;
	}
	
	
}



public class dupesuniques {
	public static void main(String[] args) {
		StringMethods sm= new StringMethods();
		System.out.println(sm.getDistinct("sase"));
		System.out.println(sm.getUnique("sase"));
	}
}
