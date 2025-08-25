public class LinkedList{
    public class Node{
        int val;
        Node next;
        
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    
    private Node head;
    private int size=0;
    
    public int size(){
        return size;
    }
    
    public void addFirst(int item){
        Node nn=new Node(item);
        if(size==0){
            head=nn;
        }else{
            nn.next=head;
            head=nn;
        }
        size++;
    }
    
    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }else{
            Node nn=new Node(item);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
            size++;
        }
    }
    
    public int removeFirst() throws Exception{
        if(size<=0){
            throw new Exception("Invalid");
        }else if(size==1){
            Node temp=head;
            head=null;
            size--;
            return temp.val;
        }else{
            Node temp=head;
            head=head.next;
            size--;
            temp.next=null;
            return temp.val;
        }
    }
    
    public int removeLast() throws Exception{
        if(size<=0){
            throw new Exception("Invalid");
        }else if(size==1){
            return removeFirst();
        }else{
            Node temp=getNode(size-2);
            Node lastnode=temp.next;
            temp.next=null;
            size--;
            return lastnode.val;
        }
    }
    
    public Node getNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Invalid");
        }
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    
    public void addAtIndex(int item,int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("Invalid");
        }else if(k==0){
            addFirst(item);
        }else if(k==size){
            addLast(item);
        }else{
            Node newnode=new Node(item);
            Node temp=getNode(k-1);
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }
        return;
    }
    
    public int getFirst() throws Exception{
        if(size==0){
            throw new Exception("Invalid");
        }
        
        return head.val;
    }
    
    public int getLast() throws Exception{
        if(size==0){
            throw new Exception("Invalid");
        }
        
        return getNode(size-1).val;
    }
    
    public int removeAtIndex(int k) throws Exception{
        if(size==0 || k<0 || k>=size){
            throw new Exception("Invalid");
        }
        if(k==0){
            return removeFirst();
        }else{
            Node k_1th=getNode(k-1);
            Node kth=k_1th.next;
            k_1th.next=kth.next;
            size--;
            return kth.val;
        }
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
