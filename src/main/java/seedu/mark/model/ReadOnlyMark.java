package seedu.mark.model;

import javafx.collections.ObservableList;
import seedu.mark.model.autotag.AutotagController;
import seedu.mark.model.bookmark.Bookmark;
import seedu.mark.model.folderstructure.FolderStructure;

/**
 * Unmodifiable view of a Mark.
 */
public interface ReadOnlyMark {

    /**
     * Returns an unmodifiable view of the bookmarks list.
     * This list will not contain any duplicate bookmarks.
     */
    ObservableList<Bookmark> getBookmarkList();

    FolderStructure getFolderStructure();

    AutotagController getAutotagController();
}
