import java.util.Scanner;
public class Main
{
    static int add(int x, int y){
        return x+y;
        
    }
    static int sub(int x, int y){
        return x-y;
    }
    static int mul(int x, int y){
        return x*y;
    }
    static int div(int x, int y){
        return x/y;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option :");
        int num = sc.nextInt();
        if(num ==1){
           System.out.println(add(8,14));
        }
        else if(num==2){
          System.out.println(sub(10,5));
        }
        else if(num ==3){
           System.out.println(mul(5,5));
        }
        else if(num ==4){
           System.out.println(div(8,2));
        }
        else{
            System.out.println("enter a valid number");
        }
        }
        }
        