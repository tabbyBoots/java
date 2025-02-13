package topic02;

public class GenderPriceTest {


    void CalcPrice(){
        int gender = 1;
        int age = 16;
        double pay = 100;
    
        if(gender == 1){
            if(age < 18){
                pay*=0.8;
            }
        }
        System.out.print( "Pay=\t"+pay  );
    }
    

}
