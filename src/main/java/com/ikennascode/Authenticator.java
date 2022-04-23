package com.ikennascode;

import javax.swing.*;
import java.util.Objects;

public class Authenticator {
    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password ");
        int numberOfCows = Integer.parseInt(JOptionPane.showInputDialog("How many cows?"));
        double fractionOfHolsteins = Double.parseDouble(JOptionPane.showInputDialog("Holsteins:"));

        assert username != null;
        assert password != null;
        if (username.equals("Ikenna") && Objects.equals(password, "1234") ||
                (username.equals("Onyetech") && Objects.equals(password, "567890")

                ) )
        {
                JOptionPane.showMessageDialog(null, "You are in.");

        } else {
            JOptionPane.showMessageDialog(null, "You are suspicious!");
        }
    }

}
