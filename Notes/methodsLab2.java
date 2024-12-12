/**
 * Write a description of class MethodsLab2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class methodsLab2  
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MethodsLab2
     */
    public methodsLab2()
    {
    }
    
    
    public static void main(String args[]){
        forloop(-10,8,2);
    }

    
    
    public static void forloop(int start, int stop, int increment){
        for(int i = start; i < stop; i = i + increment){
            System.out.print(i + " ");
        }
    }
    
    public static void whileloop(int number){
        int total = 0;
        int count = 0;
        while(number > 0){
            count++;
            int digit = number % 10;
            total += digit;
            number /= 10;
        }
        System.out.println(count + " digits totaling " + total);
    }
    
    public static void addHyphen(String string){
        String upper_string = string.toUpperCase();
        System.out.println(upper_string);
        String hyphen_string = upper_string.substring(0,upper_string.indexOf(' ')) + "-" + upper_string.substring(upper_string.indexOf(' ')+1);
        System.out.println(hyphen_string);
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}