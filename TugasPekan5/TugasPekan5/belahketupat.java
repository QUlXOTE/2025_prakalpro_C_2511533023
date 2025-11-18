package TugasPekan5;

public class belahketupat { 
	 
    public static void main(String[] args) { 
     belahketupat(); 
    } 
    public static String repeat(String str, int count) { 
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < count; i++) { 
            sb.append(str); 
        } 
        return sb.toString(); 
    } 
 
    public static void  belahketupat() { 
        int width = 16; 
        String border = "#" + repeat("=", width) + "#"; 
         
        String[] patterns = { 
            "<><>", 
            "<>....<>", 
            "<>........<>", 
            "<>............<>" 
        }; 
 
        System.out.println(border); 
         
        for (String pat : patterns) { 
            int pad = (width - pat.length()) / 2; 
            String line = "|" + repeat(" ", pad) + pat + repeat(" ", pad) + "|"; 
            System.out.println(line); 
        } 
         
        for (int i = patterns.length - 1; i >= 0; i--) { 
            String pat = patterns[i]; 
            int pad = (width - pat.length()) / 2; 
            String line = "|" + repeat(" ", pad) + pat + repeat(" ", pad) + "|"; 
            System.out.println(line); 
        }   
        System.out.println(border); 
    } 
} 