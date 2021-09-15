
public class Assignment {
	
// begin 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] age = {3,9,23,64,2,8,28,51};

//subtract the value of the 1st element in the array the last value and print
	
	 System.out.println( age[age.length - 1] - age[0]);
	 
	 // calculate the average age as a whole number not rounding up 
	 
	 int sum = 0;
  for (int i=0; i <  age.length; i++) {
	     sum = sum + age[i];
	 }
	 int averageAge = sum / age.length;

	 System.out.println( "The average age in my array is " + averageAge);
	 String [] names = new String[6];
	 names[0] = "Sam";
	 names[1] = "Tommy";
	 names[2] = "Tim";
	 names[3] = "Sally";
	 names[4] = "Buck";
	 names[5] = "Bob";
	 double totalNumber = 0;
	 
	 for( int j=0; j < names.length; j++) {
		 totalNumber = totalNumber + names[j].length();	 
	 }
	 System.out.println("The average number of letters per name in my array is " 
	 + totalNumber/names.length);
	
	// concatenate all names
	 
	for (int j=0; j < names.length; j++) {
		
		System.out.print(names[j] + " ");
	}
	System.out.println(" ");
	int [] nameLengths = new int [6];
	for (int i=0; i< 6; i++) {
	nameLengths[i] = names[i].length();
	}
	int sum2 = 0;
	for (int i = 0; i< 6; i++) {
		sum2 = sum2 + nameLengths[i];
	     }
	System.out.println("Sum of all elements is array nameLengths = " + sum2);
	
	System.out.println(multString("Hello", 3));
	
	String firstName = "Shavonne";
	String lastName = "Hill";
    System.out.println(createFullName(firstName,lastName));
    int [] num = new int [5];
    num[0]= 0;
    num[1]= 11;
    num[2]= 10;
    num[3]= 1;
    num[4]= 2;
    System.out.println(sumGreater100(num)); 
    
    double[] score = new double [4];
	  score[0] = 87.2;
	  score[1] = 90.0;
	  score[2] = 75.0;
	  score[3] = 87.5;
	 System.out.println(calAve(score));
		 
    double[] testNumber = new double [4];
    testNumber[0] = 8.0;
    testNumber[1] = 9.5;
    testNumber[2] = 1.1;
    testNumber[3] = 7.5;
    System.out.println(compareArray(testNumber,score));
    
    boolean isHotOutside = false ;
    double costOfDrink = 11.00;
    System.out.println(willBuyDrink(isHotOutside,costOfDrink));
    int streetNumber = 1042;
    String streetName = "Inverness Parkway";
    System.out.println(createAddress(streetNumber,streetName));
    
 }
			 
	// end of main
	
		// problem 8
	
	public static String multString(String word, int n) {
		String result = " ";
		for (int i = 0; i < n; i++) {
			result += word; 
		}
		return result;
	}
	//problem 7
	
	public static String createFullName(String firstName, String lastName) {
	String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	// problem 9 
	public static String sumGreater100 (int [] num) {
		int sum100 = 0;
		for (int i = 0; i< num.length; i++) {
			sum100 = sum100 + num [i];
		} 
		if (sum100 > 100) 
		{return "true";
		}
		else {
			return "false" ;
			}
	}
		
// problem 10
	
	public static double calAve(double [] score) {
		double total = 0;
		for(int i=0; i < score.length; i++) {
		 total = total + score[i];
			}
		return total/score.length;
	}
  

// problem 11
	
	 public static String compareArray(double[] array1, double[] array2) {
	double totalArray1 = 0;	  
		 double totalArray2 = 0;
	 for (int i = 0; i < array1.length; i++) {
			 totalArray1 = totalArray1 + array1[i];
		 } double array1Ave = totalArray1 / array1.length;
		 
		 for (int i = 0; i < array2.length; i++) {
			 totalArray2 = totalArray2 + array2[i];
		 } double array2Ave = totalArray2 / array2.length;
		 if(array1Ave > array2Ave) {
			 return "true";
		 } return "false"; 
		 }
 
//problem 12
	 
	 public static String willBuyDrink(boolean isHotOutside, double moneyInPocket)
	 {
		 if ((isHotOutside) && (moneyInPocket > 10.50))
		 {return "true";}
		 {
		  return "false"; 
		 }
	 } 
 // problem 13 
	 public static String createAddress(int streetNumber, String streetName)
	 { String address = streetNumber + " " + streetName;
	 
		 return address;
			 
 }
 
// end of class	
    }
	