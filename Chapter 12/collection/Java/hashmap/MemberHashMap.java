package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	
	public MemberHashMap() {
		
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		
		hashMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		
		if(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
			return true;
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			System.out.println(hashMap.get(ir.next()));
		}
		
		System.out.println();
	}

}
