package button;

import size.SizeButton;

public class CheckboxButton extends Button {

  public CheckboxButton(SizeButton sizeButton) {
    super(sizeButton);
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Drawing a checkbox button.\n");
  }

}
