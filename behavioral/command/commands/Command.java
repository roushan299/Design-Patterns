package behavioral.command.commands;

import behavioral.command.editor.Editor;

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor){
        this.editor = editor;
    }

    void backup(){
        backup = editor.textField.getText();
    }

    public Command setEditor(Editor editor) {
        this.editor = editor;
        return this;
    }

    public void undo(){
        this.editor.textField.setText(backup);
    }

    public abstract boolean execute();

}
