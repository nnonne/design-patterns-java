package button;

import size.SizeButton;

public abstract class Button {

    final private SizeButton sizeButton;

    public Button(SizeButton sizeButton) {
        this.sizeButton = sizeButton;
    }

    public void draw() {
        sizeButton.setSize();
    }

}
