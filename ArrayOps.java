public class ArrayOps {
    public static void main(String[] args) {  
        
        System.out.print(isSorted(new int[] {1, 3, 2}));
    }
    
    public static int findMissingInt (int [] array) {
        int count = 0 ;  
        for( int i = 0 ; i < array.length ; i ++ ){
            if(count == array[i]){
                i = 0 ; 
                count ++ ; 

            }if(i == (array.length) -1 ){
                return count ; 
            }
                
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
    int maximum = 0 ; 
        for( int i = 0 ; i < array.length ; i ++){

           if ( array [i] > maximum){ maximum = array [i] ;}
        }

        int secondmax = maximum- 1 ; 
        while (secondmax > 0 ) {
            int j = 0 ;
            for( ;  j < array.length ; j++){

                if (secondmax == array[j]){
                 return secondmax ; 
                }
            }  
        secondmax--;
        }
        
    return -1 ; 
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2){
        
        boolean flag = check(array1, array2) && check(array2, array1);

        return flag;
    }

    public static boolean check(int[] array1, int[] array2)
    {
        int j = 0 ;  
        int i = 0 ;
        boolean flag = true ; 
        
        for( ; i < array1.length ; i ++ ){
            
            if(flag == false)
                return false;

            flag = false ;
            while( j< array2.length){
                if( array1[i] == array2[j]){
                    flag = true ;
                    break ;  
                }
                
                j++ ;
            } 
            
            j = 0 ; 
        }   

        return flag;
    }

    public static boolean isSorted(int [] array) {
        boolean flag = true ; 
        for ( int i = 0  ; i < array.length -1; i++ ){
            flag = array[i] <= array[i + 1] ; 

            if( !flag){
                for ( int j = 0  ; j < array.length -1; j++ ){
                    flag = array[j] >+ array[j + 1] ; 
                    if( !flag){
                        return false ; 
                    }
                }   
            }
        }

        return true;
    }

    }
