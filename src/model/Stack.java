package model;

//TODO 01: Umsetzung der Klasse Stack gemäß der Dokumentations des Landes.
public class Stack<ContentType>{
    private class Node{
        private Node back,front;
        private ContentType content;

        public Node(ContentType pContent){
            content = pContent;
            front = null;
        }

        public ContentType getContent(){
            return content;
        }

        public void setFront(Node newNode){
            this.front = newNode;
        }

        public Node getFront(){
            return front;
        }
    }

    private Node topEnd;

    public Stack(){
        topEnd = null;
    }

    public boolean isEmpty(){
        if(topEnd == null){
            return true;
        }
        return false;
    }

    public void push(ContentType pContent){
        if(pContent != null){
            Node newNode = new Node(pContent);
            //Falls die Schlange leer ist...
            if(this.isEmpty()){
                topEnd = newNode;
            }else{ //sonst...
                newNode.setFront(topEnd);
                topEnd = newNode;
            }
        }
    }
    public void pop(){
        if(!isEmpty()){
            topEnd = topEnd.getFront();
        }
    }
    public ContentType top(){
        if(isEmpty()) return null;
        return topEnd.getContent();
    }
}
