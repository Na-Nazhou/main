package seedu.mark.logic.commands;

import seedu.mark.logic.commands.commandresult.CommandResult;
import seedu.mark.logic.commands.commandresult.HelpCommandResult;
import seedu.mark.model.Model;

/**
 * Format full help instructions for every command for display.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    public static final String SHOWING_HELP_MESSAGE = "Opened help window.";

    @Override
    public CommandResult execute(Model model) {
        return new HelpCommandResult(SHOWING_HELP_MESSAGE);
    }
}