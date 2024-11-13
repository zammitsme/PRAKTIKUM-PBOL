import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()) ;
        JFrame frame = new JFrame("AJAMJAGOO FANBASE");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout card = new CardLayout();
        JPanel mainPanel = new JPanel(card);
        
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel signupLabel = new JLabel("SIGN UP");
        signupLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        signupLabel.setFont(new Font("Montserrat", Font.BOLD, 24));
        
        JPanel formPanel1 = new JPanel(new GridBagLayout());
        formPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel1.setOpaque(false); 
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel1.add(new JLabel("Full name"), gbc);
        gbc.gridx = 1;
        JTextField fullnameField = new JTextField(20);
        formPanel1.add(fullnameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel1.add(new JLabel("Email"), gbc);
        gbc.gridx = 1;
        JTextField emailField1 = new JTextField(20);
        formPanel1.add(emailField1, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel1.add(new JLabel("Password"), gbc);
        gbc.gridx = 1;
        JPasswordField passwordField1 = new JPasswordField(20);
        formPanel1.add(passwordField1, gbc);

        JButton signupButton = new JButton("Sign Up");
        signupButton.setBackground(Color.PINK); 
        signupButton.setForeground(Color.WHITE);
        signupButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel haveaccLabel = new JLabel("I've an account");
        haveaccLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton haveaccButton = new JButton("Login");
        haveaccButton.setBackground(Color.PINK);
        haveaccButton.setForeground(Color.WHITE);
        haveaccButton.addActionListener(e -> card.show(mainPanel, "panel2"));
        haveaccButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel1.add(signupLabel);
        panel1.add(Box.createVerticalStrut(20));
        panel1.add(formPanel1);
        panel1.add(Box.createVerticalStrut(20));
        panel1.add(signupButton);
        panel1.add(Box.createVerticalStrut(10));
        panel1.add(haveaccLabel);
        panel1.add(haveaccButton);

        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel loginLabel = new JLabel("LOGIN");
        loginLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginLabel.setFont(new Font("Open Sans", Font.BOLD, 24));
        loginLabel.setForeground (Color.BLACK);

        JPanel formPanel2 = new JPanel(new GridBagLayout());
        formPanel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel2.setOpaque(false);

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel2.add(new JLabel("Email"), gbc);
        gbc.gridx = 1;
        JTextField emailField2 = new JTextField(20);
        formPanel2.add(emailField2, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel2.add(new JLabel("Password"), gbc);
        gbc.gridx = 1;
        JPasswordField passwordField2 = new JPasswordField(20);
        formPanel2.add(passwordField2, gbc);

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.pink);
        loginButton.setForeground(Color.WHITE);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel noaccLabel = new JLabel("I don't have an account");
        noaccLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton noaccButton = new JButton("Sign Up");
        noaccButton.setBackground(Color.pink);
        noaccButton.setForeground(Color.WHITE);
        noaccButton.addActionListener(e -> card.show(mainPanel, "panel1"));
        noaccButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(loginLabel);
        panel2.add(Box.createVerticalStrut(20));
        panel2.add(formPanel2);
        panel2.add(Box.createVerticalStrut(20));
        panel2.add(loginButton);
        panel2.add(Box.createVerticalStrut(10));
        panel2.add(noaccLabel);
        panel2.add(noaccButton);

        
        mainPanel.add(panel1, "panel1");
        mainPanel.add(panel2, "panel2");
        frame.add(mainPanel);

       
        card.show(mainPanel, "panel1");

        frame.setVisible(true);
    }
}