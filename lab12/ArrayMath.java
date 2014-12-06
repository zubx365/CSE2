//DONE
//
//*******************
public class ArrayMath {
    public static void main(String[] arg) {
        double 
            x[] = { 2.3, 3, 4, -2.1, 82, 23},

            y[] = { 2.3, 3, 4, -2.1, 82, 23},

            z[] = { 2.3, 13, 14},

            w[] = { 2.3, 13, 14, 12},

            v[],

            u[] = { 2.3, 12, 14};

        v = addArrays(x, y);

        System.out.println(display(x) + " \n  + " + display(y) + "\n   = " + display(v));

        System.out.println(display(x) + " \n  + " + display(z) + "\n   = " + display(addArrays(x, z)));

        System.out.println("It is " + equals(x, y) + " that " + display(x) + " == " + display(y));

        System.out.println("It is " + equals(z, w) + " that " + display(z) + " == " + display(w));

        System.out.println("It is " + equals(u, z) + " that " + display(u) + " == " + display(z));

    }//end main

    public static String display(double[] x) {
        
        String out = "{";
        
        for (int j = 0; j < x.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            
            out += x[j];
        }
        return out + "}";
    }//end display method
    
    public static boolean equals(double[] a, double[] b){
        
        boolean length = false;
        boolean content = false;
        boolean match = false;
        
        if(a.length == b.length){
            length = true;
        }
        
        if(length == true){
        for(int i = 0; i < a.length; i++){
            
            content = (a[i]==b[i]);
            if(content == false){
                match = false;
                return match;
            }
            }//for
            
        }//if
        
        if(content && length){
            match = true;
        }
        return match;
        
    }//end equals method
    
    public static double[] addArrays(double[] a, double[] b){
        
        double[] result = new double[a.length];
        
        if(a.length != b.length){
            
            if(a.length > b.length){
                int y = a.length -b.length;
                
                double x[] = {b[0], b[1], b[2], 0.0, 0.0, 0.0};
                for(int i = 0; i <a.length; i++){
                    
                    result[i] = a[i] + x[i];
                }
            }
        }
        else{
            for(int k = 0; k < a.length; k++){
                result[k] = a[k] + b[k];
            }
        }
        return result;
    }//end addArrays method
    
}//end class