package topic02;

import java.util.Scanner;

public class GradeTest {
    void calcGrade(int grade){
        if( grade >=0 && grade <=100 ){
            
            //60,,70,,,80...100
            if(grade >=80) {
                System.out.println("很棒棒棒");
            }else if(grade >=70) {
                System.out.println("很棒70");
            }else if(grade >=60) {
                System.out.println("很棒60");
            }else {
                System.out.println("很棒棒棒...剩下的");
            }
        }else{
            System.out.println("Error");
        }
    }
}
