
package Java;

import java.util.Scanner;


public class bmi {

    
    public static void main(String[] args) {
        
        Scanner masukan = new Scanner(System.in);
        
        int jk;
        float berat,tinggi,bmi, meter;
        
        System.out.println("PROGRAM PERHITUNGAN BMI");
        System.out.println("Masukan Jenis Kelamin (1.laki-laki) 1 (2.Perempuan : ");
        jk = masukan.nextInt();
        System.out.println("Masukan Berat Badan :");
        berat = masukan.nextFloat();
        System.out.println("Masukan Tinngi Badan :");
        tinggi = masukan.nextFloat();
        
        meter=tinggi/100;
        bmi=(berat/(meter*meter));
        
        System.out.println("===========================");
        System.out.println("BMI :"+bmi+" "); 

if (bmi<18.5){
    System.out.println("KURUS");
    
}
else if(bmi <=22.9){
    System.out.println("NORMAL");
    
}
else if(bmi<18.5){
    System.out.println("OVERWEIGHT");
    
}
else{
    System.out.println("OBESITAS");
    
}
    
          
    }
    
}
