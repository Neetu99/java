import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {

Scanner sc = new Scanner(System.in);

int n=sc.nextInt();

int m=sc.nextInt();

String[][] arr = new String[n][1];

for(int j=0; j<n; j++){

arr[j][0] = sc.next();

}

String s = sc.next();

int row = 0;

boolean ans = true;

while(s.length() != row){

if(arr[row%n][0].contains(String.valueOf(s.charAt(row)))){

ans = true;

arr[row%n][0] = arr[row%n][0].replaceFirst(String.valueOf(s.charAt(row)), "");

}else{

ans = false; 

break;

}

row = row + 1;

}

if(ans == true){

System.out.print("Yes");

}else{

System.out.print("No");

}

}

}
