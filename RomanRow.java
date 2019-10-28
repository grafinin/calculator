public class RomanRow {
	static String[] row;
	
	public RomanRow(String [] nums){
		this.row = nums;}
		
//below method converts arabic number from 1 to 100 into Roman number 	
	public static String convert(int a){
	int x,y; 
	String[] c = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String[] z = {"I","II","III","IV","V","VI","VII","VIII","IX"};
	String l = "";
	String k = "";
	
	if ((a % 100) ==0){ 
		return "C";}
			else {y = a% 10; x = (int)(a / 10); 
				for (int j=0; j<10; j++){ 
				    if (j == y-1){
						k = z[j];}}
				for (int j=0; j<10; j++){
					if (j == x-1){l = c[j];}}
	return l+k;}}
	
// below method returns number from 1 to 10 only if it's equal to provided input otherwise returns -1;
	public static int num(String a){
		int b = -1;
			for (int x=0; x<10; x++){
				if (RomanRow.row[x].equalsIgnoreCase(a)){
					b=x+1; return b;}}
	return b;}
	
// below method returns sum of two numbers valued from 1 to 10 only, otherwise returns -1; 	
	public static int sum(String a, String z){
		int c = -1;
			if (RomanRow.num(a)>0 && RomanRow.num(z)>0){
				c = RomanRow.num(a)+RomanRow.num(z);} 
		return c;}
		
// below method returns difference of two numbers each valued from 1 to 10 only, otherwise returns -10 	
	public static int deduc(String a, String z){
		int c = -10;
			if (RomanRow.num(a)>0 && RomanRow.num(z)>0){
				c = RomanRow.num(a) - ArabRow.num(z);} 
		return c;}
		
// below method returns product of two numbers each valued from 1 to 10 only, otherwise returns -1	
	public static int mult(String a, String z){
		int c = -1;
			if (RomanRow.num(a)>0 && RomanRow.num(z)>0){
				c = RomanRow.num(a) * RomanRow.num(z);} 
		return c;}
		
// below method returns division result of two numbers each valued from 1 to 10 only, otherwise returns -1	
	public static int div(String a, String z){
		int c = -1;
		if (RomanRow.num(a)>0 && RomanRow.num(z)>0){
			c = (int)(RomanRow.num(a) / RomanRow.num(z));} 
		return c;}}

