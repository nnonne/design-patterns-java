package handler;

public class HandlerJPG extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getFileType().equals("jpg")) {
            System.out.println("Opened jpg file");
        }
        else {
            super.handle(request);
        }
    }
}