package behavioral.command.commands;

import behavioral.command.editor.Editor;

import java.awt.event.ComponentAdapter;

public class CopyCommand extends Command {
   public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        this.editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
