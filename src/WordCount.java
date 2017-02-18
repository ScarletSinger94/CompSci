public class WordCount {
    public static int countWords(String original, int minLength){

        String[] s1 = original.split("\\s+");

        for(int i = 0; i < s1.length; i++){
            s1[i] = s1[i].replaceAll("^\\W]", "");
        }


        int count = 0;
        for(int i = 0; i < s1.length; i++){
            String str = s1[i];
            int len = 0;
            for(int x = 0; x < str.length(); x++){
                char c = str.charAt(x);

                if(Character.isLetter(c) == true){
                    len ++;
                }
            }
            if(len >= minLength){
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        System.out.println("enter string: ");
        String s = IO.readString();

        System.out.println("min length: ");
        int m = IO.readInt();

        System.out.println(countWords(s, m));


    }

}