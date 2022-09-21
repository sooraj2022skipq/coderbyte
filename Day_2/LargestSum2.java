import java.util.*; 
import java.io.*;

class Main {

  public static int ArrayChallenge(int[] arr) {

    int largest = arr[0];
    int index = 0;
    int sum = 0;
    for(int i = 0; i < arr.length-1 ; i++){
        if(largest < arr[i+1]){
          largest = arr[i+1];
          index = i+1;
        }
    }
    for(int i = 0 ; i < arr.length ; i++){
      if(i != index){
        sum += arr[i];
      }
    }
    if(sum >= largest){
      return 1 ;
    }else{
      return -1;
    }
    
    
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int res = ArrayChallenge(s.nextLine());
    
    if(res == 1){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }

