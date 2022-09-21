import java.util.*; 
import java.io.*;

class Main {

  public static int ArrayChallenge(int[] arr) {
    // code goes here

    int prevCount = 0;
    int currentCount = 0;
    int mode = -1;
    for(int i = 0 ; i < arr.length; i++){
      for(int j = 0 ; j < arr.length ; j++){
        if(arr[i] == arr[j]){
          currentCount++;
        }
      }
      if(prevCount < currentCount && currentCount > 1){
        mode = arr[i];
        prevCount = currentCount;
      }
      currentCount = 0;
    }

    return mode;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

