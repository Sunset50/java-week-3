
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
	
	double[] score = new double [4];
	  score[0] = 87.2;
	  score[1] = 90.0;
	  score[2] = 75.0;
	  score[3] = 87.5;
	 System.out.println(calAve(score));

	String firstName = "Shavonne";
	String lastName = "Hill";
    System.out.println(createFullName(firstName,lastName));
	}
	// end of main	
		
	public static String multString(String word, int n) {
		String result = " ";
		for (int i = 0; i < n; i++) {
			result += word; 
		}
		return result;
	}
	
	public static String createFullName(String firstName, String lastName) {
	String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public static double calAve(double [] score) {
		double total = 0;
		for(int i=0; i < score.length; i++) {
		 total = total + score[i];
			}
		return total/score.length;
	}
    
// end of class	
}	