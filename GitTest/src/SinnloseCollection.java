import java.util.ArrayList;
import java.util.List;

/**
 * Dies ist eine Klasse, um Git zu testen... Macht alles keinen Sinn!
 *
 * @author Lars
 *
 */
public class SinnloseCollection {
	
	private List<String> testList;
	
	public SinnloseCollection(){
		testList = new ArrayList<String>();
		testList.add("Bratwurst");
		
		for (String ausgabe : testList) {
			System.out.println(ausgabe);
		}
	}
}
