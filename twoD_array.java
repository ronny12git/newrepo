/* import java.util.* ;
public class twoD_array {

    // MAX AND MIN 
    public static void max_and_min(int matrix[][]){
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j] ;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j] ;
                }
            }
        }
        System.out.println("max = "+max+" and min = "+min);
    }

    // SEARCH ELEMENT 
    public static boolean search(int matrix[][] , int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at cell ("+i+","+j+")");
                    return true ;
                }
            }
        }
        System.out.println("key not found");
        return false ;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        int matrix[][] = new int[3][3] ;               // CREATION OF 2-D ARRAY

        for(int i=0;i<matrix.length;i++){              // TAKING INPUT IN ARRAY
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt() ;
            }
        }

        for(int i=0;i<matrix.length;i++){             // PRINT MATRIX
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 0) ;
        max_and_min(matrix);

        sc.close();

    }
} */

/* import java.util.* ;
public class twoD_array{

    public static void print_array(int numbers[][]){
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiral_array(int numbers[][]){
       int startrow = 0 ;
       int startcol = 0 ;
       int endrow = numbers.length-1 ;
       int endcol = numbers[0].length-1 ;

       while(startrow<=endrow && startcol<=endcol){

          for(int j=startcol;j<=endcol;j++){
              System.out.print(numbers[startrow][j]+" ");
          }
          for(int i=startrow+1;i<=endrow;i++){
            System.out.print(numbers[i][endcol]+" ");
          }
          for(int j=endcol-1;j>=startcol;j--){
            System.out.print(numbers[endrow][j]+" ");
          }
          for(int i=endrow-1;i>=startrow+1;i--){
            System.out.print(numbers[i][startcol]+" ");
          }

          startrow ++ ;
          startcol ++ ;
          endrow -- ;
          endcol -- ;

       }
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in) ;
        int numbers[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        
         print_array(numbers);
         spiral_array(numbers);
        sc.close();
    }
} */

/* public class twoD_array{

    public static int diagonalSum(int matrix[][]){
        int sum = 0 ;
        // T-C (On^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j || i+j+1==matrix.length){
        //             sum += matrix[i][j] ;
        //         }
        //     }
        // }


        for(int i=0;i<matrix.length;i++){
            // T-C (On)

            // primary diagonal
            sum += matrix[i][i] ;

            // secondary diagonal
            if(i != matrix.length-1-i)
            sum += matrix[i][matrix.length-1-i] ;

        }
        return sum ;
    }

    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,0},
            {4,5,6,10},
            {7,8,9,11},
            {12,13,14,5}
        } ;
        int matrix1[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        } ;
        System.out.println("Diagonal sum = "+diagonalSum(matrix1));
        
    }
    
 } */

 /* public class twoD_array{

    public static boolean staircaseSearch1(int matrix[][] , int key1){
        int row = 0 ;
        int col = matrix.length-1 ;

        while(row < matrix.length && col >=0){
            if(matrix[row][col] == key1){
                System.out.println("key found at ("+row+","+col+")");
                return true ;
            }
            else if(matrix[row][col] > key1){
                col  -- ;
            }
            else{
                row ++ ;
            }
        }
        System.out.println("key not found");
        return false ;
    }

    public static boolean staircaseSearch2(int matrix[][] , int key2){
        int row = matrix.length-1 ;
        int col = 0 ;
        
        while(row >=0 && col<matrix.length){
            if(matrix[row][col] == key2){
                System.out.println("key found at ("+row+","+col+")");
                return true ;
            }
            else if(key2 < matrix[row][col]){
                row -- ;
            }
            else{
                col ++ ;
            }
        }
        System.out.println("key not found ");
        return false ;
    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        } ;
        int key1 = 0 ;
        int key2 = 0 ; 
        staircaseSearch1(matrix, key1) ;
        staircaseSearch2(matrix, key2) ;
    }
 } */


