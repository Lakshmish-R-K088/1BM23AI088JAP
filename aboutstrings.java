public class aboutstrings {
        public static boolean compareStrings(String s1,String s2){
            return s1.equals(s2);
        }

        public static String copyString(String original){
            return new String(original);
        }

        public static String concatenateString(String s1, String s2){
            return s1 + s2;
        }

        public static void main(String[] args){
            System.out.println(compareStrings("pavan", "meet"));
            System.out.println(copyString("Passion"));
            System.out.println(concatenateString("hello ", "world"));
        }
    }



