public class Compress {
	
	public static String compress (String original){
      
      String Compressed = "";
 
      char ch=0;
      int count=1;
      for (int x = 0; x < original.length(); x++) { 
         if (ch == original.charAt(x)){
            count = count + 1;
         } else {
            Compressed = Compressed + ch;
            if(count != 1){
               Compressed = Compressed + count;
            }
            ch = original.charAt(x);
            count = 1;
         }
      }
      Compressed = Compressed + ch;
      if(count != 1){
         Compressed = Compressed + count;
      }
      System.out.println(Compressed); 
      return Compressed;
   }
}



