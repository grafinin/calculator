public class ArabRow {
	static String[] row;
// below constructs class Object
	public ArabRow(String [] nums){
		this.row = nums;}
	
// below method returns number from 1 to 10 only if it's equal to provided input otherwise returns -1;
	public static int num(String a){
		int b = -1;
			for (int x=0; x<10; x++){
				if (ArabRow.row[x].equalsIgnoreCase(a)){
					b=x+1; return b;}}
		return b;}
		
// below method returns sum of two numbers valued from 1 to 10 only, otherwise returns -1; 
	public static int sum(String a, String z){
		int c = -1;
			if (ArabRow.num(a)>0 && ArabRow.num(z)>0){
				c = ArabRow.num(a)+ArabRow.num(z);} 
		return c;}
// below method returns difference of two numbers each valued from 1 to 10 only, otherwise returns -10 
	public static int deduc(String a, String z){
		int c = -10;
		if (ArabRow.num(a)>0 && ArabRow.num(z)>0){
			c = ArabRow.num(a) - ArabRow.num(z);} 
		return c;}
		
// below method returns product of two numbers each valued from 1 to 10 only, otherwise returns -1
	public static int mult(String a, String z){
		int c = -1;
			if (ArabRow.num(a)>0 && ArabRow.num(z)>0){
				c = ArabRow.num(a) * ArabRow.num(z);} 
		return c;}
		
// below method returns division result of two numbers each valued from 1 to 10 only, otherwise returns -1
	public static int div(String a, String z){
		int c = -1;
			if (ArabRow.num(a)>0 && ArabRow.num(z)>0){
				c = (int)(ArabRow.num(a) / ArabRow.num(z));} 
		return c;}}