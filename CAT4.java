package Go_To_Hell;





import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Swingi extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nameInput;
    private JTextField genderInput;
    private JTextField emailInput;
    private JTextField designationInput;
    private JTextField mobileInput;
    private JTextField countryInput;
    private JTextField addressInput;
    private JButton btnNewButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Swingi frame = new Swingi();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Swingi() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sumit Chansoriya\\Desktop\\Christ University\\BloodBankManagementSytem\\BloodBankManagementSystem\\src\\CAT4\\ChristLogo.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        //setContentPane(new JLabel(new ImageIcon("C:\\Users\\Sumit Chansoriya\\Desktop\\Christ University\\BloodBankManagementSytem\\BloodBankManagementSystem\\src\\CAT4\\ChristLogo.png")));
        contentPane.setLayout(null);
        contentPane.setBackground(Color.CYAN);

        JLabel lblNewUserRegister = new JLabel("Registration Portal");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblGender.setBounds(58, 243, 110, 29);
        contentPane.add(lblGender);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);

        nameInput = new JTextField();
        nameInput.setFont(new Font("Tahoma", Font.PLAIN, 32));
        nameInput.setBounds(214, 151, 228, 50);
        contentPane.add(nameInput);
        nameInput.setColumns(10);

        genderInput = new JTextField();
        genderInput.setFont(new Font("Tahoma", Font.PLAIN, 32));
        genderInput.setBounds(214, 235, 228, 50);
        contentPane.add(genderInput);
        genderInput.setColumns(10);

        emailInput = new JTextField();
        emailInput.setFont(new Font("Tahoma", Font.PLAIN, 32));
        emailInput.setBounds(214, 320, 228, 50);
        contentPane.add(emailInput);
        emailInput.setColumns(10);

        designationInput = new JTextField();
        designationInput.setFont(new Font("Tahoma", Font.PLAIN, 32));
        designationInput.setBounds(707, 151, 228, 50);
        contentPane.add(designationInput);
        designationInput.setColumns(10);

        JLabel lblDesignation = new JLabel("Designation");
        lblDesignation.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblDesignation.setBounds(542, 159, 99, 29);
        contentPane.add(lblDesignation);

        JLabel lblCountry = new JLabel("Country");
        lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCountry.setBounds(542, 245, 99, 24);
        contentPane.add(lblCountry);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblMobileNumber);
        
        JLabel lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAddress.setBounds(58, 410, 139, 26);
        contentPane.add(lblAddress);

        addressInput = new JTextField();
        addressInput.setFont(new Font("Tahoma", Font.PLAIN, 32));
        addressInput.setBounds(214, 406, 228, 50);
        contentPane.add(addressInput);
        
        mobileInput = new JTextField();
        mobileInput.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mobileInput.setBounds(707, 320, 228, 50);
        contentPane.add(mobileInput);
        mobileInput.setColumns(10);

        countryInput = new JTextField();
        countryInput.setFont(new Font("Tahoma", Font.PLAIN, 32));
        countryInput.setBounds(707, 235, 228, 50);
        contentPane.add(countryInput);

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameInput.getText();
                String gender = genderInput.getText();
                String emailId = emailInput.getText();
                String designation = designationInput.getText();
                String mobileNumber = mobileInput.getText();
                int len = mobileNumber.length();
                String country = countryInput.getText();
                String address = addressInput.getText();

                String msg = "" + name;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "abroad123#");

                    String query = "INSERT INTO account values('" + name + "','" + gender + "','" + designation + "','" +
                        country + "','" + address + "','"+ emailId + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 490, 259, 74);
        contentPane.add(btnNewButton);
    }

