public class Main
{
	public static void main(String[] args) {
	    int[] largest = {41,54,32,5,8,61,95};
	    int max = largest[0];
	    for(int a=0; a<largest.length; a++){
	        if(largest[a]>max){
	            max = largest[a];
	        }
	    }System.out.println(max);
}
}