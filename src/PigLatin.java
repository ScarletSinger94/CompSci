public class PigLatin {
	
   public static String translate(String original){
       char firstChar;
           String pig;
           String word ="";
          original= word;
           word = word.toLowerCase();

           firstChar = word.charAt(0);
           if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' ||
                   firstChar == 'u'){
               pig = word + "way";
           }
           else{
               pig = word.substring(1) + word.charAt(0) + "ay";
           }
           System.out.println(pig);
           return pig;
          
   
	
}
   }

   
   

