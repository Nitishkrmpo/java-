import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {

    JButton rules;
    JButton Exit ;
    JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.white);
         setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,500,480);
        add(image);

        JLabel heading = new JLabel("BrainBurst");
        heading.setBounds(600,50,400,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name= new JLabel("Enter your name ");
        name.setBounds(650,120,250,25);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);

      tfname = new JTextField();
     tfname.setBounds(580,150,250,35);
     tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
     add(tfname);

     rules = new JButton("Next");
     rules.setBounds(580,220,100,25);
     rules.setBackground(new Color(30,144,254));
     rules.setForeground(Color.white);
     rules.addActionListener(this);
     add(rules);

        Exit = new JButton("Exit");
        Exit.setBounds(730,220,100,25);
        Exit.setBackground(new Color(30,144,254));
        Exit.setForeground(Color.white);
        Exit.addActionListener(this);
        add(Exit);

        setSize(900,500);//setting length and breadth before making frame visible
        setLocation(175,125);//open in center
        setVisible(true);//by default frame is not visible
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        }
        else if(ae.getSource() == Exit){
          setVisible(false);
        }


    }


    public static void main(String[] args) {
        new Login(); // anonymous object
    }
}
