import handler.*;

public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        Handler handlerJPG = new HandlerJPG();
        Handler handlerPNG = new HandlerPNG();
        Handler handlerDOCX = new HandlerDOCX();
        Handler handlerDOC = new HandlerDOC();
        Handler handlerXLS = new HandlerXLS();
        Handler handlerXLSX = new HandlerXLSX();
        Handler handlerPPTX = new HandlerPPTX();
        Handler handlerPDF = new HandlerPDF();

        handlerJPG.setNext(handlerPNG);
        handlerPNG.setNext(handlerDOCX);
        handlerDOCX.setNext(handlerDOC);
        handlerDOC.setNext(handlerXLS);
        handlerXLS.setNext(handlerXLSX);
        handlerXLSX.setNext(handlerPPTX);
        handlerPPTX.setNext(handlerPDF);

        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            handlerJPG.handle(new Request(file));
        }


    }
}
