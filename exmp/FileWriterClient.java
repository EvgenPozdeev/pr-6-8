package memento.example;


import memento.example.FileWriterUtil;

public class FileWriterClient {
 public static void main(String[] args) {
 FileWriterCaretaker caretaker = new FileWriterCaretaker();
 
 FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
 fileWriter.write("First Set of Data\n");
 System.out.println(fileWriter+"\n\n");
 

 caretaker.save(fileWriter);

 fileWriter.write("Second Set of Data\n");
 

 System.out.println(fileWriter+"\n\n");

 caretaker.undo(fileWriter);

 System.out.println(fileWriter+"\n\n");
 
 }
}