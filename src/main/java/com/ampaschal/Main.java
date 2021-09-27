package com.ampaschal;

import com.ampaschal.commands.InstallCommand;
import com.ampaschal.commands.RunCommand;
import com.ampaschal.commands.TestCommand;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import picocli.CommandLine;

@CommandLine.Command(name = "run")
public class Main implements Callable<Integer> {

    @CommandLine.Parameters
    List<String> commandNames;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {

        /*if (commandName == null || commandName.size() < 2) {
            System.out.println("Invalid commands " + commandName);
            return -1;
        }*/

        Map<String, String> envVars = System.getenv();

        System.out.println("LOG LEVEL = " + envVars.get("LOG_LEVEL"));
        System.out.println("LOG FILE = " + envVars.get("LOG_FILE"));
        System.out.println("GITHUB TOKEN = " + envVars.get("GITHUB_TOKEN"));

        String commandName = envVars.get("COMMAND");

        Command command = Command.getCommand(commandName);

        switch (command) {

            case INSTALL:
                new InstallCommand().run();
                break;
            case URL_FILE:
                new RunCommand().run(commandName);
                break;
            case TEST:
                new TestCommand().run();
                break;
            default:
                System.out.println("Invalid command with " + commandName);
                return -1;
        }

        return 0;
    }
}
