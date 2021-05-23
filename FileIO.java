
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Scanner;

public class FileIO 
{
	static TreeMap<String, String> map = new TreeMap<String, String>();
	
	public static void FileInputMap()
	{
		try
		{
			BufferedReader text = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/USER/eclipse-workspace/TeamProject/test.txt"), "UTF-8"));
			
			while(true) 
			{
				String element = text.readLine();
				
				if(element == null)
					break;
				
				String[] elementArr = element.split(" ");
				
				map.put(elementArr[0], elementArr[1]);
			}
			
			text.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	public static void DataSearch(String word)
	{
		if(map.containsKey(word))
		{
			System.out.println(word + " " + map.get(word));
		}
		else
		{
			System.out.println("The word does not exist");
		}
	}

}