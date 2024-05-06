public class CommandShowInfo implements Command {

    private Document document;

    public CommandShowInfo(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.showInfo();
    }

}
