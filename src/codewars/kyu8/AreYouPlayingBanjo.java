package codewars.kyu8;

public class AreYouPlayingBanjo {

	  public static String areYouPlayingBanjo(String name) {
		    return name + (name.toLowerCase().startsWith("r") ? " plays banjo" : " does not play banjo");
		  }
	
}
