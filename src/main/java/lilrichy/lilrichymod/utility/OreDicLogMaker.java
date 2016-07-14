package lilrichy.lilrichymod.utility;

import jline.internal.Log;
import net.minecraftforge.oredict.OreDictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by LiLRichy on 7/14/2016.
 */
public class OreDicLogMaker {
    private String path = "";
    private boolean appendToFile = true;

    public OreDicLogMaker(String path, boolean appendToFile) {
        this.path = path;
        this.appendToFile = appendToFile;
    }

    public static void CreateOreDicLog() {
        File logDirectory = new File("Ore Dictionary Names");
        if (!logDirectory.exists()) {
            try {
                logDirectory.mkdir();
            } catch (Exception var13) {
                Log.error(var13.getCause());
            }
        }

        Path path = Paths.get(logDirectory + "/" + "Ore Dictionary.txt");
        if (Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (Exception var12) {
                Log.error(var12.getCause());
            }
        }

        OreDicLogMaker data = new OreDicLogMaker(logDirectory + "/" + "Ore Dictionary.txt", true);
        data.OreDicLogMaker("**********************************************************************************************************************");
        data.OreDicLogMaker("**********************************************  Ore Dictionary Ore Names  ********************************************");
        data.OreDicLogMaker("**********************************************************************************************************************");
        String[] arr$ = OreDictionary.getOreNames();

        for (String oreName : arr$) {
            try {
                String e = OreDictionary.getOres(oreName).get(0).getUnlocalizedName();
                String d = OreDictionary.getOres(oreName).get(0).getDisplayName();
                String sub = e.substring(0, 4);
                if (sub.equalsIgnoreCase("tile")) {
                    data.OreDicLogMaker("Block Name : " + d);
                } else {
                    data.OreDicLogMaker("Item Name : " + d);
                }

                data.OreDicLogMaker("Ore Dictionary Name : " + oreName);
                data.OreDicLogMaker("***************************************************");
            } catch (Exception ignored) {
            }
        }
    }

    public void OreDicLogMaker(String textLine) {
        try {
            FileWriter e = new FileWriter(this.path, this.appendToFile);
            PrintWriter printLine = new PrintWriter(e);
            printLine.printf("%s%n", textLine);
            printLine.close();
        } catch (Exception var4) {
            Log.error(var4.getCause());
        }
    }
}