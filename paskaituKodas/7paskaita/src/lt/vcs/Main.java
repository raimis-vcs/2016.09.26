package lt.vcs;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\failas.txt");
        VcsUtils.println(file.toString());

        PvzKlase pvz = new PvzKlase<File>(file);
        Object kazkas = pvz.getReiksme();
        if (kazkas instanceof File) {
            File tikraiFailas = (File)kazkas;
            tikraiFailas.exists();
        }

        List<Integer> listas = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            listas.add(i);
        }
        int kurTrys = listas.indexOf(3);
        Integer trys = listas.get(kurTrys);
        VcsUtils.println(trys.toString());

        Map<Integer, String> mapas = new HashMap<>();
        for (Integer i : listas) {
            mapas.put(i, ""+i+"ys");
        }
        VcsUtils.println(mapas.get(6));
        mapas.containsKey(6);
        for (Integer raktas : mapas.keySet()) {
            String reiksme = mapas.get(raktas);
        }



//            BufferedWriter bw = VcsUtils.newWriter(file.toString());
//            bw.append(VcsUtils.NEW_LINE + "Ketvirta");
//            bw.flush();
//            bw.close();

        try {
            BufferedReader br = VcsUtils.newReader(file.toString());
            String line;
            while ((line = br.readLine()) != null) {
                VcsUtils.println(line);
            }
            br.close();
        } catch (IOException ex) {
            VcsUtils.println(ex.getMessage());
            throw new RuntimeException("Nepasiseke, bandyk dar karta!", ex);
        } catch (Exception ex) {

        }
    }
}
