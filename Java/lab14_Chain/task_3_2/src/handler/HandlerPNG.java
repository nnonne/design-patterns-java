package handler;

public class HandlerPNG extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getFileType().equals("png")) {
            System.out.println("Opened png file");
        }
        else {
            super.handle(request);
        }
    }
}