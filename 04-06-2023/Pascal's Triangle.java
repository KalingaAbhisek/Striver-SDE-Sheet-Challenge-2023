import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static ArrayList<Long> generateRow(int row){
		ArrayList<Long> temp=new ArrayList<>();
		long mul=1;
		temp.add(mul);
		for(int i=1;i<row;i++){
			mul*=(row-i);
			mul/=i;
			temp.add(mul);
		}
		return temp;

	}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> res=new ArrayList<>();
		for(int i=1;i<=n;i++){
			res.add(generateRow(i));
		}
		return res;
	}
}
