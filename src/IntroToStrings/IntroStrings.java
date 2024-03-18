package IntroToStrings;

public class IntroStrings {
    public static void stringIntroduction () {
        String st = "hello";
        System.out.println(st);
        char cha = st.charAt(0);
        System.out.println(cha);
        for (int i = 0 ; i < st.length() ; i++) {
            char ch = st.charAt(i);
            System.out.println(ch);
        }

        // Find substring
        String ss = st.substring(1, 3); // [1, 3)
        System.out.println(ss);
    }
}
