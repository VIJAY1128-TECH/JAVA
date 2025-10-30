public class Main
{
	public static void main(String[] args) {
		String name = "Always be happy";
		String reverse = "";
		for(int i=0; i<name.length(); i++){
		    char ch =name.charAt(i);
		    reverse = ch + reverse;
		}
		System.out.println(reverse);
	}
}