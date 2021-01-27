import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		String text;
		int count1 = 0;
		int count2 = 0;
		String[] titleArr = new String[20];
		String[] authorArr = new String[20];
		
		try {
			Scanner sc = new Scanner(new File("data.txt"));
			while(sc.hasNext()) {
				text = sc.nextLine();
				if(text.contains("<Title>")) {
					titleArr[count1] = text;
					count1++;
				} else if(text.contains("<Author>")) {
					authorArr[count2] = text;
					count2++;
				}
				for(int i = 0; i < 20; i++) {
				//	strArr[i] = text;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Title: " + titleArr[0] + "\nAuthor: " + authorArr[0]);
	}

}
