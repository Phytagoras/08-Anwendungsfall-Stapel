package model;

//TODO 01: Umsetzung der Klasse Stack gemäß der Dokumentations des Landes.
public class Stack<ContentType>{
    private class Node{
        private Node back,front;
        private ContentType content;

        public Node(ContentType pContent){
            content = pContent;
            back = null;
            front = null;
        }

        public ContentType getContent(){
            return content;
        }

        public void setBack(Node newBack){
            this.back = newBack;
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
                topEnd.setBack(newNode);
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
        return topEnd.getContent();
    }
}
