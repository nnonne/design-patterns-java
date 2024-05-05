package handler;

public class HandlerPPTX extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getFileType().equals("pptx")) {
            System.out.println("Opened pptx file");
        }
        else {
            super.handle(request);
        }
    }
}