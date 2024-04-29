package Union_Intersection;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		/* Given 2 arrays num and num1 having several values,
		 * Create a java program that will read and perform
		 * "intersection" and "setOfNumbers" between the elements 
		 * of these sets*/
		
		int numA = 0, numB = 0, i=0;
		
		System.out.print("Ilan ang laman ng num: ");
		numA = sc.nextInt();
		
		int num[] = new int[numA];

		System.out.println("Ilagay ang mga value ng num: ");
		
		lagyanAngNum(numA, i, num);
		
		System.out.print("\nIlan ang laman ng num1: ");
		numB = sc.nextInt();
		
		int num1[] = new int[numB];

		System.out.println("Ilagay ang mga value ng num1: ");
		
		lagyanAngNum1(numB, i, num1);
		
		tawaginAngArray(num,num1);
		
		int setOfNumbers[] = new int[num.length+num1.length];
		
		setOfNumbers(num,num1,setOfNumbers);
		Intersection(setOfNumbers);
		Union(setOfNumbers);
		
	}
	
	static void lagyanAngNum(int numA, int i, int num[]) {
		Scanner inputNum = new Scanner(System.in);
		
		while(numA!=0) {
			num[i] = inputNum.nextInt();
			i++; // para sa index na lalagyan
			numA--; // para tumigil yung while loop
		}
	}
	
	static void lagyanAngNum1(int numB, int i, int num1[]) {
		Scanner inputNum1 = new Scanner(System.in);
		while(numB!=0) {
			num1[i] = inputNum1.nextInt();
			i++; // para sa index na lalagyan
			numB--; // para tumigil yung while loop
		}
	}
	
	static void tawaginAngArray(int num[], int num1[]) {
		System.out.print("Num: ");
		for(int a=0; a<num.length;a++) {
			System.out.print(num[a] + " ");
				
		}
		
		System.out.print("\nNum1: ");
		for(int b=0; b<num1.length;b++) {
			System.out.print(num1[b] + " ");
				
		}
	}
	
	static void setOfNumbers(int num[], int num1[], int setOfNumbers[]) {
		
		int temp = 0;
		
		// ilagay ang num sa setOfNumbers[]
		for(int i=0; i<num.length;i++) {
			setOfNumbers[i] = num[i];
		}
		
		
		System.out.print("\n\nsetOfNumbers: ");
		for(int i=0; i<setOfNumbers.length;i++) {
			for(int j=i+1; j<setOfNumbers.length;j++) {
				
				if(setOfNumbers[i] > setOfNumbers[j]) {
					temp = setOfNumbers[i];
					setOfNumbers[i] = setOfNumbers[j];
					setOfNumbers[j] = temp;
				}
				
			}
		}
		
		// ilagay ang num1 sa setOfNumbers[]
		for(int i=0; i<num1.length;i++) {
			setOfNumbers[i] = num1[i];
		}
		
		for(int i=0; i<setOfNumbers.length;i++) {
			for(int j=i+1; j<setOfNumbers.length;j++) {
				
				if(setOfNumbers[i] > setOfNumbers[j]) {
					temp = setOfNumbers[i];
					setOfNumbers[i] = setOfNumbers[j];
					setOfNumbers[j] = temp;
				}
				
			}
		}
		
		
		for(int i=0; i<setOfNumbers.length;i++) {
			System.out.print(+ setOfNumbers[i] + " ");
		}
		
		
		
	}
	
	static void Union(int setOfNumbers[]) {
		
		System.out.print("\nUnion: ");
		for(int i=0; i<setOfNumbers.length;i++) {
			for(int j=i+1; j<setOfNumbers.length;j++) {
				
				if(setOfNumbers[i] == setOfNumbers[j]) {
					setOfNumbers[i] = 0;
				}
				
			}
		}
		
		for(int i=0;i<setOfNumbers.length;i++) {
			if(setOfNumbers[i] == 0) {
				continue;
			} else {
				System.out.print(setOfNumbers[i] + " ");
			}
		}
		
	}
	
	
	static void Intersection(int setOfNumbers[]) {
		//find Intersection
		System.out.print("\n\nIntersection: ");
		
		for(int i=0; i<setOfNumbers.length;i++) {
			for(int j=i+1; j<setOfNumbers.length;j++) {
				
				if(setOfNumbers[i] == setOfNumbers[j]) {
					System.out.print(setOfNumbers[i] + " ");
				}
				
			}
		}
	}

}


