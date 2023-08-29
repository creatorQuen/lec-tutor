package lec18;

import java.util.Scanner;

public class Main {
    private static final CommandAndResult[] COMMAND_AND_RESULT = new CommandAndResult[] {
            new CommandAndResult("/help", ""),
            new CommandAndResult("/start", "command"),
            new CommandAndResult("/getLocation", "local is SPB"),
            new CommandAndResult("/end", "Bot ended")
    };

//    private static final String[] COMMAND = new String[] {
//            "/help", "/start", "/end", "/getLocation"
//    };
//
//    private static final String[] RESULT = new String[] {
//        "", "Bot started!...", "Bot ended", "location is SPB"
//    };

    public static void main(String[] args) {
//        String text = new String("value"); == String text = "value";

//        int[] array = new int[2];
//        array[0] = 5;
//        array[1] = 6;

//        COMMAND_AND_RESULT[0].command = "/help";
//        COMMAND_AND_RESULT[0].result = "";
//        COMMAND_AND_RESULT[1].command = "/start";
//        COMMAND_AND_RESULT[1].result = "Bot started!...";

        // new CommandAndResult(); ->  Ctrl + Alt + V
//        CommandAndResult commandAndResult = new CommandAndResult(command, result);
//        commandAndResult.command = "my command";
//        commandAndResult.result = "my result";

          Scanner scanner = new Scanner(System.in);
          String commands = "commands available for this bot \n";
          for (CommandAndResult item : COMMAND_AND_RESULT) {
              commands += item.command + "\n";
          }
          COMMAND_AND_RESULT[0] = new CommandAndResult(COMMAND_AND_RESULT[0].command, commands);

          String input;
          boolean found;
          while(true) {
              input = scanner.nextLine();
              found = false;

              for (int i = 0; i < COMMAND_AND_RESULT.length; i++) {
                  if (COMMAND_AND_RESULT[i].command.equals(input)) {
                      System.out.println(COMMAND_AND_RESULT[i].result);
                      found = true;
                      break;
                  }

              }
              if (COMMAND_AND_RESULT[COMMAND_AND_RESULT.length - 1].command.equals(input)) {
                  break;
              }
              if (!found) {
                  System.out.println("no command found for that input. Try typing " + COMMAND_AND_RESULT[0].command);
              }
          }
    }
}
