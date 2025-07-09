package ads;

public class SSList implements SList {

	SNode head;
	
	@Override
	public void insert(int element) {
		
		SNode newNode=new SNode(element);
		newNode.next=null;
		if(head==null) {
			
			head=newNode;
			return;
		}
		SNode current=head;
		SNode previous=null;
		
		while(current!= null) {
			if(current.data > element) {
				break;
			}
			previous=current;
			current=current.next;
			
		}
		
		if(previous == null) {
			newNode.next = current;
			head = newNode;
		}
		else {
			newNode.next = current;
			previous.next = newNode;
		}
		
		
		

	}

	@Override
	public void delete(int element) {
		
		if(search(element)) {
			SNode current =  head;
			SNode previous= null;

			if(head==null) {
				return;
			}
			
			while(current!=null) {
				if(current.data== element) {
					break;
				}
				else {
					previous=current;
					current=current.next;
				}
			}
			
			if(previous== null) {
				head=head.next;
			}
			else {
				previous.next= current.next;
			}
		}
		
		

	}

	@Override
	public void deleteAll(int element) {
		
		if(search(element)) {
			SNode current = head;
			SNode previous = null;
			
			if(head == null) {
				return;
			}
			
			while(current != null) {
				if(current.data == element) {
					if(previous == null) {
						head = head.next;
						current = current.next;
					}
					else {
						previous.next = current.next;
						current = current.next;
					}
				}
				else {
					previous = current;
					current = current.next;
				}
			}
		}

	}

	@Override
	public void print() {
		SNode current = head;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	@Override
	public boolean search(int element) {
		
		SNode current= head;
		while(current != null) {
			if(current.data== element) {
				return true;
			}
			current=current.next;
		}
		return false;
	}

}
