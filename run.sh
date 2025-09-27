#!/bin/bash
# Script to run the Uppercase Text Converter application

echo "Compiling UppercaseTextConverter.java..."
javac UppercaseTextConverter.java

if [ $? -eq 0 ]; then
    echo "Compilation successful. Starting application..."
    java UppercaseTextConverter
else
    echo "Compilation failed. Please check for errors."
    exit 1
fi