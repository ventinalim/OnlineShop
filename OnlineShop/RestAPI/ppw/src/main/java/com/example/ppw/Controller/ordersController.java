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
            System.out.println("Jawaban anda benar...");
        }
        else {
            System.out.println("Jawaban anda benar salah...");
        }
    }
}

