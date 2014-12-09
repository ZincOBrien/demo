import java.util.StringTokenizer;

public class Capitalize

{
	
static void printCapitalized(String input)
	{
	// creating new variables for string tokenizer
	StringTokenizer st1;
	
	//setting st1 = to input from argument
	st1 = new StringTokenizer(input);
	
	//output
	System.out.println("Token1: " + st1.nextToken());
	System.out.println("Token2: " + st1.nextToken());
	System.out.println("Token3: " + st1.nextToken());
	System.out.println("Token4: " + st1.nextToken());
	System.out.println("Token5: " + st1.nextToken());
	
	
	// can't convert from string to char so I can't use Character.isLetter
	//char input2 =input;
	
//if (Character.isLetter(input) == true)
//{
	//System.out.println("wow");
//}
	// create char array and fill it with input? no that fails too
	//char[] charArray = input;
	
	//create string array and fill that with input?
	
	// well okay i have a string array but honestly i dont know how to go through it with the char functions
	String stringArray[];
	
	// fill array with input 
	for(int i =0; i<=input.length(); i++)
	{
		//split up input somehow and assign into stringArray character by character make each a char variable???
		//input = stringArray[i];
		//need to figure out how to read the variable input out one character at a time but I dont know how so im stuck again
	}
	
	
	
	// OK so clearly Ill just try to explain what else I would do as I'm hung up here. I think i would try to turn the 
	//string variable into a char one and then go through it letter by letter. first checking each character to
	//see if it was a space. if it was a space then I would select the next letter to be capitalized by
	//using the Character.toUpperCase. When i went through the whole thing I would convert it back into a string 
	// somehow and return the value as my output variable.
	//points of failure: 
	//2. cant convert from string to char
	//3. most of the body of the method is basically impossible to work on
		 
		System.out.println("input is: " + input);
		
		// do something to input ????????
		// both functions given on the page are for char data type and are useless wtf?
		
		String output = "output";
		//return output;
	}
	



	
	
	
public static void main(String[] args)
{
	String inputM = "this is my input sentence";
	
	printCapitalized( inputM );
		// can't make a static reference to non-static method I have no idea how to get around this so Im moving on 
		
	
	// creat new object called newObj
	//Capitalize newObj = new Capitalize();
	
	//newObj.input = inputM;
	//inputM = newObj.input;
	
	
	//display the return value of printCapitalized
	//System.out.println("in theory the return value would be displayed here: " + newObj.printCapitalized(inputM));
	
	
}
}