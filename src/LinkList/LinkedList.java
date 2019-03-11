package LinkList;

import Link.*;

public class LinkedList {
    private Link first;
    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(int data){
        Link newlink=new Link();
        newlink.setData(data);
        if(isEmpty()) first=newlink;
        else{
            newlink.setNext(first);
            first=newlink;
        }
    }

    public void display(){
        Link temp=first;
        while(temp!=null){
            System.out.print(temp.getData()+"  ");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public void deleteFirst(){
        Link temp=first;
        if(isEmpty()) System.out.println("No data");
        else{
            System.out.println("Deleted Data:"+first.getData());
            first=first.getNext();
        }
    }
}
