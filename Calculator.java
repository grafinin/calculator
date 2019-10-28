import java.util.Scanner;
class Calculator {
	
	public static void main(String[] args){
	System.out.println("Welcome to calculator! :) Please type in operation ");
	Scanner keyboard = new Scanner(System.in); // Read input from user
	String[] check = keyboard.nextLine().split("\\s"); // Split input into three parts by " ";
	keyboard.close(); // end scanner	
	String[] arNums = {"1","2","3","4","5","6","7","8","9","10"};
	String[] romNums = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
	ArabRow arRow = new ArabRow(arNums); //create new row for arabic numbers	
	RomanRow romanRow = new RomanRow(romNums); // create new row for roman numbers 
	// below we check by middle input sign for the right operation 
	
	switch (check[1]){ case "+": 
								if (arRow.sum(check[0],check[2])>0){            
									System.out.println(arRow.sum(check[0],check[2]));} //Prints sum of two arabic numbers if it is greater than 0;  
										else if (romanRow.sum(check[0],check[2])>0){ 
											System.out.println(romanRow.convert(romanRow.sum(check[0],check[2])));} //Prints sum of two roman numbers if it is greater than 0;
												else {System.out.println("Wrong input");}
								break;
						case "-":
								if (arRow.deduc(check[0],check[2])!=-10){
									System.out.println(arRow.deduc(check[0],check[2]));} //Prints difference of two arabic numbers if it is not equal to -10; 
										else if (romanRow.deduc(check[0],check[2])!=-10){
											System.out.println(romanRow.convert(romanRow.deduc(check[0],check[2])));} //Prints difference of two roman numbers if it is not equal to -10; 
												else { System.out.println("Wrong input");}
								break;
						case "*":
								if (arRow.mult(check[0],check[2])>0){
									System.out.println(arRow.mult(check[0],check[2]));} //Prints product of two arabic numbers if it is greater than 0;  
										else if (romanRow.mult(check[0],check[2])>0){
											System.out.println(romanRow.convert(romanRow.mult(check[0],check[2])));} //Prints product of two roman numbers if it is greater than 0;  
												else {System.out.println("Wrong input");}
								break;
						case "/":
								if (arRow.div(check[0],check[2])>=0){
									System.out.println(arRow.div(check[0],check[2]));} //Prints result of division of two arabic numbers if it is greater than 0; 
										else if (romanRow.div(check[0],check[2])>=0){
											System.out.println(romanRow.convert(romanRow.div(check[0],check[2])));} //Prints result of division of two roman numbers if it is greater than 0; 
												else {System.out.println("Wrong input");}
								break;
						default:
						System.out.println("Wrong input!");}}}



