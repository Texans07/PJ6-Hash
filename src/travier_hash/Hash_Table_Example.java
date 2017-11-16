/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travier_hash;



public class Hash_Table_Example {
    private  String [] hashtable;
    private int mySize;
    
    public Hash_Table_Example(int size)
    {
        hashtable = new String[size];
        mySize = size;
    }
    
    public void addToHash(String input)
    {
    int hashValue = input.hashCode();
    hashValue = Math.abs(hashValue);
    int finalPos = hashValue%mySize;
    hashtable[finalPos] = input;
        System.out.println("HashValue = " + " "+ hashValue + " "+ "FinalPosition:"+" "+finalPos + " "+ "Array:"+ " "+ hashtable[finalPos]);
        
    }
    
    
    public void printOut()
    {
        for(int i = 0; i < mySize; i++)
        {
            System.out.println( hashtable[i]);
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
