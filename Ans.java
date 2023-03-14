
class HelloWorld {
    public static String longAns(String str2, String str1){
        String longSub="";
        String currSub="";

        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    currSub+=str1.charAt(i);
                    i++;
                }else if(currSub.length() > longSub.length()){
                    longSub=currSub;
                    currSub="";
                }else{
                    currSub="";
                }
            }
        }
        return longSub;
    }
    public static void main(String[] args) {
        // Let str1 = "VIVEK"
        // Let str2 = "SVIVEKSINGH"        
        //  Output: "VIVEK"
        String str1="VIVEK";
        String str2="SVIVEKSINGH";
        String longSiml=longAns(str1,str2);

        System.out.println(longSiml);;
    }
}

//-----------------------------------------------------------------another
// Question for Vivek and Prashant- Given two string print the longest similar
//  characters sequentially in both the strings.

// Let str1 = “ALHIOPK”
// Let str2 = “KHXOLPMK”         Output: “KHOPK
let str1 = 'ALHIOPK';
let str2 = 'KHXOLPMK'; 
let ans="";

for(let i=0;i<str1.length;i++){
    for(let j=0;j<str2.length;j++){
        if(charAt)
    }
}
//-----------------------------------------------------another with HASHMAp
//best optimal code 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str1 = "ALHIOPK";
        String str2 = "KHXOLPMK";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        // Count characters in the first string
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // Count characters in the second string and check for duplicates
        for (char c : str2.toCharArray()) {
            if (map1.containsKey(c) && !map2.containsKey(c)) {
                sb.append(c);
            }
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        String result = sb.toString();
        System.out.println(result); // Output: slha
    }
}
