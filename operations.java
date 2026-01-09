import java.util.ArrayList;
import java.util.Scanner;
public class operations {
        
  private double answer = 0;
  private ArrayList<Double> numberList = new ArrayList<Double>();
        
  public operations() {
  answer = 0;
  numberList = new ArrayList<Double>();
  }

  public void getNumbers(String thisThing) {
          
      int counter = numberList.size();
      for (int i = 0; i < counter; i++) {
          numberList.remove(0);
      }
          
      String testHere = thisThing;
      Scanner scanner = new Scanner(testHere);
  
      // Anything that is NOT part of a number becomes a delimiter
      scanner.useDelimiter("[^0-9.]+");
  
      while (scanner.hasNext()) {
          if (scanner.hasNextDouble()) {
              numberList.add(scanner.nextDouble());
          } else {
              scanner.next(); // skip invalid token
          }
          
      }
      //"Advanced Gen Ai Context Understanding"
      if(testHere.indexOf("this") != -1 || testHere.indexOf("that") != -1) {
          numberList.add(0, answer);
      }
      scanner.close();
      }
      
          
          
          
          public void doAddition() {
              answer = 0;
          
              
              double returnAdd = 0;
              for (int i = 0; i < numberList.size(); i++) {
                  returnAdd += numberList.get(i);
              }
              answer = returnAdd;
          }
          
          
          public void doSubtraction() {
              
         
              answer = 0;
              double returnSub = 0;
              if(numberList.size() > 1) {
              returnSub = numberList.get(0);
              for (int i = 1; i < numberList.size(); i++) {
                  returnSub -= numberList.get(i);
              }
              }
              answer = returnSub;
              
          }
          
          public void doMultiplication() {
              
              
              
              
              answer = 0;
              double returnMul = 1;
              for (int i = 0; i < numberList.size(); i++) {
                  returnMul *= numberList.get(i);
              }
              answer = returnMul;
          }
          
          public void doDivision() {
              answer = 0;
              double returnDiv = 0;
              if(numberList.size() > 1) {
              returnDiv = numberList.get(0);
              for (int i = 1; i < numberList.size(); i++) {
                  if (numberList.get(i) != 0) {
                  returnDiv /= numberList.get(i);
                  } else {
                      answer = 0;
                      //divide by 0 equals 0 now!
                  }
              }
              }
              answer = returnDiv;
          }
          
          public void doRound() {
              answer = 0;
          
              
              double returnRound = 0;
              for (int i = 0; i < numberList.size(); i++) {
                  returnRound += (Math.round(numberList.get(i)));
              }
              answer = returnRound;
          }
          
          
          
          
          
          
          public String outPut() {
              //double response = ((int) (Math.random() * 4));
              String startOf = ("The answer to your question is ");
              startOf = ("Bot: " + startOf + answer + ", simple math!");
              return startOf;
            
        }
}
