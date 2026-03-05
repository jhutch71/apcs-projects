// GroceryList.java (starter file)
/*
 * Project: Cart Ninja - GroceryList Class
 * Description: Implement a GroceryList class backed by an array so it behaves like a real list.
 * You will support inserting, removing (with shifting), searching, replacing, clearing, and printing.
 *
 * The main method below is a simple command runner used for testing and grading.
 * Do not change the input command format.
 */

import java.util.Scanner;

public class GroceryList
{
    // Internal storage for grocery items
    private String[] items;

    // Number of actual items currently stored (not the same as items.length)
    private int size;

    public GroceryList()
    {
        // Start with a small capacity so you can test resizing
        items = new String[5];
        size = 0;
    }
    
    /*
     * Adds item onto the end of the list
     * No elements should be overwritten.
     */
    public void add(String item)
    {
        // TODO: call add(???, item) and use the other add method to add to the end of this list
        add(size, item);
    }    

    /*
     * Inserts item into this list at the given index.
     * Any elements at or beyond index must be shifted up (to the right).
     * No elements should be overwritten.
     */
    public void add(int index, String item)
    {
        // TODO: Validate index (0..size)
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        
        // TODO: Ensure capacity (resize if full)
        ensureCapacity();
        // TODO: Shift right to make room
        for (int i = size; i > index; i--){
            items[i]=items[i-1];
        }
        // TODO: Insert item, update size
        items[index]=item;
        size++;
        
    }

    /*
     * Returns the item stored at the given index.
     */
    public String get(int index)
    {
        // TODO: Validate index (0..size-1)
        if (index < 0 || index > size-1)
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        // TODO: Return the item
        return items[index];
    }

    /*
     * Returns the index of the first instance of item.
     * If not found, return -1.
     */
    public int indexOf(String item)
    {
        // TODO: Traverse only the used portion (0..size-1)
        // TODO: Use .equals to compare Strings
        for (int i = 0; i<size; i++){
            if (items[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    /*
     * Removes the element at position index and returns the removed element.
     * Elements after index must be shifted left to compact the list.
     */
    public String remove(int index)
    {
        // TODO: Validate index (0..size-1)
        if (index < 0 || index > size-1)
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        // TODO: Save removed value
        String temp = items[index];
        // TODO: Shift left to fill the gap
        for (int i = index; i<size; i++){
            items[i] = items[i+1];
        }
        // TODO: Clear the now-unused last slot, decrement size
        items[size-1] = null;
        size--;
        return temp;
    }

    /*
     * Replaces the element at index with item.
     * Returns the element that used to be stored there.
     */
    public String set(int index, String item)
    {
        // TODO: Validate index (0..size-1)
        if (index < 0 || index > size-1)
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        // TODO: Save old value, replace, return old
        String old = items[index];
        items[index]= item;
        return old;
    }

    /*
     * Returns the number of elements in this list.
     */
    public int size()
    {
        return size;
    }

    /*
     * Removes all items from the list.
     */
    public void clear()
    {
        // TODO: Clear the used slots (optional but recommended)
        for (int i=0; i<size; i++){
            items[i] = null;
        }
        // TODO: Set size back to 0
        size = 0;
    }

    /*
     * Returns a neatly formatted version of the list like:
     * ["apples", "milk", "cookies"]
     */
    @Override
    public String toString()
    {
        // TODO: Build a String with brackets, quotes, and commas
        // Tip: Loop from 0 to size-1, not items.length
        
        String output = "[";
        
        for (int i = 0; i<size; i++){
            output += "\"" + items[i] + "\"";
            if (i<size-1) {
                output+= ", ";
            
            }
        }
        output += "]";
        return output;
    }

    /*
     * Helper method: grows internal array if needed.
     * You may change the growth strategy, but doubling is common.
     */
    private void ensureCapacity()
    {
        // Do we still have room to add new items?
        if (size < items.length)
        {
            // No need to create a bigger array
            return;
        }

        // Looks like we need to add more space to grow.. let's double the current capacity
        int newCapacity = items.length * 2;
        if (newCapacity == 0)
        {
            newCapacity = 1;  // We need a minimum of 1 slot
        }

        // Create the bigger array but store it in a different reference so we can copy the old
        // array into the new array
        String[] bigger = new String[newCapacity];
        for (int i = 0; i < items.length; i++)
        {
            bigger[i] = items[i];
        }

        // Now overwrite the reference for our items array with the new array that has double the capacity
        items = bigger;
    }

    /*
     * Command Runner (used for testing and grading)
     *
     * Commands:
     *   ADD item
     *   ADDN index item
     *   GET index
     *   INDEXOF item
     *   REMOVE index
     *   SET index item
     *   SIZE
     *   CLEAR
     *   PRINT
     *
     * Output:
     *   Only print what each command requires.
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        GroceryList list = new GroceryList();
        
        System.out.println("Command Runner (used for testing and grading)");
        System.out.println("");
        System.out.println(" Commands:");
        System.out.println("   ADD item");
        System.out.println("   ADDN index item");
        System.out.println("   GET index");
        System.out.println("   INDEXOF item");
        System.out.println("   REMOVE index");
        System.out.println("   SET index item");
        System.out.println("   SIZE");
        System.out.println("   CLEAR");
        System.out.println("   PRINT");
        System.out.println("   DONE");
        System.out.println("\n\n----");

        while (true)
        {
            System.out.print("> ");
            
            String line = in.nextLine().trim();

            if (line.length() == 0)
            {
                continue;
            }

            String[] parts = line.split(" ");
            String cmd = parts[0];

            if (cmd.equals("DONE"))
            {
                break;
            }
            else if (cmd.equals("ADD"))
            {
                String item = parts[1];
                list.add(item);
            }
            else if (cmd.equals("ADDN"))
            {
                int index = Integer.parseInt(parts[1]);
                String item = parts[2];
                list.add(index, item);
            }            
            else if (cmd.equals("GET"))
            {
                int index = Integer.parseInt(parts[1]);
                System.out.println(list.get(index));
            }
            else if (cmd.equals("INDEXOF"))
            {
                String item = parts[1];
                System.out.println(list.indexOf(item));
            }
            else if (cmd.equals("REMOVE"))
            {
                int index = Integer.parseInt(parts[1]);
                System.out.println(list.remove(index));
            }
            else if (cmd.equals("SET"))
            {
                int index = Integer.parseInt(parts[1]);
                String item = parts[2];
                System.out.println(list.set(index, item));
            }
            else if (cmd.equals("SIZE"))
            {
                System.out.println(list.size());
            }
            else if (cmd.equals("CLEAR"))
            {
                list.clear();
            }
            else if (cmd.equals("PRINT"))
            {
                System.out.println(list.toString());
            }
        }
    }
}