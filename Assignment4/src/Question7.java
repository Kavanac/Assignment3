//7. WAP to find if String contains all unique characters.

import java.util.*;

class Question7 {
	boolean uniqueCharacters(String str)
	{
		
		for (int i = 0; i < str.length(); i++)
			for (int j = i + 1; j < str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					return false;

		
		return true;
	}

	public static void main(String args[])
	{
		Question7 obj = new Question7();
		String input = "Kav";

		if (obj.uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}
}
