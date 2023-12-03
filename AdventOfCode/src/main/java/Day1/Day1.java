package Day1;

import java.io.*;

public class Day1 {

    static File inputFile = new File("F:\\PWorkspace\\AdventOfCode2023\\AdventOfCode\\src\\main\\java\\Day1\\InputDay1.txt");
    static int sum;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String currentLine;
        String withoutNum;
        int currentSum = 0;

        while ((currentLine = bufferedReader.readLine()) != null) {

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