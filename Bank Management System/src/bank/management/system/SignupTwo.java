package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener
{
    JTextField   panTextField,aadharTextField ;
    JLabel religionlable, categorylabel, additionalDetails, incomelabel, edu, qualification, occupation, 
            pan, aadhar, senior, exacc ;
    JComboBox category,religion,income, education,occ;
    JRadioButton  eno, eyes, syes, sno; 
    JButton next;
    String formno;
    
    SignupTwo(String formno)
    { 
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        additionalDetails = new JLabel("Page 2: Additional Details" );
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 40);
        add(additionalDetails);
        
        religionlable = new JLabel("Religion:" );
        religionlable.setFont(new Font("Raleway", Font.BOLD, 20));
        religionlable.setBounds(100, 140, 100, 30);
        add(religionlable);
        
        
        String valReligion[]={"Hindu","Muslim" ,"Sikh","Christian","Jain","Other"};
         religion= new JComboBox(valReligion);
        religion.setBounds(300,140,400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        categorylabel = new JLabel("Category:" );
        categorylabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categorylabel.setBounds(100, 190, 400, 30);
        add(categorylabel);
        
        String valcategory[] ={"SC","ST","OBC","NT","general","other"};
         category= new JComboBox(valcategory);
        category.setBounds(300,190,400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        incomelabel = new JLabel("Income:" );
        incomelabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomelabel.setBounds(100, 240, 200, 30);
        add(incomelabel);
        
        String incomecategory[] ={"NULL","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000"};
        income= new JComboBox(incomecategory);
        income.setBounds(300,240,400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        edu = new JLabel("Educational" );
        edu.setFont(new Font("Raleway", Font.BOLD, 20));
        edu.setBounds(100, 290, 200, 30);
        add(edu);
        
        qualification = new JLabel("Qualification:" );
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String educationValues[] ={"Non-Graduation","Graduate","Post_Gradution","Doctrate","others"};
        education= new JComboBox(educationValues);
        education.setBounds(300,305,400, 30);
        education.setBackground(Color.WHITE);
        add(education);
  
        
        occupation = new JLabel("Occupation:" );
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String occupationValues[] ={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occ= new JComboBox(occupationValues);
        occ.setBounds(300,390,400, 30);
        occ.setBackground(Color.WHITE);
        add(occ);
        
        pan = new JLabel("PAN Number:" );
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setBounds(300,440,400,30);
        panTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(panTextField);
        
        aadhar = new JLabel("Aadhar Number:" );
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setBounds(300,490,400,30);
        aadharTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(aadharTextField);
        
        senior = new JLabel("Senior Citizen:" );
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);
        
        syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        
        exacc = new JLabel("Existing Account:" );
        exacc.setFont(new Font("Raleway", Font.BOLD, 20));
        exacc.setBounds(100, 590, 200, 30);
        add(exacc);
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        ButtonGroup accgroup = new ButtonGroup();
        accgroup.add(eyes);
        accgroup.add(eno);
        
        
      
        
        next = new JButton("Next");
        next.setBounds(620,660,80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String sreligion =(String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occ.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "Yes";
        }
        else if (sno.isSelected())
        {
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected())
        {
            existingaccount = "Yes";
        }
        else if (eno.isSelected())
        {
            existingaccount = "No";
        }
        
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
       
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"',"
                        + "'"+seducation+"','"+soccupation+"','"+span+"',"+ "'"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //signup3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        catch(Exception e){
        System.out.println(e);
    }       
        
    }

    public static void main(String[] args) 
    {
        new SignupTwo("");
    }
    
}
