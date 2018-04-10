
package araç.yönetim.sistemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Seri_no_ver {
    
    int i;
    
    public String Seri_no_ver(String arac_turu) throws FileNotFoundException, IOException{
        
        File file = new File(arac_turu + "id_sayac.txt");
        if (!file.exists()) {
            file.createNewFile();
            PrintWriter pw = new PrintWriter(new FileWriter(arac_turu + "id_sayac.txt"));
            pw.print("0");
            pw.close();
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line=br.readLine();        
        
        i=Integer.parseInt(line)+1;
        file.delete();
        PrintWriter pw = new PrintWriter(new FileWriter(arac_turu + "id_sayac.txt"));
        pw.print(Integer.toString(Integer.parseInt(line)+1));
        pw.close();
        
            
    return Integer.toString(i);    
        

    }
}
