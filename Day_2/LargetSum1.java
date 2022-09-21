import java.util.*; 
import java.io.*;

class Main {

  public static int ArrayChallenge(int[] arr) {
    // code goes here 
    int largestNum = arr[0];
    int index = 0;
    int totalSum = 0;
    
    for(int i = 0; i < arr.length ; i++){
      if(largestNum < arr[i]){
        largestNum = arr[i];
        index = i;

      }
    }
    
    for(int i = 0; i < arr.length ; i++){
        if(i != index){
          totalSum += arr[i];
          
          }
        }

      
    
    
    if(totalSum >= largestNum){
      return 1;
    }else{
      return -1;
    }

    
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int result = ArrayChallenge(s.nextLine());
    if(result == 1){
      System.out.print("true");
    }else{
      System.out.print("false");
    }
    
  }

