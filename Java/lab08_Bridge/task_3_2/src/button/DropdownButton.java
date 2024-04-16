package button;

import size.SizeButton;

public class DropdownButton extends Button {
  public DropdownButton(SizeButton sizeButton) {
    super(sizeButton);
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Drawing a dropdown button.\n");
  }

}
