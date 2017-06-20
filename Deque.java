

import java.util.*;

import sun.org.mozilla.javascript.internal.Node;


public class Deque<Item> implements Iterable<Item> {
	
	private Node first;
	private Node last;
	private int N;
	
	private class node {
		Item item;
		node prev;
		node next;
	}
	
   public Deque(){
	   // construct an empty deque
	   first = null;
	   last = null;
	   N=0;
	   
   }
   
   public boolean isEmpty(){
	    // is the deque empty?
	   return first == null;
	   
   }   
   
   public int size() {
	   // return the number of items on the deque
	   return N;
	   
   }
   
   public void addFirst(Item item){
	   // add the item to the front
	   if (item==null) throw new NullPointerException();
	   node firstOld = first;
	   first.item = item;
	   first.next = firstOld;
	   
	   if(isEmpty()) {
		   last = first;
	   }
	   else {
		   firstOld.prev = first;
	   }
	   N++;
   }
   
   public void addLast(Item item){
	   // add the item to the end
	   
	   
   }
   
   public Item removeFirst(){
	   // remove and return the item from the front
	   if (N == 0) throw new java.util.NoSuchElementException();
	   Item temp = first.item;
	   first = first.getNext();
	   N--;
	   if (isEmpty()) {
		   last = null;
		   }
	   else {
		   first.prev = null;
		   return temp;
	   }
	   
   }
   
   public Item removeLast(){
	   // remove and return the item from the end
	   
	   
   }
   
   public Iterator<Item> iterator(){
	   // return an iterator over items in order from front to end
	   return new ListIterator();
   }
   
   public static void main(String[] args){
	   // unit testing (optional)
	   
   }
   
}