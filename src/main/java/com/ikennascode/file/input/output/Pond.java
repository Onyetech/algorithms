package com.ikennascode.file.input.output;

import java.io.*;

public class Pond implements Serializable {

    private Duck duck = new Duck();


    public static void main(String[] args) {

        Pond myPond = new Pond();

        try {
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myPond);
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class Duck{

        private String color;
        private int height;

        public void setColor(String color) {
            this.color = color;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }


}
