package HackerRank;
import java.util.*;
import java.io.*;
import java.time.LocalDate;


//* The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 //* You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 //* For example, if you are given the date , the method should return  as the day on that date.
 //* A single line of input containing the space separated month, day and year, respectively, in format.
public class dateAndTime{
     public static void main(String[] args) throws IOException {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         // BufferedReader is from Reader class, efficient reading of characters, arrays, lines
        // BufferedWriter class extends writer, writing out characters, arrays, strings
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
         String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
         int month = Integer.parseInt(firstMultipleInput[0]);
         int day = Integer.parseInt(firstMultipleInput[1]);
         int year = Integer.parseInt(firstMultipleInput[2]);
         String res = Result.findDay(month, day, year);

         bufferedWriter.write(res);
         bufferedWriter.newLine();
         bufferedReader.close();
         bufferedWriter.close();
     }
 }

 class Result{
    public static String findDay(int month, int day, int year){
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}

