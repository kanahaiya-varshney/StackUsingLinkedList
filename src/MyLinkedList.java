class Link{
    public int data;
    public Link next;
    public Link(int data){
        this.data=data;
    }
    @Override
    public String toString(){
        return data+"";
    }
}
//end of Link class;
 class LinkedList{
    private Link first;
    int length=0;
    /*public LinkedList(){   //constructor

        first=null;
    }*/
    public boolean isEmpty(){   //Method to check whether the list is empty of not
        if(first==null) return true;
        else return false;
    }
    public void insert(int data){    //Method to insert data into Linked List
        Link newlink=new Link(data);
        insert(newlink);
    }
    public void insert(Link newlink){   //Method to insert Link into Linked List
        if(first==null){
            first=newlink;
            length++;
        }
        else{
            Link temp=first;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newlink;
            length++;
        }
    }
    public void display(){    //Method to display the Linked List
        Link temp=first;
        while(temp!=null){
            System.out.print(temp.toString()+"-->");
            temp=temp.next;
        }
        System.out.println("Null");

    }
    public void searchInsert(int search,int data){     //Method to insert data after searching a particular data
        if(first==null) System.out.println("No data");
        else {
            Link temp = first;
            while (temp != null && temp.data != search) {
                temp = temp.next;
            }
            if(temp==null){
                System.out.println("Unsuccessful Searching");
            }
            else{
                Link newlink=new Link(data);
                newlink.next=temp.next;
                temp.next=newlink;
                length++;
            }

        }
    }
    private void printReverse(Link temp){
        if(temp.next==null){
            System.out.print(temp.data+"-->");
        }
        else{
            printReverse(temp.next);
            System.out.print(temp.data+"-->");
        }
    }
    public void reversePrint(){
    printReverse(first);
        System.out.print("null");
        System.out.println();
    }

    public void delete(int data){  //Method to delete the specified data link
        Link temp=first;
        Link prev=null;
        if(first==null) {
            System.out.println("No data");
            return;
        }
        while(temp.next!=null && temp.data!=data){
            prev=temp;
            temp=temp.next;

        }
        if(temp==null){
            System.out.println("Unsuccessful Searching");
        }
        else{
            prev.next=temp.next;
            length--;
        }
        temp=null;
        System.gc();   //Garbage collector to free up memory
    }
    public Link find(int searchKey){           //Method to find a data link
        Link temp=first;
        while(temp!=null && temp.data!=searchKey){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Not found");
            return null;
        }
        else{
            System.out.print("Found ");
            return temp;
        }
    }
    public void sort(){
        Link temp=first;
        Link prev=first;
        int c=0;
        for(int i=0;i<length;i++){
            c=0;
            while(temp!=null){
                if(prev.data > temp.data){
                    c=1;
                    break;
                }
                else{
                    prev=temp;
                    temp=temp.next;
                    c=0;
                }
            }
            if(c==1){
                Link a=prev;
                prev=temp.next;
                temp=a;
            }
        }
    }
}
public class MyLinkedList{            //Main class
    public static void main(String[] args) {
        LinkedList ob=new LinkedList();
        ob.insert(450);
        ob.insert(451);
        ob.insert(452);
        ob.insert(453);
        ob.insert(454);
        //ob.searchInsert(451,250);
        //ob.searchInsert(452,896);
        ob.display();
        //ob.delete(452);
        //ob.sort();
        //ob.display();
        //System.out.println(ob.find(896));
        //System.out.println(ob.length);
        ob.reversePrint();
    }
}