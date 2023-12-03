package Day1;

import java.io.*;

public class Day1 {

    static File inputFile = new File("F:\\PWorkspace\\AdventOfCode2023\\AdventOfCode\\src\\main\\java\\Day1\\TestInputPart2.txt");
    static int sum;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String currentLine;
        String withoutNum = "";
        int currentSum = 0;

        while ((currentLine = bufferedReader.readLine()) != null) {

            switch(currentLine){
                case "one" -> currentLine.replaceAll("one", "1");
                case "two" -> currentLine.replaceAll("two", "2");
                case "three" -> currentLine.replaceAll("three", "3");
                case "four" -> currentLine.replaceAll("four", "4");
                case "five" -> currentLine.replaceAll("five", "5");
                case "six" -> currentLine.replaceAll("six", "6");
                case "seven" -> currentLine.replaceAll("seven", "7");
                case "eight" -> currentLine.replaceAll("eight", "8");
                case "nine" -> currentLine.replaceAll("nine", "9");
            }

            withoutNum = currentLine.replaceAll("[a-zA-Z]", "");

            String firstChar = String.valueOf(withoutNum.charAt(0));
            String secondChar = String.valueOf(withoutNum.charAt(withoutNum.length() - 1));

            String numString = firstChar + secondChar;
            currentSum = Integer.parseInt(numString);

            sum += currentSum;
            System.out.println(withoutNum);
        }
        System.out.println(sum);
    }

}