package Main;

import Stack.LinkStack;

public class Main {
    public static void main(String[] args) {
        LinkStack ob=new LinkStack();
        ob.push(145);
        ob.push(146);
        ob.push(147);
        ob.push(148);
        ob.push(149);
        ob.push(178);
        ob.push(195);
        ob.displayStack();
        ob.pop();
        ob.pop();
        ob.displayStack();

    }
}
