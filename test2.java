package test2;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("James Haimoff Test");
		
//		menu();
//		oddeven("Today is a Very Fine Day to be in Fairfield");
//		oddeven("James haimoff jaems haimoff jame shhh ahh");
//		oddeven("james james haimoff were ew erw efwe we ");
//		county("Today is a Very Fine Day to be in Fairfield");
//		zonker("jokejoke"); //hh,aa,pp,ii,nn,ee,ss
//		oddeven("loys of ys and yesyy");
//		good("dggy");
//		int[] array = {5,5,7,5,5};
//		sumleftright(array);
		
		menu();
		
	}
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		boolean leave = false;
		int[] array = {5,5,5};

		int flag = 0;
		while (flag <= 0) {
			System.out.println("Menu:");
            System.out.println("1. Odd Even Words");
            System.out.println("2. ggtwice");
            System.out.println("3. sumleftright");
            System.out.println("4. zonker");
            System.out.print("Enter Number Corresponding to Action: ");
            //couldnt use scanner to accept specific inputs for each
            int number = scanner.nextInt();
//            scanner.close();
            
            switch(number) {
            case 1:
            	System.out.println("Input: ");
            	System.out.println("james haioff james jam a e e r rrr rr jame"); //had issues getting this from a scanner
            	System.out.println("Today is a Very Fine Day to be in Fairfield");
//            	"Today is a Very Fine Day to be in Fairfield"
//            	System.out.println(input1);
            	System.out.println("Output");
           		oddeven("james haimoff james jam a e e r rrr rr jame");
           		oddeven("Today is a Very Fine Day to be in Fairfield");
				flag += 1;
//				scanner.close();
           		break;
            case 2:
            	good("ggada"); //good beg gs
            	good("aggad"); //good middle gs
            	good("addddgg"); //good end gs
            	good("gaegg"); //doesnt work, this is due to 3 gs but its technically correct
            	//doesnt work not sure if that is important, adds more complexity and time, has to be only 2 Gs
				//wanted to use the index of method that we discussed for this
            	flag += 1;
            	break;
            case 3:
	            sumleftright(array);
	            flag += 1;
            	break;
            case 4:
            	zonker("Hannah");
            	flag += 1;
            	break;
            default:
            	System.out.println("invalid");
            	break;
         }	
     }
	}
	public static void sumleftright(int[] args) {
		int value = args.length /2;
		int totalright = 0;
		int totalleft = 0;
		for (int i = 0; i < value; i++) {
			totalleft += args[i];
		}
		if (args.length % 2 == 0) {
			for (int i = value; i > value-1 && i < args.length; i ++) {
				totalright += args[i];
			}
		}if(args.length % 2 != 0) {
			for (int i = value+1; i > value && i < args.length; i ++) {
			totalright += args[i];
			}
		}
		System.out.println(totalleft);
		System.out.println(totalright);
		if (totalright == totalleft) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	public static void good(String word) {
		char[] characters = word.toCharArray();
		int gposition = word.indexOf("g");
		System.out.println(gposition);
		int before = gposition -1;
		int after = gposition +1;
		if (gposition > 0 && characters[before] == 'g' || gposition < characters.length && characters[after] == 'g') {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
//		}
	}
	public static void zonker(String word) {
			String wordd = word.toLowerCase(); //account for edge case and uppers and lower discrepency
			char[] characters = wordd.toCharArray();
			int total = 0;
			for (int h = 0; h < characters.length; h ++) { //this should run for every character in hannah but its not
				System.out.println(" ");
				System.out.print(characters[h]);
				System.out.print(" ");
				for (int i = 0; i < characters.length; i ++) { //this should run for every time in hannah also
//					System.out.println(" ");
					System.out.print(characters[i]);
					if (characters[h] == characters[i]) {
						total += 1;
					//can also just see if every letter is true meaning it appears twice but if it appears 3 times its not accurate idk
					}
//					System.out.print("");
					}
//				}
//			System.out.println(lettercount);
			}
			System.out.println(" ");
			System.out.println(total);
			
			if (total == wordd.length()*2) {
				System.out.println("ZONKER");
			}
			else {
				System.out.println("not zonker");
			}

	}	
	public static void oddeven(String words) {
		String[] word = words.split(" ");
		char[] worded = words.toCharArray();
		int count = 0;
		for (int i = 0; i < word.length; i++) {
//			System.out.println(word[i]);
			if (word[i].length() % 2 == 0) {
				System.out.print(word[i].toLowerCase());	
			}else {
				System.out.print(word[i].toUpperCase());
			}
		}
		int ycount = 0;
		for (int i = 0; i < worded.length; i ++) {
//			System.out.println(worded[i]);
			if (worded[i] == 'y') {
				ycount += 1;
			}
//			System.out.println(ycount); //terrible first attempt not sure what I was thinking here 40 minutes in i hadnt had this yet
//			for (int h = 0; h < word[i].length(); h ++) {
//				if (word[h] == "y");
//				count += 1;
//			}
//			System.out.println("   Y count is: " + count);
//			break;
//			}
//		System.out.println("   Y count is: " + count);

//	}
		}
		System.out.println(" ");
		System.out.println("The amount of Ys is: " + ycount);
	}
	}
