package org.return_result.sudoku.gui.importing;

import org.return_result.sudoku.db.SudokuInvalidFormatException;

/**
 * Handles import of puzzles via intent's extras.
 *
 * @author romario
 */
public class ExtrasImportTask extends AbstractImportTask {

    private String mFolderName;
    private String mGames;
    private boolean mAppendToFolder;

    public ExtrasImportTask(String folderName, String games, boolean appendToFolder) {
        mFolderName = folderName;
        mGames = games;
        mAppendToFolder = appendToFolder;
    }

    @Override
    protected void processImport() throws SudokuInvalidFormatException {
        if (mAppendToFolder) {
            appendToFolder(mFolderName);
        } else {
            importFolder(mFolderName);
        }

        for (String game : mGames.split("\n")) {
            importGame(game);
        }
    }

}
