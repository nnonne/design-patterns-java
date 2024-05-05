package handler;

public class HandlerXLS extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getFileType().equals("xls")) {
            System.out.println("Opened xls file");
        }
        else {
            super.handle(request);
        }
    }
}