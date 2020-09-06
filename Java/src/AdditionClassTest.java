import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.FileWriter; 
import java.io.FileReader; 
import org.junit.jupiter.api.BeforeEach;
import java.io.*; 

class AdditionClassTest {
	public AdditionClass[]  AdditionClassArray;
	public int Total_cases=0;
	@BeforeEach
	public void setup() {
		AdditionClassArray= new AdditionClass[100]; 
		int number1,number2;
		
		try {
			
		   // to open the InputFile.txt for input data
			FileReader fr= new FileReader("InputFile.txt");
			BufferedReader br=new BufferedReader(fr);  //creates a buffer 
			StringBuffer sb=new StringBuffer();    //constructs a string buffer   
			String line; // to stores a line by line from input file 
			
		// loop until it reaches end of file
		while((line=br.readLine())!=null)  
		{  
			  sb.append(line);
			  sb.append("\n"); //line feed 
			  
			  // array to store values after spliting
			  String[] spiltBySpace= line.split(" "); //Splitting string method 
			  
		      // As there are two numbers
			  number1= Integer.parseInt(spiltBySpace[0]);
			  number2= Integer.parseInt(spiltBySpace[1]);
		 	  
			  //adding number1 and number to in Addition Class for addition operation
			  AdditionClassArray[Total_cases]= new AdditionClass(number1,number2);
			  
			  // method to add both numbers
			  AdditionClassArray[Total_cases].AddNumbers();
			  
			  // total cases counts the total numbers of test cases from input file.
		       Total_cases++;
		}  
		
		// close the InputFile.txt
		fr.close(); 
		
		}// Try End
		catch(Exception e) {
			
			e.printStackTrace();
		}
	
	}

	@Test
	public void TestAddNumbers() {
		// method to test that number are added correctly.
		for(int i=0;i<Total_cases;i++) {
			assertEquals(AdditionClassArray[i].number1+AdditionClassArray[i].number2,AdditionClassArray[i].TotalSum);	
		}
		
	}
	@Test
	// to write the results in Outputfile.
	public void WriteResultsInFile() {
		try { 
			   
				FileWriter writer = new FileWriter("OutputFile.txt");
				 System.out.println("in file writer"+ Total_cases);
				for(int i=0;i<Total_cases;i++) { 
				   writer.write(AdditionClassArray[i].toString()+"\r\n");
				}
				writer.flush();
				writer.close();
		}
		catch(Exception e) {
		  e.printStackTrace();	
		}
	}
}

