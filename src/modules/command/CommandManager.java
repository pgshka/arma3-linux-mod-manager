package modules.command;

import modules.command.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandManager {

    private final List<Command> commands = new ArrayList<>();

    public void register(Command command) {
        commands.add(command);
    }

    public void executeCommand(String input) {
        if (input == null || input.isEmpty()) return;

        // Разделяем команду и аргументы
        String[] parts = input.split("\\s+");
        String cmdName = parts[0];
        String[] args = new String[parts.length - 1];
        System.arraycopy(parts, 1, args, 0, args.length);

        Command command = commands.stream().filter(c -> c.name().equals(cmdName)).findFirst().orElse(null);
        if (command != null) {
            command.execute(args);
        } else {
            System.out.println("Неизвестная команда: " + cmdName);
        }
    }

    public void listCommands() {
        for (int i = 0; i < commands.size(); i++) {
            System.out.println(" - [" +  i + "] " + commands.get(i).name());
        }
    }
}
