package convert;
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long b;
        System.out.println("Please enter a number");
        b = in.nextInt();
        String s=String.format("value is %012d",b);
        MyMethod.show(s);
        }   
}
    
class MyMethod{
    public static void show(String s){
	if(!(s.substring(0,3).equals("000"))){
        three(s.substring(0,3));
        System.out.print(" "+"billion");
        }
        if(!(s.substring(3,6).equals("000"))){
        three(s.substring(3,6));
        System.out.print(" "+"Million");
        }
        if(!(s.substring(6,9).equals("000"))){
        three(s.substring(6,9));
        System.out.print(" "+"Thousand");
        }
        if(!(s.substring(9,12).equals("000"))){
        three(s.substring(9,12));
        System.out.println();
        }    

        
    }
     public static void three(String s){
    	int a;
        String[] yek={"","one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        String[] dah={"","", "twenty" , "thirty" , "forty" , "fifty" , "sixty" , "seventy" , "eighty" , "ninety"};
        String[] du={"ten" , "eleven" , "twelve" , "thirteen" , "fourteen" , "fifteen" , "sixteen" , "seventeen" , "eighteen" , "nineteen"};
        
        if(!(s.substring(0,1).equals("0"))){
        a=Integer.parseInt(s.substring(0,1));
        System.out.print(yek[a]+"hundred");
        }
        if(Integer.parseInt(s.substring(1,3))>=10 &&Integer.parseInt(s.substring(1,3))<=19 ){
        a=Integer.parseInt(s.substring(1,3));
        System.out.print(du[a-10]);
        }
        else if(!(s.substring(1,2).equals("0"))){
        a=Integer.parseInt(s.substring(1,2));
        System.out.print(dah[a]);
        }
        else if(!(s.substring(2,3).equals("0"))){
        a=Integer.parseInt(s.substring(2,3));
        System.out.print(yek[a]);
        }
    }
}

