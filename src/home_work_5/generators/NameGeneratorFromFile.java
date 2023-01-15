package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class NameGeneratorFromFile implements IGenerator {
    private ThreadLocalRandom rnd = ThreadLocalRandom.current();

    public NameGeneratorFromFile() {
    }

    @Override
    public String generate() {
        String name = "";
        try (BufferedReader line = new BufferedReader(new FileReader
                ("homework\\src\\home_work_5\\files\\names.txt"))) {
            int count = this.rnd.nextInt(1, 11);
            for (int i = 1; i <= count; i++) {
                if (i == count) {
                    name = line.readLine();
                } else {
                    line.readLine();
                }
            }
            return name;
        } catch (FileNotFoundException d) {
            return "FileNotFoundException";
        } catch (IOException f) {
            return "IOException";
        }
    }
}
