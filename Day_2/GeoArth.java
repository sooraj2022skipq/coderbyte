import java.util.*; 
import java.io.*;

class Main {

  public static int ArrayChallenge(int[] arr) {
    // code goes here 
   
   // code goes here

        int diff = arr[1] - arr[0];

        boolean arth = true;
        boolean geo = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(diff != (arr[i+1]-arr[i])){
                arth = false;
                break;
            }
        }
        if (arth){
            return 1;
        }
        int mul = arr[1]/arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(mul != arr[i+1]/arr[i]){
                geo = false;
                break;

            }
        }

        if (geo){
            return 0;
        }
        return -1;
   
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int result = ArrayChallenge(s.nextLine());
    if(result == 1){
      System.out.print("Arithmetic");
    }else if(result == 0){
      System.out.print("Geometric");
    }else{
      System.out.print(result);
    }
     
  }

