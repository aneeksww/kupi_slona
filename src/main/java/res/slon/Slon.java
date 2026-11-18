package res.slon;

public class Slon {
    private static final String CMD_HELP = "\\help";
    private static final String CMD_EXIT = "\\exit";

    private static final String QUESTION = "Купи слона!";
    private static final String REPEAT_QUESTION = "А ты купи слона!";

    public String greeting() {
        return String.format( "Привет!\nЯ - продавец слона\nДля справки используй %s.\nДля выхода используй %s\n",
                CMD_HELP, CMD_EXIT);
    }

    public String help() {
        return String.format( "Все просто!\nНа любой твой вопрос (кроме %s и %s) я отвечу:\nКупи слона!\n", CMD_HELP, CMD_EXIT);
    }

    public boolean isExitCommand(String line) {
        return line.equals(CMD_EXIT);
    }

    public String respond(String line) {
        if (line.equals(CMD_HELP)) {
            return help();
        } return String.format("Все говорят \"%s\".\n%s\n", line, REPEAT_QUESTION);
    }
}