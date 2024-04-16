package button;

import size.SizeButton;

public class RadioButton extends Button {

  public RadioButton(SizeButton sizeButton) {
    super(sizeButton);
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Drawing a radio button.\n");
  }

}
