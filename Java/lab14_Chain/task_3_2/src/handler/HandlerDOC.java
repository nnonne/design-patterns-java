package handler;

public class HandlerDOC extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getFileType().equals("doc")) {
            System.out.println("Opened doc file");
        }
        else {
            super.handle(request);
        }
    }
}