import java.io.*;
class FileReader{
   public static void main(String args[]){
      try{
             File file = new File("E://file.txt");
            BufferedReader fileInput = new BufferedReader(file);
           for (int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
        }catch(IOException ex){
            System.out.println("FileReadre");
         }
         catch(FileNotFoundException ex){
            System.out.println("FileReadre");
         }
  }
}