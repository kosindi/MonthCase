import javax.swing.JOptionPane;


public class MonthCase {
	public enum MonthType {January, February, March, April, May, June, July, 
					August, September, October, November, December}
	
	public static void main (String[] args) {
		MonthType [] choices = {MonthType.January, MonthType.February, MonthType.March, MonthType.April, MonthType.May, 
				MonthType.June, MonthType.July, MonthType.August, MonthType.September,
								MonthType.October, MonthType.November, MonthType.December};
		
		MonthType select;
		do {
			
			select = (MonthType) JOptionPane.showInputDialog(null, "Select a month.", "Months", 
					JOptionPane.QUESTION_MESSAGE, null, choices, choices[4]); 
			if(select != null)
			{
		switch (select) {
		case December: case January: case February:
			JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
			break;
		case March: case April: case May:
			JOptionPane.showMessageDialog(null, "Happy Spring days!");
			break;
		case June: case July: case August:
			JOptionPane.showMessageDialog(null, "It's summer time!");
			break;
		case September: case October: case November:
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
			break;
		
			
		}
			}
			
				
		}
		while(select != null);

		}
	}


