import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simple Java Swing application that converts input text to uppercase.
 * The application provides a user-friendly GUI with input and output text areas
 * and a convert button.
 */
public class UppercaseTextConverter extends JFrame implements ActionListener {
    
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JButton convertButton;
    private JButton clearButton;
    
    /**
     * Constructor to initialize the GUI components and layout.
     */
    public UppercaseTextConverter() {
        setTitle("Uppercase Text Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Center the window
        
        initializeComponents();
        setupLayout();
        
        setVisible(true);
    }
    
    /**
     * Initialize all GUI components.
     */
    private void initializeComponents() {
        // Input text area with scroll pane
        inputTextArea = new JTextArea(8, 40);
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        inputTextArea.setBorder(BorderFactory.createTitledBorder("Input Text"));
        
        // Output text area with scroll pane
        outputTextArea = new JTextArea(8, 40);
        outputTextArea.setLineWrap(true);
        outputTextArea.setWrapStyleWord(true);
        outputTextArea.setEditable(false);
        outputTextArea.setBorder(BorderFactory.createTitledBorder("Uppercase Output"));
        outputTextArea.setBackground(new Color(245, 245, 245));
        
        // Buttons
        convertButton = new JButton("Convert to Uppercase");
        convertButton.addActionListener(this);
        convertButton.setPreferredSize(new Dimension(200, 30));
        
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        clearButton.setPreferredSize(new Dimension(100, 30));
    }
    
    /**
     * Setup the layout of components.
     */
    private void setupLayout() {
        setLayout(new BorderLayout());
        
        // Main panel with input and output areas
        JPanel mainPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Input panel
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(new JLabel("Enter text to convert:"), BorderLayout.NORTH);
        inputPanel.add(new JScrollPane(inputTextArea), BorderLayout.CENTER);
        
        // Output panel
        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.add(new JLabel("Converted text:"), BorderLayout.NORTH);
        outputPanel.add(new JScrollPane(outputTextArea), BorderLayout.CENTER);
        
        mainPanel.add(inputPanel);
        mainPanel.add(outputPanel);
        
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(convertButton);
        buttonPanel.add(clearButton);
        
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    /**
     * Handle button click events.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            convertText();
        } else if (e.getSource() == clearButton) {
            clearText();
        }
    }
    
    /**
     * Convert the input text to uppercase and display in output area.
     */
    private void convertText() {
        String inputText = inputTextArea.getText();
        if (inputText.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Please enter some text to convert!", 
                "No Input", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String uppercaseText = inputText.toUpperCase();
        outputTextArea.setText(uppercaseText);
    }
    
    /**
     * Clear both input and output text areas.
     */
    private void clearText() {
        inputTextArea.setText("");
        outputTextArea.setText("");
        inputTextArea.requestFocus();
    }
    
    /**
     * Main method to run the application.
     */
    public static void main(String[] args) {
        // Set look and feel to system default
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // If setting look and feel fails, continue with default
            e.printStackTrace();
        }
        
        // Create and display the GUI on EDT
        SwingUtilities.invokeLater(() -> new UppercaseTextConverter());
    }
}