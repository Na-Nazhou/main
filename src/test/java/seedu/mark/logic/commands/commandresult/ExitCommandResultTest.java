package seedu.mark.logic.commands.commandresult;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExitCommandResultTest {

    @Test
    public void isExit() {
        ExitCommandResult commandResult = new ExitCommandResult("feedback");

        assertTrue(commandResult.isExit());
        assertFalse(commandResult.isShowHelp());
        assertFalse(commandResult.isOpen());
        assertNull(commandResult.getUrl());
    }
}
