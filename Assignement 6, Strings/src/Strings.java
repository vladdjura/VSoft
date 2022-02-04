
public class Strings {

	public static void main(String[] args) {
		String text = "Today is a beautiful day is .";
		removeAllTheWhite(text);
		toUpper(text);
		specificCharacter(text);
		countCharacters(text);
		palindrome(text);
		maxMin(text);
		stringReverse(text);
		duplicateCharacter(text);
		duplicateWords(text);
		frequencyCharacter(text);
		smallestAndLargestWord(text);
		swapTwoStrings("a", "b");
		findCharByIndex(text, 1);
		changeCharacter(text);
		getSecondMostFreq(text);
		removingDuplicateFromStrings(text);
	}

	public static void removeAllTheWhite(String s) {
		System.out.println("original text: " + s);
		s = s.replaceAll("\\s", "");
		System.out.println("replaced text: " + s);
	}

	public static void toUpper(String s) {
		System.out.println("original text: " + s);
		StringBuffer buff = new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				buff.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			} else if (Character.isUpperCase(s.charAt(i))) {
				buff.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}

		}
		System.out.println("replaced text: " + buff.toString());
	}

	public static void specificCharacter(String s) {

		System.out.println("original text: " + s);
		s = s.replaceAll("\\s", "*");
		System.out.println("replaced text: " + s);

	}

	public static void countCharacters(String s) {
		System.out.println("original text: " + s);
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				counter++;

		}
		System.out.println("total number of character in text " + counter);
	}

	public static void palindrome(String word) {

		boolean flag = true;
		int i = 0;
		int j = word.length() - 1;
		if (!word.isEmpty()) {

			while (j > i) {

				if (word.charAt(i) != word.charAt(j)) {
					System.out.println(word + " this word is not palindrome");
					flag = false;
					break;
				}
				i++;
				j--;
			}
			if (flag)
				System.out.println(word + " is palindrome");
		}
	}

	public static void maxMin(String s) {
		int [] f = new int[s.length()];
		char minChar = s.charAt(0);
		char maxChar = s.charAt(0);
		int min,max;
		char []text = s.toCharArray();
		
		for(int i = 0; i<text.length;i++) {
			f[i] = 1;
			for(int j = i+1;j<text.length;j++) {
				if(text[i]==text[j]&&text[i]!= ' ') {
					f[i]++;
				}
			}
		}
		min = max = f[0];
		for(int i = 0; i<f.length;i++) {
			if(min>f[i]) {
				min = f[i];
				minChar=text[i];
				
			}
			if(max<f[i]) {
				max=f[i];
				maxChar = text[i];
				
			}
		}
			System.out.println("min occuring character "+minChar);
			System.out.println("max occuring " +maxChar);
			
	}
	public static void stringReverse(String s) {
		String reverse = "";
		for(int i = s.length()-1;i>=0;i--) {
			reverse += s.charAt(i);
			
		}
		System.out.println("original string:  " + s);
		System.out.println("string reverse: " + reverse);
	}
	public static void duplicateCharacter(String s) {
		int counter = 0;
		char [] text = s.toCharArray();
		System.out.println("duplicate character in text");
		for(int i = 0;i<s.length();i++){
			counter = 1;
			for(int j = i+1;j<s.length();j++) {
				if(text[i]==text[j] && text[i]!= ' ') {
					counter++;
				}
			}
			if(counter>1) {
				System.out.println(text[i]);
			}
		}
	}
	public static void duplicateWords(String s) {
		int counter;
		s = s.toLowerCase();
		String [] word = s.split(" ");
		System.out.println("duplicate words");
		for(int i = 0; i<word.length;i++) {
			counter = 1;
			for(int j = i+1; j<word.length;j++) {
				if(word[i].equals(word[j])) {
					counter++;
				}
			}
			if(counter>1) {
				System.out.println(word[1]);
			}
		}
	}
	public static void frequencyCharacter(String s) {
		
		int [] f = new int [s.length()];
		char [] c = s.toCharArray();
		System.out.println("Character frequency");
		for(int i = 0;i<s.length();i++) {
			f[i]=1;
			for(int j = i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					f[i]++;
					
					c[j]='0';
				}
			}
			
		}
		for(int i=0;i<f.length;i++) {
			if(c[i]!=' '&&c[i]!= '0') {
				System.out.println(c[i]+"\t|| " + f[i]);
			}
		}	
	}
	public static void smallestAndLargestWord(String s) {
		String word = "";
		String smallest = "";
		String largest = "";
		String [] words = new String[300];
		int l = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word+=s.charAt(i);
			}
			else {
				words[l] = word;
				l++;
				word = " ";
				
			}
		}
		
		smallest = largest = words[0];
		for(int i = 0; i<l;i++) {
			if(smallest.length()>words[i].length()) {
				smallest = words[i];
				
			}
			if(largest.length()<words[i].length()) {
				largest=words[i];
			}
		}
		System.out.println("The smallest word is: "+smallest);
		System.out.println("The largest word is: "+largest);
	}
	public static void swapTwoStrings(String a, String b) {
		System.out.println("original string a: " +a);
		System.out.println("original string b: "+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("swapped string a: " + a);
		System.out.println("swapped string b: " + b);
		
	}
	public static void findCharByIndex(String s, int position) {
		System.out.println("char at position "+ position+" is "+s.charAt(position));
	}
	public static void changeCharacter(String s) {
		System.out.println("original string " + s);
		s= s.replaceAll("d", "f");
		System.out.println("replaced string " + s);
	}
	public static void getSecondMostFreq(String str){

        int i,max=0,sec_max=0;
        int arr[]=new int[256];
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
                arr[str.charAt(i)]++;
        }
        for (i = 0; i <256; i++) {
            if (arr[i]>arr[max]) {
                sec_max=max;
                max = i;
            }
            else if(arr[i]>arr[sec_max] && arr[i]!=arr[max]){
                sec_max=i;
            }
        }
        System.out.println("The Second Most occurring character in a string is "+(char)(sec_max));
    }
	public static void removingDuplicateFromStrings(String s) {
		char[] t = s.toCharArray();
		String st = "";
		for(char c:t) {
			if(st.indexOf(c)==-1) {
				st+=c;
			}
		}
		System.out.println("String after removing "+st);
	}
}
