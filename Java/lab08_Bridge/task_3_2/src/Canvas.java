import button.*;
import size.*;

public class Canvas {

  public static void main(String[] args) {

    CheckboxButton checkboxButton = new CheckboxButton(new Small());
    checkboxButton.draw();

    RadioButton radioButton = new RadioButton(new Medium());
    radioButton.draw();

    DropdownButton dropdownButton = new DropdownButton(new Large());
    dropdownButton.draw();

    ImageButton imageButton = new ImageButton(new UserSize("ginormous"));
    imageButton.draw();


  }

}
