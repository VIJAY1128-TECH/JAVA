class book {
    
    String title;
    String author;
    book(){
        title = "The Girl with the Dragon tattoo";
        author = "Stieg Larsson";
    }
    void details(){
        System.out.println(title);
        System.out.println(author);
    }
}
public class Main
{
	public static void main(String[] args) {
	    book obj = new book();
	    obj.details();
	}
}