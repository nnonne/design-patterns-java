public class CommandPrint implements Command {

    private Document document;

    public CommandPrint(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }

}
