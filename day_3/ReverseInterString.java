import java.util.*; 
import java.io.*;

class Main {

  public static String StringChallenge(String str) {
    // code goes here
    char[] arr = str.toCharArray();

    String reversString = "";
    String interString = "0r5ftupeda";
    int index = 0;
    for(int i = str.length() - 1 ; i >= 0; i--){
        
        reversString += arr[i];
        
        if( index < interString.length()){
          reversString += interString.charAt(index);
          index++;
        }
         
    }
    if(index < interString.length()){
      reversString += interString.substring(index, interString.length());
    }
    return reversString;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);

    System.out.print(StringChallenge(s.nextLine())); 
  }

