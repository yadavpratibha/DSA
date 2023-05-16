package lecture39;

public class HashMap {

	public class Node {

		String key;
		Integer val;
		Node next;

		public Node(String key, Integer val) {  //constructor for Node
			this.key = key;
			this.val = val;
		}

	}

	Node[] arr;
	int size = 0;

	public HashMap() {  //constructor for HashMap
		arr = new Node[4];
	}

	public HashMap(int n) {
		arr = new Node[n];
	}
	
	public int hashFunction(String key) {
		int bucketno=key.hashCode()%arr.length;
		if(bucketno<0) {
			bucketno=bucketno+arr.length; //if bucketno is negative, taking positive modulo
		}
		return bucketno;
	}
	
	public void put(String key,Integer val) {
		int bucketno=hashFunction(key);
		Node temp=arr[bucketno];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.val=val;
				return;
			}
			temp=temp.next;
		}
		Node nn=new Node(key, val);
		nn.next=arr[bucketno];
		arr[bucketno]=nn;
		size++;
		double loadfactor=(1.0*size)/arr.length;
		double threshholdfactor=2.0;
		if(loadfactor>threshholdfactor) {
			rehashing();
		}
	}
	
	public Integer get(String key) {
		int bucketno=hashFunction(key);
		Node temp=arr[bucketno];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.val;
			}
			temp=temp.next;
		}
		return null;	
	}
	
	public boolean containsKey(String key) {
		int bucketno=hashFunction(key);
		Node temp=arr[bucketno];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public Integer remove(String key) {
		int bucketno=hashFunction(key);
		Node temp=arr[bucketno];
		Node prev=null;
		while(temp!=null) {
			if(temp.key.equals(key)) {
				break;
			}
			prev=temp;
			temp=temp.next;
		}
		if(temp==null) {
			return null;
		}
		if(prev==null) {
			arr[bucketno]=temp.next;
			temp.next=null;
		}
		else {
			prev.next=temp.next;
		}
		size--;
		return temp.val;
	}
	
	@Override
	public String toString() {
		String s="{";
		for(Node nn:arr) {
			while(nn!=null) {
				s=s+nn.key+"="+nn.val+", ";
				nn=nn.next;
						
			}
		}
		return s+"}";
	}
	
	private void rehashing() {
		Node[] narr=new Node[2*arr.length];
		Node[] oba=arr;
		arr=narr;
		size=0;
		for (Node nn : oba) {
			while (nn != null) {
				put(nn.key, nn.val);
				nn = nn.next;
			}
		}
	}
}
