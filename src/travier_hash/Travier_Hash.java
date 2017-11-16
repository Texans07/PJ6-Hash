/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travier_hash;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dt024
 */
public class Travier_Hash {


    public static void main(String[] args) throws FileNotFoundException {
        
        /*
        Hash_Table_Example HT = new Hash_Table_Example(200);
        HT.addToHash("Fred");
        HT.addToHash("Bozo");
        HT.addToHash("That");
        HT.addToHash("MyName");
        HT.addToHash("egg");
        HT.addToHash("Mississippi");
        HT.addToHash("Angelica");
        HT.addToHash("This Class is full of Nuts");
        HT.printOut();
        // TODO code application logic here*/
        Hash_Table_Example HT = new Hash_Table_Example(200);
        String FileName = "data.txt";
        java.io.File file = new java.io.File(FileName);
        Scanner input=new Scanner(file);
        input.useDelimiter(" +"); //delimitor is one or more spaces
System.out.println(" Here is the Data before being entered into nodes!");
System.out.println();
System.out.println();
while(input.hasNext()){
   //test to see what each word looks like before input into tree 
///System.out.println(Arrays.toString(input.next().toLowerCase().trim().split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+")));

    HT.addToHash(Arrays.toString(input.next().toLowerCase().trim().replace("-", "").replace("\"", "").replace("'' ", "").replace(".", "").replace(",", "").replace("?", "").replace("] ", "").replace("!","").replace(" ", "").replace("'", "").split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+")));
  //
//mytree.addNode(Arrays.toString(input.next().toLowerCase().trim().replace("-", "").replace("\"", "").replace("'' ", "").replace(".", "").replace(",", "").replace("?", "").replace("] ", "").replace("!","").replace(" ", "").replace("'", "").split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+")));
}
HT.printOut();
        
    }
    
}
