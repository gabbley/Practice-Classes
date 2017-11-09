import java.util.TreeSet;

public class IndexEntry {
	
	private String word;
	private TreeSet<Integer> numsList;
	
	public IndexEntry(){
		word = "";
		numsList = new TreeSet<Integer>();
	}
	
	public IndexEntry(String word){
		this.word = word;
	}

	public void add(int num){
		numsList.add(num);
	}
	
	public String getWord(){
		return word;
	}
	
	public String toString(){
		return getWord() + " " + numsList.toString();
	}
	
}
