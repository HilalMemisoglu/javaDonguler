package javaKodlarim;
import java.util.Scanner;

public class donguler {

	public static void main(String[] args) {
		
		/* kullanıcı tarafından girilen n`in faktöriyel değerini bulan programı kodlayın
		 
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.printf("enter a number");
		   int n = scan.nextInt(), factorial=1;
		   
		   for(int i=1; i<=n; i++)
			   factorial*=i;
		   
		   System.out.printf("%d", factorial);  */
		
		----------------------------------------------
		
		/* 2-100e kadar olan çift sayıları her satırda 5 sayı olacak biçimde bastıran programı kodla
		
		for(int i=0; i<=91; i+=10) {
			for(int j=2; j<=10; j+=2) {
				System.out.println(i+j);
			}
			System.out.println(); 
		}  */
		
		--------------------------------------------------------------------------
		
		/*  1-99a kadar olan tek sayıları her satırda 5 sayı olacak biçimde bastıran programı kodlayın
		
		int i=0, j=-1;
		
		do {
			do System.out.printf("%d", i+(j+=2));
			while (j<9);
			
			System.out.println();
			
			j=-1;
			i+=10;
		}while(i<100); */
		
		---------------------------------------------------------------------------
		
		/* kullanıcı tarafından girilen 10'luk tabandaki sayının 2'lik tabandaki değerini ters sırada bastıran programı kodlayın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number base 10");
		
		int n= 2*scan.nextInt();
		
		while(n>1) {
			System.out.printf("%d", (n/=2)%2);
		} */
		
		-------------------------------------------------------------------------------
		
		/*  kullanıcı tarafından girilen 10'luk tabandaki sayının 2'lik tabandaki değerini bastıran programı kodla
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("enter a base 10 number");
		
		int number = scan.nextInt(), temp=number, counter=0;
		
		for(int i=number; i>0; i/=2)
			counter++;
		
		for(int i=counter; i>=1; i--) {
			for(int j=i; j>1; j--)
				temp/=2;
			
			System.out.print(temp%2);
			temp=number; }   */
		
			
		
		   
		 

	}

}
