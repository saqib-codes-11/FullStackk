package test;

import java.util.Scanner;

class Snek {
	public String camelToSnake(String str) {
		boolean flag=false;
		String res="";
		int z=1;
		char[] chars = new char[99];
		chars[0]=Character.toLowerCase(str.charAt(0));
		for(int i=1; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				chars[z]='_';
				chars[z+1]=Character.toLowerCase(ch);
				z+=2;
				
			} else {
				
			chars[z]=str.charAt(i);
			z+=1;
			}
		}
		
		for(int i=0; i<chars.length; i++) {
			res=res+chars[i];
		}
		
		return res;
	}
}

class SnakeCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Snek s=new Snek();
		String z=sc.nextLine();
		
		System.out.println(s.camelToSnake(z));
	} 
}

//
//package test;
//
//class SnakeCase {
// 
//    // Function to convert camel case
//    // string to snake case string
//    public static String camelToSnake(String str)
//    {
// 
//        // Empty String
//        String result = "";
// 
//        // Append first character(in lower case)
//        // to result string
//        char c = str.charAt(0);
//        result = result + Character.toLowerCase(c);
// 
//        // Traverse the string from
//        // ist index to last index
//        for (int i = 1; i < str.length(); i++) {
// 
//            char ch = str.charAt(i);
// 
//            // Check if the character is upper case
//            // then append '_' and such character
//            // (in lower case) to result string
//            if (Character.isUpperCase(ch)) {
//                result = result + '_';
//                result
//                    = result
//                      + Character.toLowerCase(ch);
//            }
// 
//            // If the character is lower case then
//            // add such character into result string
//            else {
//                result = result + ch;
//            }
//        }
// 
//        // return the result
//        return result;
//    }
// 
//    public static void main(String args[])
//    {
//        // Given string str
//        String str = "HelloFresh";
// 
//        // Print the modified string
//        System.out.print(camelToSnake(str));
//    }
//}
