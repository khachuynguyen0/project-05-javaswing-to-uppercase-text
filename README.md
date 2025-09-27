# Uppercase Text Converter - Java Swing Application

A simple Java Swing application that converts input text to uppercase. This application provides a user-friendly GUI with input and output text areas and conversion functionality.

## Features

- **Text Input Area**: Enter any text you want to convert
- **Uppercase Output Area**: View the converted uppercase text
- **Convert Button**: Click to convert input text to uppercase
- **Clear Button**: Clear both input and output areas
- **Input Validation**: Shows warning if no text is entered
- **User-friendly Interface**: Clean layout with proper labeling and scroll support

## Requirements

- Java 8 or higher
- GUI environment (X11 on Linux, Windows, or macOS)

## How to Run

### Option 1: Using the run script (Linux/macOS)
```bash
./run.sh
```

### Option 2: Manual compilation and execution
```bash
# Compile the application
javac UppercaseTextConverter.java

# Run the application
java UppercaseTextConverter
```

## How to Use

1. Launch the application using one of the run methods above
2. Enter your text in the "Input Text" area at the top
3. Click the "Convert to Uppercase" button
4. The converted uppercase text will appear in the "Uppercase Output" area below
5. Use the "Clear" button to reset both text areas

## Testing

To run the included tests:
```bash
javac UppercaseTextConverterTest.java
java -ea UppercaseTextConverterTest
```

## Screenshot

The application features a clean, intuitive interface with:
- Top section for text input
- Bottom section for uppercase output
- Control buttons at the bottom
- Scroll support for long text

## Implementation Details

- Built using Java Swing components
- Uses proper event handling with ActionListener
- Implements input validation and user feedback
- Follows Java coding best practices
- Thread-safe GUI operations using SwingUtilities.invokeLater()
