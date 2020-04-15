@RestController
@RequestMapping("/shoppingcart")

// create a class contohkondisi here
public class ContohKondisi {

    public static void main(String[] args) {
        /* type of kondisi 
        is boolean*/
        boolean kondisi;
        
        kondisi= (1+1) == 2 && 2>1;
        // we have 2 condition here
        if (kondisi){
            System.out.println("Jawaban anda benar...");// kondisi ini akan menghasilkan jawaban yang benar
        }
        else {
            System.out.println("Jawaban anda benar salah...");
        }
    }
}

/* This is the beginning of a
multi-line comment
this is the end */
public class perulanagan {
   public static void main(String args[]){
       int x=0;
       while (x<10) {           
           System.out.println("Nilai x ="+x);
           x++;
       }
   }
}

