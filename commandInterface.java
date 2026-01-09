import java.util.Scanner;
import java.util.ArrayList; 

public class MyProgram{
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    
    operations operator = new operations();

    System.out.println("Welcome to basic math bot! Type a math quesiton");
    System.out.println("Currently I only support +-*/");
    System.out.println("More coming soon");
    //it should just run forever
        
    while (true) {
        String response = sc.nextLine();
        if ((response.indexOf("plus") != -1) || (response.indexOf("add") != -1) || (response.indexOf("+") != -1)) {
        //this means addition, then it can do that, lol
        operator.getNumbers(response);
        operator.doAddition();
        System.out.println(operator.outPut());
        //why did I make output like that!?
        } else if ((response.indexOf("subtract") != -1) || (response.indexOf("minus") != -1) || (response.indexOf("-") != -1)) {
        operator.getNumbers(response);
        operator.doSubtraction();
        System.out.println(operator.outPut());
        } else if((response.indexOf("times") != -1) || (response.indexOf("multiply") != -1) || (response.indexOf("*") != -1)) {
        operator.getNumbers(response);
        operator.doMultiplication();
        System.out.println(operator.outPut());
        //divided is pointless it has divide
        } else if((response.indexOf("divided") != -1) || (response.indexOf("divide") != -1) || (response.indexOf("/") != -1)) {
        operator.getNumbers(response);
        operator.doDivision();
        System.out.println(operator.outPut());
        } else if ((response.indexOf("round") != -1) || (response.indexOf("Round") != -1) || (response.indexOf("closest") != -1)) {
        operator.getNumbers(response);
        operator.doRound();
        System.out.println(operator.outPut());
        } else {
          System.out.println("Please try using basic terms");
          System.out.println("Or use correct spelling");
          System.out.println("Your question does not have known terms");
        }
    sc.Close();
    }

    }
}
