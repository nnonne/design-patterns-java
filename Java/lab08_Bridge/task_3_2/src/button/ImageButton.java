package button;

import size.SizeButton;

public class ImageButton extends Button {

    public ImageButton(SizeButton sizeButton) {
        super(sizeButton);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing an image button.\n");
    }

}
