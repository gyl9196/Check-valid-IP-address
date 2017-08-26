import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex 	{
	private Pattern pattern;
    private Matcher matcher;
    private static final String IP_PATTERN = 
    		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
    public IPValidationRegex() {
    	this.pattern = Pattern.compile(IP_PATTERN);
    }
    
    /* Check The IP, find it is validate or nor*/
    public boolean checkIP(String ip) {
    	this.matcher = pattern.matcher(ip);
    	return matcher.matches();
    }	
}
