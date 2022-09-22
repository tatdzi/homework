package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class NickGeneratorFromFile implements IGenerator {
    private ThreadLocalRandom rnd = ThreadLocalRandom.current();

    public NickGeneratorFromFile() {
    }
    @Override
    public String generate() {
        String name = "";
        try {
            int count = this.rnd.nextInt(1,11);
            File data = new File("homework\\src\\home_work_5\\files\\nicks.txt");
            BufferedReader line = new BufferedReader(new FileReader(data));
            for (int i = 1; i <= count; i++) {
                if (i == count) {
                    name = line.readLine();
                } else {
                    line.readLine();
                }
            }
            return name;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException f) {
            return null;
        }
    }
}
