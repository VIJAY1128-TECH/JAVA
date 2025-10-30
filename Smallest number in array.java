public class Main
{
	public static void main(String[] args) {
		int[] small = {52,66,28,45,32,8};
		int min = small[0];
		int second = small[0];
		for (int i=0; i<small.length; i++){
		    if(small[i]<min){
		        second = min ;
		        min = small[i];
		}
}
System.out.println(second);
}
}