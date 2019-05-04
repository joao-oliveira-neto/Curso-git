package contador;

public class ContaddoComIfElse {

	public static void main(String[] args) {
		int a = 5;
        int b = 3;
        int c = 10;
        
        if(a < b && a < c){
            if(b < c){
                    System.out.println(a + " " + b + " " + c);
            }
            else if(c < b){
                    System.out.println(a + " " + c + " " + b);
            }
        }
        else if(b < a && b < c){
            if( a < c){
                    System.out.println(b + " " + a + " " + c);
            }
            else if(c < a){
                    System.out.println(b + " " + c + " " + a);
            }
        }
        else if(c < a && c < b){
            if(a < b){
                System.out.println(c + " " + a + " " + b);
            }
            else if(b < a){
                System.out.println(c + " " + b + " " + a);
            }
        }

    }





	}


