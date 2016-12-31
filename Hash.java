import java.io.*;
import java.util.*;
/**
 * Creates a hash table and functions to use it
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */
public class Hash
{
    private String[] table;
    private final int tablesize = 37;
    private int collisions;
    PrintWriter pw;
    
    /**
     * Constructor for hash objects
     */
    public Hash(PrintWriter pw) throws IOException
    {
        table = new String[tablesize];
        collisions = 0;
        this.pw = pw;
    }
    
    /**
     * Prints the number of collisions while creating the table
     */
    public void printNumCollisions()
    {
        System.out.println("There were " + collisions + " collisions.\n");
        pw.println("There were " + collisions + " collisions.\n");
    }
    
    /**
     * Prints the hash table
     */
    public void printTable()
    {
        System.out.println("\nHash Table: ");
        System.out.println("_______________");
        pw.println("\nHash Table: ");
        pw.println("_______________");
        for (int i = 0; i < table.length; i++)
        {
            System.out.printf("|%-2d | %-8s|\n", i, table[i]);
            pw.printf("|%-2d | %-8s|\n", i, table[i]);
            if (i+1 < table.length)
            {
                System.out.println("|---|---------|");
                pw.println("|---|---------|");
            }
                              
        }
        System.out.println("|___|_________|");
        System.out.println();
        pw.println("|___|_________|");
        pw.println();
       
    }
    
    /**
     * Returns the hash table
     * @return - the hash table
     */
    public String[] getTable()
    {
        return table;
    }
    
    /**
     * Reads in the words that appear in hash table and inserts
     * them into a hash table
     */
    public void getHashTable() throws IOException
    {
        File temp = new File("hash.txt");       // gets text file and opens it for read
        Scanner sc = new Scanner(temp);
        
        String[] tempTable = new String[tablesize];        // gets temp Hash table
        
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            String delims = "[ ]+";
            String[] tokens = line.split(delims);
            
            // gets words from line and inserts them into HashTable
            String string1 = tokens[0];
            insertHash(tempTable, string1);
            String string2 = tokens[1];
            insertHash(tempTable, string2);
            String string3 = tokens[2];
            insertHash(tempTable, string3); 
            
        }
        
        
        
        sc.close();
        table = tempTable;
    }
    
    /**
     * Checks to see if word appears in hash table
     * @param token - word that's being checked
     * @return - true if it's found in hash table
     */
    public boolean checkHash(String token)
    {
        int index = hash(token) ;        // get tokens hash
        
        
        if (token.equals(table[index]))      // if table has token at its hash
            return true;
        
        
        for (int i = index; i < table.length; i++)
        {
            if (token.equals(table[i]))
                return true;
        }
        
        for (int j = 0; j < index; j++)
        {
            if (token.equals(table[j]))
                return true;
        }
        
        return false;
        
    }
    
    /**
     * Inserts word into hash table using linear probing for collisions
     * @param table - the hash table
     * @param word - the word to be inserted
     */
    public void insertHash(String[] table, String word)
    {
        int index = hash(word);              // get words hash
        
        int end = table.length;             // end of hash table
    
        
       for (int i = index; i < end; i++)       //starts at index, ends at array end
        {
            if (table[i] == null)               // if space is free, put element there
            {
                table[i] = word;
                if (i != index)
                    collisions++;
                
                return;
            } 
            
        }
        
        for (int j = 0; j < index; j++)
        {
            if (table[j] == null)               // if space is free, put element there
            {
                table[j] = word;
                if (j != index)
                    collisions++;
                
                return;
                
            }
        }
                    
        
    }
    
    public void hashDescription()
    {
        System.out.println("My hash function starts with a sum of 0 and adds the");
        System.out.println("ASCI value of the next character in the string to the sum,");
        System.out.println("then multiplies the current sum by 19 (Because it's an odd");
        System.out.println("prime) and loops to the next character until it's read");
        System.out.println("every character. It then divides the sum by the hash table");
        System.out.println("size and returns the remainder.");
        
        pw.println("My hash function starts with a sum of 0 and adds the");
        pw.println("ASCI value of the next character in the string to the sum,");
        pw.println("then multiplies the current sum by 19 (Because it's an odd");
        pw.println("prime) and loops to the next character until it's read");
        pw.println("every character. It then divides the sum by the hash table");
        pw.println("size and returns the remainder.");
        
    }
    
    
    /**
     * Gets the hash position of a string
     * @param s - word to be hashed
     * @return - hash value
     */
    public int hash(String s)
    {
        long sum = 0;
        
        for (int i = 0; i < s.length(); i++){
            sum += (int)s.charAt(i);
            sum *= 19;
        }
        return (int)(sum % tablesize);    
        
        
    }
  
    
}
