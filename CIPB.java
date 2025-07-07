public class CIPB extends CIPA{

    CIPB(){
        System.out.println("I am B constructor!");
    }
    CIPB(int x){
        super(10);
        System.out.println("I am B constructor with parameter: " + x);
    }
    void dispaly(){
        System.out.println("It is b!");
         super.dispaly();
    }
}
