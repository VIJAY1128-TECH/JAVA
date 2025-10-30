public class Main
{
	public static void main(String[] args) {
      String name = "Priyadharshini";
      for(int i=0; i<name.length(); i++){
          char ch = name.charAt(i);
          if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
          System.out.println(ch);
      }
	}
}
}