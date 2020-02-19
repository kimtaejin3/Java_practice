import java.util.ArrayList;

//인접리스트로 구현

class ListGraph{
	
	private ArrayList<ArrayList<Integer>> listGraph;

	public ListGraph(int initSize) {
		this.listGraph=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<initSize+1; i++) {
			listGraph.add(new ArrayList<Integer>());
		}
	}
	
	public ArrayList<ArrayList<Integer>>getGraph(){
		return this.listGraph;
	}
	
	public ArrayList<Integer> getNode(int i){
		return this.listGraph.get(i);
	}
	
	//양방향
	public void put(int x, int y) {
		listGraph.get(x).add(y);
		listGraph.get(y).add(x);
	}
	
	//단방향
	public void putSingle(int x,int y) {
		listGraph.get(x).add(y);
	}
	
	public void printGraphToAdList() {
		for(int i=1; i<listGraph.size(); i++) {
			System.out.print("정점  "+i+"의 인접리스트");
		
			for(int j=0; j<listGraph.get(i).size(); j++)
			{
				System.out.print("->"+listGraph.get(i).get(j));
			}
			System.out.println();
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		int initSize=6;
		ListGraph adList=new ListGraph(initSize);
		adList.put(1, 2);
		adList.put(1, 3);
		adList.put(2, 3);
		adList.put(2, 4);
		adList.put(3, 4);
		adList.put(3, 5);
		adList.put(4, 5);
		adList.put(4, 6);
		
		adList.printGraphToAdList();
		
		System.out.println(adList.getNode(1));
		System.out.println(adList.getGraph());
	}

}
