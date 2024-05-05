package handler;

public class Request {

    private String file;

    public Request(String file) {
        this.file = file;
    }

    public String getFileType() {
        int index = file.lastIndexOf(".");
        return file.substring(index + 1);
    }
}
