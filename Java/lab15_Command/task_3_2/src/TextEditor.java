public class TextEditor {

    private Document document;

    final private Button saveButton;
    final private Button printButton;

    final private MenuItem saveMenuItem;
    final private MenuItem printMenuItem;
    final private MenuItem showInfoMenuItem;

    final private Shortcut saveShortcut;
    final private Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button();
        printButton = new Button();

        saveMenuItem = new MenuItem();
        printMenuItem = new MenuItem();
        showInfoMenuItem = new MenuItem();

        saveShortcut = new Shortcut();
        printShortcut = new Shortcut();
    }

    public void newDocument(String name) {
        document = new Document(name);

        Command commandSave = new CommandSave(document);
        Command commandPrint = new CommandPrint(document);
        Command commandShowInfo = new CommandShowInfo(document);

        saveButton.setCommand(commandSave);
        printButton.setCommand(commandPrint);

        saveMenuItem.setCommand(commandSave);
        printMenuItem.setCommand(commandPrint);
        showInfoMenuItem.setCommand(commandShowInfo);

        saveShortcut.setCommand(commandSave);
        printShortcut.setCommand(commandPrint);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }
}