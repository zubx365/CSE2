public class Test2{
    
    public static void main(String args[]){
        
        
        int row = 1;
        
        while(row <= 5){
            System.out.println(row);
            int stars = 1;
            System.out.println(stars);
            while(stars <= row){
                System.out.println(stars);
                stars++;
                System.out.print('*');
                
            }
            row++;
            System.out.println();
        
         } 
    }
}