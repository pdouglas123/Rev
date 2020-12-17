import java.util.regex.*;

public class Validate {

	public static boolean isValidSSN(String strSSN)
    {

    	String regexssn = "^(?!666|000|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0{4})\\d{4}$";
    	Pattern p = Pattern.compile(regexssn);
 
        if (strSSN == null) {
            return false;
        }
 
        Matcher ssn = p.matcher(strSSN);
        return ssn.matches();
    }
 
	public static boolean isValidDL(String strDL)
    {

		String regexdl = "^(?<intro>[A-Z]{2})(?<numeric>\\d{2})(?<year>\\d{4})(?<tail>\\d{7})$";
		Pattern p = Pattern.compile(regexdl);
 
        if (strDL == null) {
            return false;
        }
 
        Matcher ssn = p.matcher(strDL);
        return ssn.matches();
    }
	
    public static void main(String args[])
    {
    	//for SSN
    	String str1 = "126-45-6369";
        System.out.println(isValidSSN(str1));
 
        String str2 = "000-00-0000";
        System.out.println(isValidSSN(str2));
 
        String str3 = "126-436-6129";
        System.out.println(isValidSSN(str3));
        
        String str4 = "147-15-0000";
        System.out.println(isValidSSN(str4));
        
        //for DL
    	String str5 = "123411231231458";
        System.out.println(isValidDL(str5));
 
        String str6 = "000-00-0000";
        System.out.println(isValidDL(str6));
 
        String str7 = "AB2211231231458";
        System.out.println(isValidDL(str7));
        
        String str8 = "A2221@231212358";
        System.out.println(isValidDL(str8));
    }

}
