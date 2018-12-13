import java.io.*;
import java.util.ArrayList;

/**
 * Advent of Code Day 1 Challenge
 * A file with integers(changes) is given to calculate the sum(frequency)
 * of them all.
 * The correct answer is  569.
 */
public class D1Calibrate{
    public static void main(String[] args)throws Exception{
        System.out.println(sumChanges(readFile()));
    }

    /**
     * Read file and store each line(number) in an array list of Integers.
     * @return ArrayList<Integer> all numbers in the file
     * @throws Exception
     */
    public static ArrayList<Integer> readFile()throws Exception{
        File file = new File("D1file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<Integer> changes = new ArrayList<>();

        String st;
        while((st = br.readLine()) != null)
            changes.add(Integer.valueOf(st));

        return changes;
    }

    /**
     * Take in the list of numbers and calculate their sum.
     * @return int the sum of all numbers
     */
    public static int sumChanges(ArrayList<Integer> list){
        int sum = 0;

        for(Integer i : list)
            sum += i.intValue();
        
        return sum;
    }  
}