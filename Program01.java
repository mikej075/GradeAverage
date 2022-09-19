// Michael James
// Program 01
// CSC 229

import javax.swing.JOptionPane;

public class Program01 {
	public static void main(String[] args)
	{
		// Define variables;
		String firstName;
		String lastName;
		String classCode;
		String Input;
		int Project1Grade;
		int Project2Grade;
		int Project3Grade;
		int TestGrade1;
		int TestGrade2;
		float ProjectPercentage;
		float TestPercentage;
		float ClassPercentage;
		
		// Ask for user input
		firstName = JOptionPane.showInputDialog
				("Please enter your first name");
		lastName = JOptionPane.showInputDialog
				("Please enter your last name");
		classCode = JOptionPane.showInputDialog
				("Please enter your class code(CSC 229)");
		
		Input =  JOptionPane.showInputDialog
			("Enter First Project Grade (integer 0-100");
		Project1Grade = Integer.parseInt(Input);
		Input =  JOptionPane.showInputDialog
				("Enter Second Project Grade (integer 0-100");
		Project2Grade = Integer.parseInt(Input);
		Input =  JOptionPane.showInputDialog
				("Enter Third Project Grade (integer 0-100");
		Project3Grade = Integer.parseInt(Input);
		Input =  JOptionPane.showInputDialog
				("Enter First Test Grade (integer 0-100");
		TestGrade1 = Integer.parseInt(Input);
		Input =  JOptionPane.showInputDialog
				("Enter Second Test Grade (integer 0-100");
		TestGrade2 = Integer.parseInt(Input);
		ProjectPercentage = (Project1Grade + Project2Grade + Project3Grade);
		ProjectPercentage = ProjectPercentage / 300 * 100;
		TestPercentage = (TestGrade1 + TestGrade2);
		TestPercentage = TestPercentage / 200 * 100;
		ClassPercentage = (float) (ProjectPercentage*.40 + TestPercentage*.60);
		// Display students information and statistics
		JOptionPane.showMessageDialog(null,
				"            CSC 229 - Project 01" + "\n"+
				" ________________________________________"+"\n"+
				"           STUDENT INFORMATION                                   "+"\n"+
				" ________________________________________"+"\n"+
				"           First Name : " + firstName              +"\n"+
				"           Last Name : " + lastName              +"\n"+
				"           Class Code : " + classCode              +"\n"+
				" ________________________________________"+"\n"+
				"           GRADE INFORMATION                                   "+"\n"+
				" ________________________________________"+"\n"+
				"           Project 1 Grade : " + Project1Grade              +"\n"+
				"           Project 2 Grade : " + Project2Grade              +"\n+"+
				"           Project 3 Grade : " + Project3Grade              +"\n"+
				"           Test 1 Grade : " + TestGrade1              +"\n"+
				"           Test 2 Grade : " + TestGrade2              +"\n"+
				" ________________________________________"+"\n"+
				"           Statistics                                 "+"\n"+
				"           % Grade For Projects : " +ProjectPercentage              +"\n"+
				"           % Grade For Test : " + TestPercentage             +"\n"+
				"           % Grade For Class : " + ClassPercentage             +"\n"+
				
				
				" ________________________________________"+"\n"
				
				
				);
}
	
}