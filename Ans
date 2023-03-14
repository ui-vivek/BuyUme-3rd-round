
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
        String str1="VIVEK";
        // Output: KHOPK
        String str2="SVIVEKSINGH";
        String longSiml=longAns(str1,str2);

        System.out.println(longSiml);;
    }
}
