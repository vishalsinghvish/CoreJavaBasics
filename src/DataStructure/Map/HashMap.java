package DataStructure.Map;

public class HashMap<T> {
	LinkedList<T>[] arr=new LinkedList[16];
	
	public int Hash(int k){
		return k%15;
	}
	
	public void put(T key, T value){
		//send the HashCode to our hashing function
		int index=Hash(key.hashCode());
		
		if(arr[index]==null){
			arr[index]=new LinkedList();
			arr[index].insert(key, value);
		}else{
			arr[index].insert(key, value);
			arr[index].printLinkedList();
		}
		
	}
}
