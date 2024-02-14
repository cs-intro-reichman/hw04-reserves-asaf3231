public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("One two tHRee world"));
        }
       
    public static String capVowelsLowRest (String string){
        String res = "" ;  

        for(int i = 0 ; i < string.length(); i ++){

            if( string.charAt(i) == 'i'){
               res += 'I' ; 
               continue;
            }
            if( string.charAt(i) == 'e'){
                res += 'E' ; 
                continue;

            }
            if( string.charAt(i) == 'o'){
                res += 'O' ; 
                continue;

            }
            if( string.charAt(i) == 'a'){
                res += 'A' ; 
                continue;

            }
            if( string.charAt(i) == 'u'){
                res += 'U' ; 
                continue;

            }
           if (((string.charAt(i) != 'U') && (string.charAt(i) != 'A' )&& (string.charAt(i) != 'O') && (string.charAt(i) != 'E' )&&(string.charAt(i) != 'I') )&&((string.charAt(i) > 64) &&( string.charAt(i) < 91))){
                res += (char)(string.charAt(i) +32) ; 
            }

            else {res += string.charAt(i);}
        }

         return res;
    }
        
    

    public static String camelCase (String string) {
        String res = "" ;  
        String str = "" ;
        
        for(int j = 0 ; j < string.length()  ; j ++){
            if( (string.charAt(j) < 91) && ( string.charAt(j) > 64) ){

            res += (char)(string.charAt(j) +32) ; 
        }else{ res += string.charAt(j) ; }
        }

        str += res.charAt(0) ; 
        for(int i = 1 ; i < string.length() ; i ++){            
            
            if( res.charAt(i) == 32){
                while (res.charAt(i) == 32){
                i++ ; 
                str += (char)(res.charAt(i) -32) ;
                continue ; 
                }
            }
            else {str += res.charAt(i);}

        } 
        //    deletespaces (str) ; 

        return str ;
    }

    public static int[] allIndexOf (String string, char chr) {
        int i = 0  ; 

        for ( int j = 0 ; j < string.length() ; j++){
            if (string.charAt(j) == chr ){  
                i++ ; 
            }

        }
        

        int[] times = new int[i] ; 
        int s  = 0 ; 
        for ( int k = 0 ; k < string.length() ; k++){
            if (string.charAt(k) == chr ){  
               times[s] = k ; 
               s++ ;
            }


        }
        return times;
    }

    public static String deletespaces (String string) {
        String without = "" ; 
      for ( int i = 0 ; i < string.length() ; i ++ ){

        if(string.charAt(i) != ' '){
            without += string.charAt(i) ; 
            continue ; 
        }

         

        }
        return without ; 
    }

}
