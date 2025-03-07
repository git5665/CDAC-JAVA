import java.util.Scanner;
public class VowelsConso {
	public static void CountVowels(String str) {
		
		int vow = 0;
		int conso = 0;
		int space=0;
		
		
		for(int i =0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch !=' ') {
				space++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					vow++;
				}
				else {
					conso++;
				}
			}
		}
		System.out.println("Vowels are : " +vow + " Conso are : " +conso+" space are : "+space);
		
	}
	
	
	public static void main(String arg[]) {
		Scanner scn = new Scanner(System.in);
		
		String s = new String();
		
		
		System.out.println("Enter any String to count Vowels and Consonants ");
		
		s = scn.nextLine();
		s = s.toUpperCase();
		
		CountVowels(s);
		
		
		scn.close();
		
		
	}
	
}
