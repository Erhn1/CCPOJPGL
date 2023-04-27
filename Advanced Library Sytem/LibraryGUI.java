import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI {
   public static void main(String[] args) {
       
    // Create a homepage fame
    JFrame homepagefrm = new JFrame("Advanced Library System");

    // Set the window size
    homepagefrm.setSize(500, 300);

    // Set the window to appear in the center of the screen
    homepagefrm.setLocationRelativeTo(null);

    // Create a panel to hold the label and buttons
    JPanel homepagepnl = new JPanel();

    // Set the layout to BoxLayout with vertical alignment
    homepagepnl.setLayout(new BoxLayout(homepagepnl, BoxLayout.Y_AXIS));

    // Set the background color of the panel to white
    homepagepnl.setBackground(Color.WHITE);

    // Create the admin button and add it to the panel
    JButton adminbtn = new JButton("ADMIN LOGIN");
    adminbtn.setPreferredSize(new Dimension(200, 20));
    adminbtn.setAlignmentX(JButton.CENTER_ALIGNMENT);
    homepagepnl.add(Box.createVerticalStrut(70));
    homepagepnl.add(adminbtn);
    homepagepnl.add(Box.createVerticalStrut(15));
    
    //Add an action to the button
    adminbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Create a vertical Box container to hold the login fields
        Box loginBox = Box.createVerticalBox();

        // Add the username field to the login box
        JLabel adminuser = new JLabel("Username:");
        JTextField usernameAdmin = new JTextField(10);
        Box usernameBox = Box.createHorizontalBox();
        usernameBox.add(adminuser);
        usernameBox.add(Box.createHorizontalStrut(10));
        usernameBox.add(usernameAdmin);
        loginBox.add(Box.createVerticalGlue());
        loginBox.add(usernameBox);

        // Add the password field to the login box
        JLabel adminpass = new JLabel("Password:");
        JPasswordField passwordAdmin = new JPasswordField(10);
        Box passwordBox = Box.createHorizontalBox();
        passwordBox.add(adminpass);
        passwordBox.add(Box.createHorizontalStrut(10));
        passwordBox.add(passwordAdmin);
        loginBox.add(Box.createVerticalStrut(10));
        loginBox.add(passwordBox);
        loginBox.add(Box.createVerticalGlue());

        // Display the login box in the frame
        JPanel adminpnl = new JPanel();
        adminpnl.setLayout(new BorderLayout());
        adminpnl.add(loginBox, BorderLayout.CENTER);
        int option = JOptionPane.showConfirmDialog(null, adminpnl, "Login", JOptionPane.OK_CANCEL_OPTION);

        // Check the entered credentials
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameAdmin.getText();
            String password = new String(passwordAdmin.getPassword());

            // Check the list of allowed credentials
            String[][] allowedCredentials = {{"1", "1"}, {"Admin_02", "AdminTwo"}, {"Admin_03", "AdminThree"}};
            boolean allowed = false;
            for (int i = 0; i < allowedCredentials.length; i++) {
                if (username.equals(allowedCredentials[i][0]) && password.equals(allowedCredentials[i][1])) {
                    allowed = true;
                    break;
                }
            }

            if (allowed) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            
            //Create a new JFrame
            JFrame welcomefrm = new JFrame("Advanced Library System");
            welcomefrm.setSize(500, 300);
            welcomefrm.setLocationRelativeTo(null);
            welcomefrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JLabel to display the title
            JLabel welcomelbl = new JLabel("Welcome to NU Library System");
            welcomelbl.setAlignmentX(Component.CENTER_ALIGNMENT);
            welcomelbl.setFont(welcomelbl.getFont().deriveFont(25.0f));
            
            // Set the alignment of the label to center
            welcomelbl.setHorizontalAlignment(SwingConstants.CENTER);
            welcomelbl.setVerticalAlignment(SwingConstants.CENTER);

            // Add the label to the content pane of the frame
            welcomefrm.getContentPane().add(welcomelbl);

            // Make the frame visible
            welcomefrm.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
            }
        }
    }
});
    
    //Create a librarian button
    JButton libbtn = new JButton("LIBRARIAN LOGIN");
    libbtn.setPreferredSize(new Dimension(200, 20));
    libbtn.setAlignmentX(JButton.CENTER_ALIGNMENT);
    homepagepnl.add(libbtn);
    homepagepnl.add(Box.createVerticalStrut(15));
    
    //Add an action to the button
    libbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Create a vertical Box container to hold the login fields
        Box loginBox = Box.createVerticalBox();

        // Add the username field to the login box
        JLabel libuser = new JLabel("Username:");
        JTextField usernameLib = new JTextField(10);
        Box usernameBox = Box.createHorizontalBox();
        usernameBox.add(libuser);
        usernameBox.add(Box.createHorizontalStrut(10));
        usernameBox.add(usernameLib);
        loginBox.add(Box.createVerticalGlue());
        loginBox.add(usernameBox);

        // Add the password field to the login box
        JLabel libpass = new JLabel("Password:");
        JPasswordField passwordLib = new JPasswordField(10);
        Box passwordBox = Box.createHorizontalBox();
        passwordBox.add(libpass);
        passwordBox.add(Box.createHorizontalStrut(10));
        passwordBox.add(passwordLib);
        loginBox.add(Box.createVerticalStrut(10));
        loginBox.add(passwordBox);
        loginBox.add(Box.createVerticalGlue());

        // Display the login box centered in the frame
        JPanel libpnl = new JPanel();
        libpnl.setLayout(new BorderLayout());
        libpnl.add(loginBox, BorderLayout.CENTER);
        int option = JOptionPane.showConfirmDialog(null, libpnl, "Login", JOptionPane.OK_CANCEL_OPTION);

        // Check the entered credentials
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameLib.getText();
            String password = new String(passwordLib.getPassword());

            // Check the list of allowed credentials
            String[][] allowedCredentials = {{"1", "1"}, {"Librarian_02", "LibTwo"}, {"Librarian_03", "LibThree"}};
            boolean allowed = false;
            for (int i = 0; i < allowedCredentials.length; i++) {
                if (username.equals(allowedCredentials[i][0]) && password.equals(allowedCredentials[i][1])) {
                    allowed = true;
                    break;
                }
            }

            if (allowed) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                
        // If login is successful, show a new JFrame with a JScrollPane containing a list of books
        JFrame booksfrm = new JFrame("Book List");
        booksfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        booksfrm.setSize(400, 300);

        // Create a list of books to display
        String[] bookList = {"Little Women by Louisa May Alcott ", "Catching Fire by Suzanne Collins", "Divergent by Veronica Roth"};
        // Create an array to store the number of available copies for each book
        int[] bookCopies = {3, 3, 3};

        // Create a JList to display the book list
        JList<String> list = new JList<>(bookList);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Create a JScrollPane to hold the JList
        JScrollPane scrollPane = new JScrollPane(list);

        // Add the JScrollPane to the JFrame
        booksfrm.add(scrollPane);

        // Center the JFrame on the screen
        booksfrm.setLocationRelativeTo(null);
        
        // Create a rent button
        JButton rentButton = new JButton("Rent Book");
        rentButton.setPreferredSize(new Dimension(100, 30));
        
        //Add an action to the button
        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex >= 0 && bookCopies[selectedIndex] > 0) {
                    bookCopies[selectedIndex]--;
                    JOptionPane.showMessageDialog(booksfrm, "Thank you for renting.");
                } else {
                    JOptionPane.showMessageDialog(booksfrm, "Sorry, this book is unavailable.");
                }
            }
        });
        //Create a panel for the rent button
        JPanel rentbtnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rentbtnPanel.add(rentButton);
        booksfrm.add(rentbtnPanel, BorderLayout.SOUTH);
        
        // Display the JFrame
        booksfrm.setVisible(true);
        
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
            }        
        }
    }
});
    //Create an exit button
    JButton exitbtn = new JButton("EXIT");
    exitbtn.setBackground(Color.RED);
    exitbtn.setAlignmentX(JButton.CENTER_ALIGNMENT);
    
    //Add an action to the button
    exitbtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    
    // Create a panel for exit button
    homepagepnl.add(exitbtn);
    homepagepnl.add(Box.createVerticalStrut(15)); // add little space

    // Add the panel to the frame
    homepagefrm.add(homepagepnl);

    // Set the default close operation to exit the application
    homepagefrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Display the frame
    homepagefrm.setVisible(true);
  }
}
