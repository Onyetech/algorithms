package com.ikennascode.file.input.output;

import java.io.*;

public class Box implements Serializable {

    private int width;
    private int height;
    transient String name;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {

            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
