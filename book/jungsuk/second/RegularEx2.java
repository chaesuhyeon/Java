import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "c#","car", "combat", "count", "date", "disc"};
        String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]", "c.", "c.*", "c\\.","c\\w", "c\\d", "c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}"};

        for (int x = 0; x < pattern.length; x++) {
            Pattern p = Pattern.compile(pattern[x]);
            System.out.print("Pattern : " + pattern[x] + " 결과: ");
            for (int i = 0; i < data.length; i++) {
                Matcher m = p.matcher(data[i]);
                if(m.matches()){
                    System.out.print(data[i] + ",");
                }
            }
            System.out.println();
        }
    }
}
/*
Pattern : .* 결과: bat,baby,bonus,cA,ca,co,c.,c0,c#,car,combat,count,date,disc,
Pattern : c[a-z]* 결과: ca,co,car,combat,count,
Pattern : c[a-z] 결과: ca,co,
Pattern : c[a-zA-Z] 결과: cA,ca,co,
Pattern : c[a-zA-Z0-9] 결과: cA,ca,co,c0,
Pattern : c. 결과: cA,ca,co,c.,c0,c#,
Pattern : c.* 결과: cA,ca,co,c.,c0,c#,car,combat,count,
Pattern : c\. 결과: c.,
Pattern : c\w 결과: cA,ca,co,c0,
Pattern : c\d 결과: c0,
Pattern : c.*t 결과: combat,count,
Pattern : [b|c].* 결과: bat,baby,bonus,cA,ca,co,c.,c0,c#,car,combat,count,
Pattern : .*a.* 결과: bat,baby,ca,car,combat,date,
Pattern : .*a.+ 결과: bat,baby,car,combat,date,
Pattern : [b|c].{2} 결과: bat,car,
*/
