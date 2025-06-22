public class if_else{
    public static void main(String[] args) {
        
        // int age=19;

        // if(age<20){
        //     System.out.println("xyz");
        // }else{
        //     System.out.println("zyx");
        // }

        // ---------------------------------------------
        
        // int x=5;
        
        // if(x<20 && x>0){
            //     System.out.println("xyz");
            // }
            // else if(x>20 && x < 40){
        //     System.out.println("xyzxyz");
        // }
        // else{
            //     System.out.println("zyx");
            // }
            

        // ---------------------------------------------

        int x=10,y=11,z=12;

        if(x>y){
            if(x>z){
                System.out.println(x);
            }else System.out.println(z);
        }
        else{
            if(y>z){System.out.println(y);}
            else System.out.println(z);
        }
    }
}