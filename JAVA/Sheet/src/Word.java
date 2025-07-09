import java.util.Scanner;
public class Word{
	public static String word(int n){
		String []units = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String []elevens = {"eleven","twelve","thrirten","fourthen","fiftien","sixtien","seventen","eighten","nineten"};
		String []tens = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String ans;
		if(n<10){
			ans = units[n];
		}
		else if(n<20 && n>10){
			ans = elevens[n-11];
		}
		else if(n%10==0){
			ans = tens[(n/10)-1];
		}
		else{
			ans = tens[(n/10)-1] + " " + units[n%10];
		}
		return ans;
	}
	public static void main(String []agrs){
		Scanner sc = new Scanner(System.in);
		String s="";
		String n = sc.next();
		int []arr = new int[9];
		int size = n.length();
		for(int i=0;i<n.length();i++){
			arr[i]=n.charAt(size-i-1)-'0';
		}
		int x = arr[0]+10*arr[1];
		s = word(x);
		if(arr[2]!=0){
			s = word(arr[2]) + " hundred " + s;
		}
		if(arr[3]!=0 || arr[4]!=0){
			s = word(arr[3]+10*arr[4]) + " thousand " + s;
		}
		if(arr[5]!=0 || arr[6]!=0){
			s = word(arr[5]+10*arr[6]) + " lakh " + s;
		}
		if(arr[7]!=0 || arr[8]!=0){
			s = word(arr[7]+10*arr[8]) + " corore " + s;
		}
				
		System.out.print(s);
	}
}
		
			