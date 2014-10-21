public class Test3{
    
    public static void main(String args[]){
        
        for(int i = 1; i <= 10; i++){
            
            for(int k = 1; k <= i; k++){
                System.out.print('*');
                k=k+1;
            }
            System.out.println();
        }
    }
}