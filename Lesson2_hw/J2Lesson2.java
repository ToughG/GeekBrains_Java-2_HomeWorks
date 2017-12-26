import java.io.*;
/**
 * Java. Level 2. Lesson 2. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 26, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-2_HomeWorks
 */
 public class J2Lesson2{
    static String[][] myArr = new String[4][4];
    
    public static void main(String[] args){
        String[][] myArr = {{"1","1","f","1"},{"1","1","1","1"},
                            {"1","1","1","1"},{"1","1","1","1"}};
    //  readFile();                             
        arrayEx(myArr);
       
    }
    //Пытался сделать чтение из файла - так и не вышло, за не имением времени , оставлю пока без чтения из файла.
    /*static void readFile(){
        try (FileReader file = new FileReader("arr.txt")) {
            int b;
            while ((b = file.read()) != -1)
                for(int i=0; i<4; i++){
                    for(int g=0; g<4; g++){
                        myArr[i][g] = String.valueOf(((char)b));    
                    }
                }                  
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } */   
    static void arrayEx(String[][] arr){
        int sum = 0;
        int a = arr[0].length;
        int b = arr.length; 
        if ((a != 4)&(b != 4)){
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
        }
        for(int i = 0; i < 4; i++){
            for(int g = 0; g < 4; g++){
                try{
                    int num = Integer.valueOf(arr[i][g]);
                    sum = sum + num;
                }catch(NumberFormatException ex){
                    System.out.println(ex + "at - arr[" + i + "][" + g + "]");     
                }                         
            } 
        }
        System.out.println(sum);
    }     
}