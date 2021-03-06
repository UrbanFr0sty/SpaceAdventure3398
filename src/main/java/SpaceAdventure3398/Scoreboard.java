

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;




public class Scoreboard
{
	private long currentScore;
	private final int numberOfScores = 10; // only keeping top 10 scores
	private List<ScoreLine> topScores;

	static String fileSep = System.getProperty("file.separator");
	// FOr now, the file that stores the top scores is stored in the main directory
	private static String filePath = "." + fileSep + "topScores.txt";


	private class ScoreLine implements Comparable<ScoreLine>
	{
		public long score;
		public String name;
		
		public ScoreLine(long s, String n)
		{	
			score = s;
			name = n;
		}

		@Override
		public int compareTo(ScoreLine otherItem)
		{
			return (this.score > otherItem.score) ? -1 : (this.score < otherItem.score) ? 1 : 0;
		}
	}

	/**
	 * The Scoreboard class uses a local file that keeps the top k scores 
	 * for all the players. k = 10 by default. A new session begins with a score of 0.
	 * @pre  newFile must be a full valid path including the proper file separators.
	 */
	public Scoreboard()
	{
		currentScore = 0;
		readFile();

	}
	
	public void readFile() {
		int n = 0;
		topScores = new ArrayList<ScoreLine>();
		try
		{
			Scanner readFile = new Scanner(new FileReader(filePath));
			while (readFile.hasNextLine() && n < numberOfScores ) 
			{
				String text = readFile.nextLine();
				if(text.length() > 0)
				{
					String[] tokens = text.split("\\s+");
					topScores.add( new ScoreLine( Integer.parseInt(tokens[0]), tokens[1]) );
					++n;
				}
			}
			while ( n < numberOfScores ) 
			{
				topScores.add( new ScoreLine(0, "------") );
				++n;
			}
		
			readFile.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

	public void updateCurrentScore(long points)
	{
		currentScore = currentScore + points;
		if (currentScore < 0) currentScore = 0;
		//TODO check for overflow
	}

	public long getCurrentScore()
	{
		return currentScore;
	}

	public void resetScore() {
		currentScore = 0;
	}

    public long getScoreAt(int pos)
	{
		if(pos > topScores.size()-1 || pos < 0) 
		{ 
			return -1;
		}
		else
		{
			return topScores.get(pos).score;
		}
	}

    public String getNameAt(int pos)
	{
		if(pos > topScores.size()-1 || pos < 0) 
		{ 
			return "";
		}
		else
		{
			return topScores.get(pos).name;
		}
	}

	public void save(String name)
	{
		readFile();
		Collections.sort(topScores); // sort the list just in case.
		if(topScores.size() > 0)
		{
        	long lowestScore = topScores.get(topScores.size() - 1).score; 
			if (currentScore > lowestScore)
			{
				// replace last item and sort list
				topScores.remove( topScores.size() - 1 );
				topScores.add( new ScoreLine(currentScore, name) );
				Collections.sort(topScores);
			}
		}

		try
		{
			//Save the contents of the file to a temp file.
			PrintWriter writeFile = new PrintWriter( filePath );
			for(ScoreLine s : topScores)
			{
				writeFile.print(s.score + "\t" + s.name + "\n");
			}
			writeFile.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}	

	public String getScores()
	{
		String list = String.format("%9s", "Score  ") + String.format("%6s", " ") 
					+ String.format("%10s","Name  ") + "\n";
		list +=  String.format("%9s", "---------") + String.format("%6s", " ") 
			   + String.format("%10s", "----------") + "\n";
		for(ScoreLine s : topScores)
		{
			list += String.format("%9s", s.score) + String.format("%6s", " ");
			list += String.format("%10s", s.name) + "\n";
		}

		return list;
	}
}






