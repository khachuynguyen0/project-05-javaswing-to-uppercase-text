/**
 * Simple test class to validate the uppercase conversion functionality
 * without requiring GUI interaction.
 */
public class UppercaseTextConverterTest {
    
    public static void main(String[] args) {
        System.out.println("Running tests for UppercaseTextConverter...");
        
        // Test basic uppercase conversion
        testBasicConversion();
        testEmptyString();
        testMixedCaseString();
        testSpecialCharacters();
        testNumbers();
        
        System.out.println("All tests completed successfully!");
    }
    
    private static void testBasicConversion() {
        String input = "hello world";
        String expected = "HELLO WORLD";
        String actual = input.toUpperCase();
        
        assert actual.equals(expected) : "Basic conversion failed: expected '" + expected + "', got '" + actual + "'";
        System.out.println("✓ Basic conversion test passed");
    }
    
    private static void testEmptyString() {
        String input = "";
        String expected = "";
        String actual = input.toUpperCase();
        
        assert actual.equals(expected) : "Empty string test failed: expected '" + expected + "', got '" + actual + "'";
        System.out.println("✓ Empty string test passed");
    }
    
    private static void testMixedCaseString() {
        String input = "Hello World! This is a Test.";
        String expected = "HELLO WORLD! THIS IS A TEST.";
        String actual = input.toUpperCase();
        
        assert actual.equals(expected) : "Mixed case test failed: expected '" + expected + "', got '" + actual + "'";
        System.out.println("✓ Mixed case test passed");
    }
    
    private static void testSpecialCharacters() {
        String input = "hello@world.com #test $money %discount";
        String expected = "HELLO@WORLD.COM #TEST $MONEY %DISCOUNT";
        String actual = input.toUpperCase();
        
        assert actual.equals(expected) : "Special characters test failed: expected '" + expected + "', got '" + actual + "'";
        System.out.println("✓ Special characters test passed");
    }
    
    private static void testNumbers() {
        String input = "test123 456test number789";
        String expected = "TEST123 456TEST NUMBER789";
        String actual = input.toUpperCase();
        
        assert actual.equals(expected) : "Numbers test failed: expected '" + expected + "', got '" + actual + "'";
        System.out.println("✓ Numbers test passed");
    }
}