package com.search;
import java.io.*;
import java.util.*;
public class BinarySearch {
   public static int binSearch(String[]words,String target) {
	   int low=0,high=words.length-1;
	   while (low<=high) {
		   int mid=low+(high-low)/2;
		   if(words[mid].equals(target)) {
			   return mid+1;
		   }
		   else {
			  String str1=words[mid];
			  for(int i=0;i<words[mid].length()-1;i++) {
				   char ch1=str1.charAt(i);
				   char ch2=target.charAt(i);
				   if((int)ch1<(int)ch2) {
					   low=mid+1;
					   break;
				   }
				   else if((int)ch1>(int)ch2) {
					   high=mid-1;
					   break;
				   }
				   
			   }
		
		   }
		  

	    }
	   return 0;
	}
	public static void main(String[] args) {
		String[] words= {"aesthetic","blert","brogious","efface","eradicate","fatuous","gaffe","kwell",
				"naivete","shero"};
		String[] meaning= {"beatiful","cowardly person","angry","to remove","to destroy","devoid of intelligence",
				"socially awkward act","to talk proudly","lack of worldliness","a heroine"};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word to search:");
		String target=sc.next();
		int result=binSearch(words,target);
		if(result!=0) {
			System.out.println("the meaning of searched element is "+"'"+meaning[result-1]+"'"+ " and for more information look at page "+result);
			
		}
		else {
			System.out.println("Sorry the entered word is not found, check for spelling");
		}

	}

}
