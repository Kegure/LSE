package lse;
public class Node {
    private int info;
    private Node next;
    
    Node (int value){
        this.info = value;
    }
    void SetInfo(int value){
        this.info = value;
    }
    int GetInfo(){
        return this.info;
    }
    void SetNext(Node no){
        this.next = no;
    }
    Node GetNext(){
        return this.next;
    }
}
