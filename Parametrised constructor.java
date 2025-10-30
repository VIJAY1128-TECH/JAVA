class Bike{
    String x;
    int y;
    Bike(String Model , int Prize){
        x = Model;
        y = Prize; 
    }
    void sample(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Bike name = new Bike("YAMAHA RX 100" , 150000);
	    name.sample();
	}
}