import java.util.Scanner;
public class Multiple {
	           String original, reverse = ""; // Objects of String class  
		        Scanner sc = new Scanner(System.in);
		        //function to check palindrome
		         public void checkPalindrome(int num) {
		        	 String original, reverse = ""; // Objects of String class  
		             Scanner in = new Scanner(System.in);   
		             System.out.println("Enter a string/number to check if it is a palindrome");  
		             original = in.nextLine();   
		             int length = original.length();   
		             for ( int i = length - 1; i >= 0; i-- )  
		                reverse = reverse + original.charAt(i);   
		          }  
		      
		                

		         //function to printPattern

		             public void printPattern()  
		             {  
		             int rows=7;      
		             //inner loop  
		             for (int i= rows-1; i>=0 ; i--)  
		             {  
		             //outer loop  
		             for (int j=0; j<=i; j++)  
		             {  
		             //prints star and space  
		             System.out.print("*" + " ");  
		             }  
		             //throws the cursor in the next line after printing each line  
		             System.out.println();  
		             }  
		             }  
		            

		              //function to check no is prime or not

		         public void checkPrimeNumber() 
		             
		              {  
		                   Scanner s = new Scanner(System.in);  
		                   System.out.print("Enter a number : ");  
		                   int n = s.nextInt();  
		                   if (isPrime(n)) {  
		                       System.out.println(n + " is a prime number");  
		                   } else {  
		                       System.out.println(n + " is not a prime number");  
		                   }  
		               }  
		              
		               public static boolean isPrime(int n) {  
		                   if (n <= 1) {  
		                       return false;  
		                   }  
		                   for (int i = 2; i < Math.sqrt(n); i++) {  
		                       if (n % i == 0) {  
		                           return false;  
		                       }  
		                   }  
		                   return true;  
		               }  

		         

		             

		              // function to print Fibonacci Series

		              
		                 public void printFibonacciSeries() {
		                    //initialize the first and second value as 0,1 respectively.

		                        int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
		                        System.out.println("Fibonacci Series till " + n + " terms:");

		                        while (i <= n) {
		                          System.out.print(firstTerm + ", ");

		                          int nextTerm = firstTerm + secondTerm;
		                          firstTerm = secondTerm;
		                          secondTerm = nextTerm;

		                          i++;
		                        }
		                      }
		                

		     

		    //main method which contains switch and do while loop

		          @SuppressWarnings("static-access")
				public static void main(String[] args) {

		                    Multiple obj = new Multiple();

		                    int choice;

		                    Scanner sc = new Scanner(System.in);

		    do {

		    System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

		    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

		    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

		    System.out.println();

		     

		    choice = sc.nextInt();

		    switch (choice) {

		     

		    case 0:

		    choice = 0;

		    break;

		     

		    case 1: {

		    obj.checkPalindrome(choice);

		    }

		    break;

		     

		    case 2: {

		     

		    obj.printPattern();

		    }

		    break;

		     

		    case 3: {

		    obj.checkPrimeNumber();

		    }

		    break;

		     

		    case 4: {

		     

		    obj.printFibonacciSeries();

		    }

		    break;

		     

		    default:

		    System.out.println("Invalid choice. Enter a valid no.\n");

		    }

		     

		    } while (choice != 0);

		    System.out.println("Exited Successfully!!!");

		    sc.close();

		    }

		     

		    


		        



		    

		   


	}


