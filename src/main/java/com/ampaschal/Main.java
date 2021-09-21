package com.ampaschal;

import com.ampaschal.commands.InstallCommand;
import com.ampaschal.commands.RunCommand;
import com.ampaschal.commands.TestCommand;
import java.util.List;
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

        String commandName = System.getenv().get("COMMAND");

        System.out.println("Command is " + commandName);

        Command command = Command.getCommand(commandName);

        System.out.println("command is " + command.name());

        switch (command) {

            case INSTALL:
                new InstallCommand().run();
                break;
            case URL_FILE:
                new RunCommand().run();
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
