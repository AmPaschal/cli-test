package com.ampaschal;

import java.io.File;

public enum Command {

    NONE,
    INSTALL,
    URL_FILE,
    TEST,
    ;

    static Command getCommand(String commandName) {

        if (commandName == null || commandName.length() == 0) {
            return NONE;
        }

        if (INSTALL.name().equalsIgnoreCase(commandName)) {
            return INSTALL;
        } else if (TEST.name().equalsIgnoreCase(commandName)) {
            return TEST;
        } else {
            File file = new File(commandName);

            if (!file.exists()) {
                System.out.println("File doesnt exist");
                return NONE;
            }

            System.out.println("Returning url file");

            return URL_FILE;
        }

    }
}
