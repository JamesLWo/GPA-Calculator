import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
import java.awt.event.*;



public class GPACalc {
	
	public GPACalc ()
	{
		code();
	}

	int number = 3;
	public void code()
	{
		JFrame frame1 = new JFrame("James Wo - GPA Calculator");        //CREATE JFRAME OBJECT
		frame1.setSize(1000,630 );
		frame1.setResizable(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		JPanel panel1 = new JPanel(new GridBagLayout());                //SET JPANEL OBJECT WITH GRIDBAGLAYOUT IN PARAMETER
		panel1.setBackground(Color.WHITE);
		
		
		JLabel period1 = new JLabel("Period 1:");   
		JLabel period2 = new JLabel("Period 2:");
		JLabel period3 = new JLabel("Period 3:");
		JLabel period4 = new JLabel("Period 4:");
		JLabel period556 = new JLabel("Period 5 or 5/6: ");
		JLabel period67778 = new JLabel("Period 6/7, 7, or 7/8: ");
		JLabel period899910 = new JLabel("Period 8/9, 9, or 9/10: ");
		JLabel period101111 = new JLabel("Period 10/11 or 11: ");
		JLabel period12 = new JLabel("Period 12: ");
		JLabel extra = new JLabel ("Additional Classes: ");
		JLabel extra1 = new JLabel ("Additional Classes: ");
		
		
		JLabel classLevel = new JLabel("Class Level"); //CREATE JLABEL OBJECT FOR PROMPTING USER TO SELECT CLASS LEVEL
		JLabel days = new JLabel("Days");                    //CREATE JLABEL OBJECT FOR PROMPTING USER TO SELECT DAYS
		JLabel gradeAchieved = new JLabel("Grade");          //CREATE JLABEL OBJECT FOR PROMPTING USER TO SELECT GRADE ACHIEVED
			
		GridBagConstraints c = new GridBagConstraints();    //CREATE GRIDBAG OBJECT TO USE AS PARAMETER WHEN ADDING COMPONENTS (LABEL, COMBOBOX) TO PANEL
		
		
		String[] listOfLevels = {"Select...", "AP", "Honors", "Academic", "N/A"};  //string array for combo box of class level 
		JComboBox<String> comboClassLevel1 = new JComboBox<>(listOfLevels);  //ComboBox object for class level
		JComboBox<String> comboClassLevel2 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel3 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel4 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel5 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel6 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel7 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel8 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel9 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel10 = new JComboBox<>(listOfLevels);
		JComboBox<String> comboClassLevel11 = new JComboBox<>(listOfLevels);
		
		
		String[] listOfDays = {"Select...:", "Full year + 2 day lab", "Full year + 1 day lab","Full year", "Semester", "3 Quarters", "1 Quarter", "4 days", "3 Days", "N/A"}; //string array for combo box of days
		JComboBox<String> comboDays1 = new JComboBox<>(listOfDays); //ComboBox object for days
		JComboBox<String> comboDays2 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays3 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays4 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays5 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays6 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays7 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays8 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays9 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays10 = new JComboBox<>(listOfDays);
		JComboBox<String> comboDays11 = new JComboBox<>(listOfDays);
		
		
		String [] listOfGrades = {"Select...", "A+", "A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F","N/A"}; //string array for ComboBox of grades
		JComboBox<String> comboGrades1 = new JComboBox<>(listOfGrades); //ComboBox object for grades
		JComboBox<String> comboGrades2 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades3 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades4 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades5 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades6 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades7 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades8 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades9 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades10 = new JComboBox<>(listOfGrades);
		JComboBox<String> comboGrades11 = new JComboBox<>(listOfGrades);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String [] classLevelArray = new String[11];
						classLevelArray[0] = (String)comboClassLevel1.getSelectedItem();
						classLevelArray[1] = (String)comboClassLevel2.getSelectedItem();
						classLevelArray[2] = (String)comboClassLevel3.getSelectedItem();
						classLevelArray[3] = (String)comboClassLevel4.getSelectedItem();
						classLevelArray[4] = (String)comboClassLevel5.getSelectedItem();
						classLevelArray[5] = (String)comboClassLevel6.getSelectedItem();
						classLevelArray[6] = (String)comboClassLevel7.getSelectedItem();
						classLevelArray[7] = (String)comboClassLevel8.getSelectedItem();
						classLevelArray[8] = (String)comboClassLevel9.getSelectedItem();
						classLevelArray[9] = (String)comboClassLevel10.getSelectedItem();
						classLevelArray[10] = (String)comboClassLevel11.getSelectedItem();
					String [] gradeArray = new String[11];
						gradeArray[0] = (String)comboGrades1.getSelectedItem();
						gradeArray[1] = (String)comboGrades2.getSelectedItem();
						gradeArray[2] = (String)comboGrades3.getSelectedItem();
						gradeArray[3] = (String)comboGrades4.getSelectedItem();
						gradeArray[4] = (String)comboGrades5.getSelectedItem();
						gradeArray[5] = (String)comboGrades6.getSelectedItem();
						gradeArray[6] = (String)comboGrades7.getSelectedItem();
						gradeArray[7] = (String)comboGrades8.getSelectedItem();
						gradeArray[8] = (String)comboGrades9.getSelectedItem();
						gradeArray[9] = (String)comboGrades10.getSelectedItem();
						gradeArray[10] = (String)comboGrades11.getSelectedItem();
					String [] daysArray = new String[11];
						daysArray[0] = (String)comboDays1.getSelectedItem();
						daysArray[1] = (String)comboDays2.getSelectedItem();
						daysArray[2] = (String)comboDays3.getSelectedItem();
						daysArray[3] = (String)comboDays4.getSelectedItem();
						daysArray[4] = (String)comboDays5.getSelectedItem();
						daysArray[5] = (String)comboDays6.getSelectedItem();
						daysArray[6] = (String)comboDays7.getSelectedItem();
						daysArray[7] = (String)comboDays8.getSelectedItem();
						daysArray[8] = (String)comboDays9.getSelectedItem();
						daysArray[9] = (String)comboDays10.getSelectedItem();
						daysArray[10] = (String)comboDays11.getSelectedItem();
						
						double credit = 0;
						double creditsAttempted =0;
						double creditsMultiplied = 0;
						double sumOfCreditsMultiplied = 0;
						double sumOfCreditsAttempted = 0;
						double total = 0;
						for(int i = 0; i<11; i++)
						{
						if (classLevelArray[i] == "AP")
						{
						if (gradeArray[i] == "A+")
								 credit = 5.375;
						 else if (gradeArray[i] == "A")
								 credit = 5.000;
						 else if (gradeArray[i] == "A-")
								credit = 4.625;
					    else if (gradeArray[i] == "B+")
								credit = 4.125;
							else if (gradeArray[i] == "B")
								 credit = 3.75;
							else if (gradeArray[i] == "B-")
								 credit = 3.375;
							else if (gradeArray[i] == "C+")
								 credit = 2.875;
							 else if (gradeArray[i] == "C")
								 credit = 2.5;
							 else if (gradeArray[i] == "C-")
								 credit = 2.125;
							 else if (gradeArray[i] == "D+")
								 credit = 1.625;
							 else if (gradeArray[i] == "D")
								 credit = 1.25;
							 else if (gradeArray[i] == "D-")
								 credit = 0.875;
							 else if (gradeArray[i] == "F")
								 credit = 0;
							 else credit=0;
						}
						
						 else if (classLevelArray[i] == "Honors")
						{
							 if (gradeArray[i] == "A+")
								 credit = 4.945 ;
							 else if (gradeArray[i] == "A")
								 credit = 4.6;
							 else if (gradeArray[i] == "A-")
								credit = 4.255;
							else if (gradeArray[i] == "B+")
								credit = 3.795;
							else if (gradeArray[i] == "B")
								 credit = 3.45;
							 else if (gradeArray[i] == "B-")
								 credit = 3.105;
							 else if (gradeArray[i] == "C+")
								 credit = 2.645;
							 else if (gradeArray[i] == "C")
								 credit = 2.3;
							 else if (gradeArray[i] == "C-")
								 credit = 1.955;
							 else if (gradeArray[i] == "D+")
								 credit = 1.338;
							 else if (gradeArray[i] == "D")
								 credit = 1.15;
							 else if (gradeArray[i] == "D-")
								 credit = 0.805;
							 else if (gradeArray[i] == "F")
								 credit = 0;
							 else credit = 0;
						}
						else if (classLevelArray[i] == "Academic")
						{
							if (gradeArray[i] == "A+")
								 credit = 4.3 ;
							 else if (gradeArray[i] == "A")
								 credit = 4.0;
							 else if (gradeArray[i] == "A-")
								credit = 3.7;
							else if (gradeArray[i] == "B+")
								credit = 3.3;
							else if (gradeArray[i] == "B")
								 credit = 3.0;
							 else if (gradeArray[i] == "B-")
								 credit = 2.7;
							 else if (gradeArray[i] == "C+")
								 credit = 2.3;
							 else if (gradeArray[i] == "C")
								 credit = 2.0;
							 else if (gradeArray[i] == "C-")
								 credit = 1.7;
							 else if (gradeArray[i] == "D+")
								 credit = 1.3;
							 else if (gradeArray[i] == "D")
								 credit = 1.0;
							 else if (gradeArray[i] == "D-")
								 credit = 0.7;
							 else if (gradeArray[i] == "F")
								 credit = 0;
							 else credit = 0;
						}
						
						if (daysArray[i] == "Full year + 2 day lab")
							creditsAttempted = 7 ;
						else if (daysArray[i] == "Full year + 1 day lab")
							creditsAttempted = 6;
						else if (daysArray[i] == "Full year")
							creditsAttempted = 5;
						else if (daysArray[i] == "Semester")
							creditsAttempted = 2.5;
						else if (daysArray[i] == "3 Quarters")
							creditsAttempted = 3.75;
						else if (daysArray[i] == "1 Quarter")
							creditsAttempted = 1.25;
						else if (daysArray[i] == "4 days")
							creditsAttempted = 4;
						else if (daysArray[i] == "3 days")
							creditsAttempted = 3;
						else creditsAttempted = 0;
						
						sumOfCreditsAttempted =sumOfCreditsAttempted + creditsAttempted;
						creditsMultiplied = credit * creditsAttempted;
						sumOfCreditsMultiplied = sumOfCreditsMultiplied + creditsMultiplied;
						total = sumOfCreditsMultiplied/sumOfCreditsAttempted;
			
						
						}
						JLabel GPA = new JLabel();
						GPA.setText("Your GPA is: " + total);
						c.gridx++;
						panel1.add(GPA, c);
						panel1.validate();
						panel1.add(GPA, c);
						panel1.paintImmediately(panel1.getVisibleRect());
						
				}
				}
				);
		
		
		c.gridx = 0;                            //ADDING THE JLABEL PERIODS COMPONENTS TO THE JPANEL WITH CONSTRAINTS
		c.gridy = 1;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(10, 10, 10, 10);
		panel1.add(period1,c);
		c.gridy=2;
		panel1.add(period2,c);
		c.gridy++;
		panel1.add(period3,c);
		c.gridy++;
		panel1.add(period4,c);
		c.gridy++;
		panel1.add(period556,c);
		c.gridy++;
		panel1.add(period67778,c);
		c.gridy++;
		panel1.add(period899910,c);
		c.gridy++;
		panel1.add(period101111,c);
		c.gridy++;
		panel1.add(period12,c);
		c.gridy++;
		panel1.add(extra, c);
		c.gridy++;
		panel1.add(extra1, c);
		
	
		
		c.gridx=1;
		c.gridy=0;
		panel1.add(classLevel, c);                        //ADDING THE JLABEL SECTIONS COMPONENTS TO THE JPANEL WITH CONSTRAINTS 
		c.gridx++;
		panel1.add(gradeAchieved, c);
		c.gridx++;
		panel1.add(days, c);
		
		c.gridx=1;
		c.gridy=1;
		panel1.add(comboClassLevel1, c);  //ADDING THE JCOMBOBOX COMPONENTS TO THE JPANEL WITH CONSTRAINTS
		c.gridy++;
		panel1.add(comboClassLevel2, c);
		c.gridy++;
		panel1.add(comboClassLevel3, c);
		c.gridy++;
		panel1.add(comboClassLevel4, c);
		c.gridy++;
		panel1.add(comboClassLevel5, c);
		c.gridy++;
		panel1.add(comboClassLevel6, c);
		c.gridy++;
		panel1.add(comboClassLevel7, c);
		c.gridy++;
		panel1.add(comboClassLevel8, c);
		c.gridy++;
		panel1.add(comboClassLevel9, c);
		c.gridy++;
		panel1.add(comboClassLevel10, c);
		c.gridy++;
		panel1.add(comboClassLevel11, c);
		
		c.gridx= 2;
		c.gridy = 1;
		panel1.add(comboGrades1, c);
		c.gridy++;
		panel1.add(comboGrades2, c);
		c.gridy++;
		panel1.add(comboGrades3, c);
		c.gridy++;
		panel1.add(comboGrades4, c);
		c.gridy++;
		panel1.add(comboGrades5, c);
		c.gridy++;
		panel1.add(comboGrades6, c);
		c.gridy++;
		panel1.add(comboGrades7, c);
		c.gridy++;
		panel1.add(comboGrades8, c);
		c.gridy++;
		panel1.add(comboGrades9, c);
		c.gridy++;
		panel1.add(comboGrades10, c);
		c.gridy++;
		panel1.add(comboGrades11, c);
		
		
		
		c.gridx=3;
		c.gridy=1;
		panel1.add(comboDays1, c);
		c.gridy++;
		panel1.add(comboDays2, c);
		c.gridy++;
		panel1.add(comboDays3, c);
		c.gridy++;
		panel1.add(comboDays4, c);
		c.gridy++;
		panel1.add(comboDays5, c);
		c.gridy++;
		panel1.add(comboDays6, c);
		c.gridy++;
		panel1.add(comboDays7, c);
		c.gridy++;
		panel1.add(comboDays8, c);
		c.gridy++;
		panel1.add(comboDays9, c);
		c.gridy++;
		panel1.add(comboDays10, c);
		c.gridy++;
		panel1.add(comboDays11, c);
		
		c.gridy=17;
		c.gridx=2;
		panel1.add(submit, c);
		frame1.getContentPane();
		frame1.add(panel1, BorderLayout.NORTH);              //finally adding the entire panel to the frame 
		frame1.setVisible(true);
	}
	public static void main(String[] args) 
	{
		 new GPACalc();
	}

}