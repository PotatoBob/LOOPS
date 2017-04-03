
public class Loooooops {
	public static void main(String[] args) {
		//Complete the exercises.
		
		//1. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 1 (inclusive).
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
        
//        2. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 1 to 10 (inclusive).
//        for (int x = 1; x <= 10; x++){
//        	System.out.println(x);
//        }
        int x = 1;
        while (x<=10) {
        	System.out.println(x);
        	x++;
        }
//        3. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 15 (inclusive).
//        int x = 5;
//        while (x <= 15)
//        {
//            System.out.println(x);
//            x = x + 1;
//        }
        for(int i = 5; i<=15; i++) {
        	System.out.println(i);
        }
//        4. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 10 to 100 by 10’s (inclusive).
//        for (int x = 10; x <= 100; x=x+10){
//        	System.out.println(x);
//        }
        int xx = 10;
        while (xx<=100) {
        	System.out.println(xx);
        	xx+=10;
        }
//        5. The following code should print the values from 1 to 10 (inclusive) but has errors. 
//           Fix the errors so that the code works as intended. 
        int xxx = 1;
        while (xxx <= 10)
        {
            System.out.println(xxx);
            xxx++;
        }
        
//        6. The following code should print the values from 10 to 5, but it has errors. Fix the errors so that the code works as intended.
        for (int i = 10; i >= 5; i--)
        {
           System.out.println(i);
        }
        
//        7. The following code should print the values from 10 to 1, but it has errors. Fix the errors so that the code works as intended.
        int xxxx = 10;
        while (xxxx > 0)
        {
           System.out.println(xxxx);
           xxxx--;
        }
        
        //8. Write code to print a countdown from 100 to 0 by 10’s.
        for(int i = 100; i>=0; i-=10) {
        	System.out.println(i);
        }
        //9. Finish the wordIterate method so that it prints the String parameter minus 
        //   the last character each time through the loop until there are no more characters in the string.
        //   example: wordIterate("bacon");
        //   bacon
        //   baco
        //   bac
        //   ba
        //   b
        wordIterate("bacon");
        //10. Finish the xevenxodd method so that it prints all numbers from x to 0 and also prints 'even' or 'odd' next to the appropriate numner
        //    example: xevenxodd(5);
        //    5 odd
        //    4 even
        //    3 odd
        //    2 even
        //    1 odd
        //    0
        //    assume x > 0 and 0 is neither even or odd
        xevenxodd(5);
        //11. Finish the xTimes10 method so that it prints x * 10 from 0 to x.
        //    example: xTimes10(4);
        //    0
        //    10
        //    20
        //    30
        //    40
        //    assume x > 0
        xTimes10(4);
        //12. Finish the removeXs method so that it removes all x's from strings.
            String s = removeXs("XsxxxtXxXuXxxXXXXfXXXXxxXfXXxxX");
            System.out.println(s);
            
        
        //13. Finish the superDecrement method so that it prints x to zero x number of times.
        //    example: superDecrement(6);
        //    666666 55555 4444 333 22 1
        superDecrement(6);
        //14. Finish the starBox method so it prints a box of *'s the size of the specified dimensions
        //    example: starBox(3, 5);
        //    ***
        //    ***
        //    ***
        //    ***
        //    ***
        starBox(3, 5);
        //15. Finish the count vowels method so it returns the number of vowels in a String
            int v = countVowels("Climbing Mount Everest");
            System.out.println(v);
            
        
	}
	
	
	public static void wordIterate(String word){
		char[] wordChar = word.toCharArray();
		int length = word.length();
		while(length>=0) {
			for(int i = 0; i<length; i++) {
				System.out.print(wordChar[i]);
			}
			System.out.println();
			length--;
		}
	}
	
	public static void xevenxodd(int x){
		for(int i = x; i>0; i--) {
			System.out.print(i);
			if(i%2==0)
				System.out.println(" even");
			else 
				System.out.println(" odd");
		}
		System.out.println("0");
	}
	
	public static void xTimes10(int x){
		for(int i = 0; i<=x; i++) {
			System.out.println(10*i);
		}
	}
	
	public static String removeXs(String wrd){
		char[] wordChar = wrd.toCharArray();
		String blank = "";
		for(char c: wordChar) {
			if (c!='x'&&c!='X') {
				blank+=c;
			}
		}
		return blank;
	}
	
	public static void superDecrement(int x){
		for(int i = x; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(i);
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void starBox(int w, int h){
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static int countVowels(String s) {
		char[] sChar = s.toCharArray();
		int count = 0;
		for(char c: sChar) {
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
			}
		}
		return count;
	}
}
