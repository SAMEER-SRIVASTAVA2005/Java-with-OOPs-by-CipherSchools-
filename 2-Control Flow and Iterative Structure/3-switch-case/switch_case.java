// package 2-Control Flow and Iterative Structure.3-switch-case;

public class switch_case {
    public static void main(String[] args) {
        
        char grade='t';

        switch(grade){
            case 'A' : {
                System.out.println("Best");
                break;
            }
            case 'B' : {
                System.out.println("Better");
                break;
            }
            case 'C' : {
                System.out.println("Good");
                break;
            }
            default : {
                System.out.println("Invalid input");
                break;
            }
        }
    }
}
