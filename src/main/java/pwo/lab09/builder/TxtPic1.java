package pwo.lab09.builder;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TxtPic1 {

    private char background, foreground;
    private int size;
    private String fileName;
    private String art;

    public TxtPic1(char background, char foreground,
            int size, String fileName) {
        this.background = background;
        this.foreground = foreground;
        this.size = size;
        this.fileName = fileName;
        art = "";
    }

    private void genArt() {
        for (int i = 0; i < size; i++) {
            int count = i + 1;
            int start = (size - count) / 2;

            for (int j = 0; j < size; j++) {
                if (j < start || count == 0) {
                    art += background;
                } else {
                    art += foreground;
                    count--;
                }
            }
            art += "\n";
        }
    }

    private void toFile() throws IOException {
        try (java.io.BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(art);
        }
    }

    public boolean save() {
        genArt();
        try {
            toFile();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}