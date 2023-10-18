package practical5;
import javax.swing.*;

class ResumeForm
{
	JFrame main_frame;

	JLabel lname, lcontact, lemail;
	JLabel lschool, lsy, lsa;
	JLabel ljcollege, ljcy, ljca;
	JLabel lscollege, lscy, lsca;

	JLabel laddress, lskills;

	JTextField sname, scontact, semail;
	JTextField sschool, ssy, ssa; // for school details
	JTextField sjcollege, sjcy, sjca; // for school details
	JTextField sscollege, sscy, ssca; // for school details

	JTextArea saddress, sskills;

	JRadioButton male;  
	JRadioButton female;  

	ButtonGroup gender;
	JButton submit, reset;

	ResumeForm()
	{
		main_frame=new JFrame("Resume Form");

		lname = new JLabel("Name");
		lcontact = new JLabel("Contact Number");
		lemail = new JLabel("EMail");

		lname.setBounds(10,20,300,30);
		lcontact.setBounds(10,50,300,30);
		lemail.setBounds(10,80,300,30);

		lschool = new JLabel("School Name");
		lsy = new JLabel("Passing Year");
		lsa = new JLabel("Aggregate");

		lschool.setBounds(10,250,200,50);
		lsy.setBounds(310,250,200,50);
		lsa.setBounds(610,250,200,50);

		ljcollege = new JLabel("Jr. College Name");
		ljcy = new JLabel("Passing Year");
		ljca = new JLabel("Aggregate");

		ljcollege.setBounds(10,350,200,50);
		ljcy.setBounds(310,350,200,50);
		ljca.setBounds(610,350,200,50);

		lscollege = new JLabel("Graduation College Name");
		lscy = new JLabel("Passing Year");
		lsca = new JLabel("Aggregate");

		lscollege.setBounds(10,450,200,50);
		lscy.setBounds(310,450,200,50);
		lsca.setBounds(610,450,200,50);

		laddress = new JLabel("Address");
		lskills = new JLabel("Skills");

		laddress.setBounds(10,140,100,30);
		lskills.setBounds(300,140,100,30);

		sname = new JTextField();
		scontact = new JTextField();
		semail = new JTextField();

		sname.setBounds(220,10,300,30);
		scontact.setBounds(220,40,300,30);
		semail.setBounds(220,70,300,30);

		sschool = new JTextField();
		ssy = new JTextField();
		ssa = new JTextField();

		sschool.setBounds(10,300,300,30);
		ssy.setBounds(310,300,300,30);
		ssa.setBounds(610,300,300,30);

		sjcollege = new JTextField();
		sjcy = new JTextField();
		sjca = new JTextField();

		sjcollege.setBounds(10,400,300,30);
		sjcy.setBounds(310,400,300,30);
		sjca.setBounds(610,400,300,30);

		sscollege = new JTextField();
		sscy = new JTextField();
		ssca = new JTextField();

		sscollege.setBounds(10,500,300,30);
		sscy.setBounds(310,500,300,30);
		ssca.setBounds(610,500,300,30);

		saddress = new JTextArea();
		sskills = new JTextArea();

		saddress.setBounds(10,170,275,70);
		sskills.setBounds(300,170,275,70);

		male = new JRadioButton("Male");    
		female = new JRadioButton("Female");

		male.setBounds(220,110,100,30);
		female.setBounds(320,110,100,30);

		gender = new ButtonGroup();

		submit = new JButton("Submit");
		reset = new JButton("Reset");

		submit.setBounds(275,550,100,30);
		reset.setBounds(425,550,100,30);

		gender.add(male);
		gender.add(female);

		main_frame.add(lname);
		main_frame.add(lcontact);
		main_frame.add(lemail);

		main_frame.add(sname);
		main_frame.add(scontact);
		main_frame.add(semail);

		main_frame.add(laddress);
		main_frame.add(lskills);

		main_frame.add(saddress);
		main_frame.add(sskills);

		main_frame.add(male);
		main_frame.add(female);

		main_frame.add(lschool);
		main_frame.add(lsy);
		main_frame.add(lsa);

		main_frame.add(sschool);
		main_frame.add(ssy);
		main_frame.add(ssa);

		main_frame.add(ljcollege);
		main_frame.add(ljcy);
		main_frame.add(ljca);

		main_frame.add(sjcollege);
		main_frame.add(sjcy);
		main_frame.add(sjca);

		main_frame.add(lscollege);
		main_frame.add(lscy);
		main_frame.add(lsca);

		main_frame.add(sscollege);
		main_frame.add(sscy);
		main_frame.add(ssca);

		main_frame.add(submit);
		main_frame.add(reset);

		main_frame.setSize(1000,1000);
		main_frame.setLayout(null);
		main_frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		new ResumeForm();
	}
}
