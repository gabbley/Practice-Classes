import java.util.TreeSet;


public class DocumentIndex extends TreeSet<IndexEntry> {

	public DocumentIndex() { 
		super();
	}

	public void addWord(String word, int num) {
		
		
//		int insert = foundOrInserted(word);
//		this.get(insert).add(num);
	}

	public void addAllWords(String str, int num) {
		 for (IndexEntry i : this){
			i.add(num); 
		 }
		
		String[] strArr = str.split("\\W+");
		for (String word : strArr){
			if(!word.equals(""))
			addWord(word, num);
		}
	}

	
	//TODO do we need this joint??
	private int foundOrInserted(String word) {
//		for (int i = 0; i < this.size(); i++) {
//			String findWord = this.get(i).getWord();
//
//			// if word to find already has index entry
//			if (findWord.equalsIgnoreCase(word)) {
//				return i;
//			}
//
//			// if index entry doesn't exist, inserts index entry alphabetically
//			else if (findWord.compareToIgnoreCase(word) > 0) {
//				this.add(i, new IndexEntry(word));
//				return i;
//			}
//
//		}
//
//		// otherwise just add to the end
//		this.add(new IndexEntry(word));
//		return this.size()-1; //returns new index
		return 0;
	}

}
