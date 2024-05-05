package handler;

public class HandlerPDF extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getFileType().equals("pdf")) {
            System.out.println("Opened pdf file");
        }
        else {
            super.handle(request);
        }
    }
}