public class StringBuilder {

    String string = "";

    StringBuilder setString(String string) {
        this.string = string;
        return this;
    }
    StringBuilder addSymbols(String symbols) {
        this.string += symbols;
        return this;
    }
    StringBuilder insertSymbols(String symbols, int position) {
        if (position > this.string.length()) {
            System.out.printf("Index must be >= 0 and <= " + this.string.length());
            return this;
        }

        String rightHalf = "";
        String leftHalf = "";

        for (int i = 0; i < position; i++) {
            rightHalf += this.string.charAt(i);
        }

        for (int i = position; i < this.string.length(); i++) {
            leftHalf += this.string.charAt(i);
        }
        this.string = rightHalf + symbols + leftHalf;
        return this;
    }

    String build() {
        return string;
    }
}
