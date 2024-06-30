package view.set;

import java.util.HashSet;
import java.util.Set;

import bean.ItemGroup;

public class Ex02OverlappingPrinciple {
	
	public static void main(String[] args) {
		Set<ItemGroup> groups = new HashSet<>();
		
		groups.add(new ItemGroup(1, "G1"));
		groups.add(new ItemGroup(2, "G2"));
		groups.add(new ItemGroup(3, "G3"));
		groups.add(new ItemGroup(4, "G4"));
		groups.add(new ItemGroup(5, "G5"));
		
		groups.add(new ItemGroup(3, "G3"));
		
		System.out.println("size = " +groups.size());
	}
	
}
