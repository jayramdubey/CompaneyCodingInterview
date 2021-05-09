package neustar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pair<K,V>{
	 K key;
	 V value;
	 public Pair(K key, V value){
		 super();
		 this.key = key;
		 this.value=value;
	 }
}
public class SelectionsProb {

	public static void main(String[] args) {
		SelectionsProb ob= new SelectionsProb();
		int n=5;
		int k=3;
		int ar[]={25,5,17,10,45};
		int ar2[]=ob.found(n, ar, k);
		for(int j=0;j<ar2.length;j++){
			System.out.print(" "+ar2[j]);
		}
	}

	public  int[] found(int N, int []score, int k){
		
		List<Pair<Integer, Integer>> list = new ArrayList<>();
		
		for(int i=0;i<score.length;i++){
			list.add(new Pair(score[i],i+1));
		}
		Collections.sort(list, new 	Comparator<Pair>(){
			@Override
			public int compare(Pair o1, Pair o2){
				return (Integer)o2.key-(Integer)o1.key;
			}
		});
		
		int []res = new int[k];
		for(int i=0;i<k;i++){
			res[i]= list.get(i).value;
		}
		return res;
	}
}
