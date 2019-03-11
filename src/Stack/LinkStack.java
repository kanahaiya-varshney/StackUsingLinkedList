package Stack;

import LinkList.LinkedList;

public class LinkStack {
    private LinkedList theList;
    private int count;
    public LinkStack(){
        theList = new LinkedList();
        count=0;
    }
    public void push(int value){
        theList.insertFirst(value);
        count++;
    }
    public void pop(){
        theList.deleteFirst();
        count--;
    }
    public void displayStack(){
        theList.display();
    }
    public String getCount(){
        return count+"";
    }
    public boolean isEmpty(){
        return count==0;
    }

}
