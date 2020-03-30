 1. 
 public static String flip(){
     int r = (int) (Math.random() * 3);
     if(r < 2){
         return"heads";
     } else { 
         return tails; 
     }
 }

 2. 
 public static boolean arePermuations(int[] a, int[] b){
     for(int aValue : a){
         //To make sure that every element of a is somewhere in element b
     } for(int bValue : b){
         found = true;
     }
     if( !found){
         return false;
     }
     return true;
 }

3. The sequence 0, 1, 1. The first 0 switches 4 and 1, producing 4, 2, 3, 1; the first 1 switches 2 and 3, producing 4, 3, 2, 1; and the second 1 switches the 3 with itself.