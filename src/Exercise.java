import java.io.*;
import java.util.Scanner;
import java.util.Random;

// 4-1

public class Exercise {
    public static void main(String[] args) {		
		for(int i=1;i<=7;i++){
			for(int j=i+1;j<=8;j++){
				for(int k=j+1;k<=9;k++){
					if(i+j+k==10){
						System.out.printf("[%d, %d, %d]%n",i,j,k);	
					}				
				} 
			}
		}
	}
}
