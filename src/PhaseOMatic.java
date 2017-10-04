
public class PhaseOMatic {
	public static void main(String[] args){
    //make three sets of work to choose from.Add your own
		String[] wordListOne =  {"Kenneth","and-Hazel","Sitting","in-a-Tree","K-I-S-S-I-N-G"};
        String[] wordListTwo = {"10,000 Leagues","K-To-M","Forever","Focused","No-Distractions"};
        String[] wordListThree = {"This","is","LongAF","Lounges","FlowSwitches"};

        //find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        //generate three random numbers
	    int rand1 = (int) (Math.random() * oneLength);
	    int rand2 = (int) (Math.random() * twoLength);
	    int rand3 = (int) (Math.random() * threeLength);
	    
	    //Now Build a phrase
	    String phrase = wordListOne[rand1] + " " +
	    		wordListTwo[rand2] + " " + wordListThree[rand3];
	    		
	    //Now print out the line
	    System.out.println("What we need is Young " + phrase);
	}
}