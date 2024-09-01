**Question:**

"Write a Java method that converts a given string into a decimal (double) format. The method should handle various numerical string formats, including those with commas as thousands separators and those with decimal points. Additionally, the method should be able to handle negative numbers and return a suitable error message or exception if the input string is not a valid number."

**Example Inputs and Expected Outputs:**

1. Input: `"1,234.56"`  
   Output: `1234.56`
   
2. Input: `"-987.65"`  
   Output: `-987.65`
   
3. Input: `"45,678"`  
   Output: `45678.0`
   
4. Input: `"abc123"`  
   Output: `NumberFormatException` (or a custom error message like "Invalid number format")

**Additional Requirements:**

- Implement proper error handling to manage invalid input strings.
- Ensure the method can handle both positive and negative numbers.

---

This question tests the ability to handle string parsing and error handling in Java, along with working with numerical data types like `double`.
