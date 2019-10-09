package seedu.mark.logic.commands;

import static seedu.mark.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.mark.logic.commands.ExitCommand.MESSAGE_EXIT_ACKNOWLEDGEMENT;

import org.junit.jupiter.api.Test;

import seedu.mark.logic.commands.CommandTestUtil.StorageStub;
import seedu.mark.model.Model;
import seedu.mark.model.ModelManager;

public class ExitCommandTest {
    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();

    @Test
    public void execute_exit_success() {
        CommandResult expectedCommandResult = new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false, true);
        assertCommandSuccess(new ExitCommand(), model, new StorageStub(),
                expectedCommandResult, expectedModel);
    }
}
