package org.epam.mavendemo.main;

import org.epam.mavendemo.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println(utils.isAllPositiveNumbers("12", "79"));
    }
}
