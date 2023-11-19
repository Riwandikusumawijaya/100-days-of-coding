package bufferedreader_2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferedReader_2 {
    public static void main(String[] args) {
         BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));  
     String Nama = "";
     String Alamat = "";
     String Pendidikan = "";
      try {
         System.err.print("Nama Anda Adalah : ");  
          Nama = dataIn.readLine();
          System.out.print("Alamat Anda Adalah : ");
         Alamat = dataIn.readLine();
          System.out.print("Pendidikan Anda Adalah : ");
        Pendidikan = dataIn.readLine();
     }catch (Exception e){    
     }        
        System.out.println("Halo..." + Nama + "Anda berasal dari " + Alamat + "dan berkuliah di" + Pendidikan);    
    }
    
}
 
