package DataStructure.Map;

public class HashMap {
	LinkedList<Integer>[] arr=new LinkedList[16];
	
	public int Hash(int k){
		return k%15;
	}
	
	public void put(int key, int value){
		int index=Hash(key);
		
		if(arr[index]==null){
			arr[index]=new LinkedList();
			arr[index].insert(key, value);
		}else{
			arr[index].insert(key, value);
			arr[index].printLinkedList();
		}
		
	}
}
