package handler;

public class HandlerXLSX extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getFileType().equals("xlsx")) {
            System.out.println("Opened xlsx file");
        }
        else {
            super.handle(request);
        }
    }
}