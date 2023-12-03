/***************************************************
 File: Proj10runner.java
 Author: Fred Butoma
 Purpose: Proj10Runner.java is a class that uses
 functional interfaces that act upon data input from
 the command line
 ***************************************************/
import java.util.function.*;
public class Proj10Runner{
    //constructor
    public Proj10Runner() {
        // Print the certification statement
        System.out.println("I certify that this program is my own work\n" +
                "and is not the work of others. I agree not\n" +
                "to share my solution with others.\n" +
                "Fred Butoma");
    }

    //Method to get length of a string using Fucntion functional interface
    public int getLength(String str){
        Function<String, Integer>  lengthFunction = String::length;
        return lengthFunction.apply(str);
    }

    //Method to check if integer is using the functional interface
    public boolean isEven(int num){
        Predicate<Integer> isEvenPredicate = n -> n % 2 ==0;
        return isEvenPredicate.test(num);
    }

    //Method to concatendate to strings using BiFunction functional interface
    public String concatenate(String str1, String str2){
        BiFunction<String, String, String> concatenateFunction = String::concat;
        return concatenateFunction.apply(str1, str2);
    }
}


