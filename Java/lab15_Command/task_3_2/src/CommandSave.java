public class CommandSave implements Command {

    private Document document;

    public CommandSave(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }

}
