package org.return_result.sudoku.game.command;

import org.return_result.sudoku.game.CellCollection;

public class FillInNotesCommand extends AbstractMultiNoteCommand {

    public FillInNotesCommand() {
    }

    @Override
    void execute() {
        CellCollection cells = getCells();

        mOldNotes.clear();
        saveOldNotes();

        cells.fillInNotes();
    }
}
