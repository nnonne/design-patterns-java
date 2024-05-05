package handler;

public class HandlerDOCX extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getFileType().equals("docx")) {
            System.out.println("Opened docx file");
        }
        else {
            super.handle(request);
        }
    }
}