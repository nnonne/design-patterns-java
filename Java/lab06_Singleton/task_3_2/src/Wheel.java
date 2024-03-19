
public class Wheel {
    public enum Material {  // Матеріал диску
        Steel,  //  Стальний диск
        Alloy,  //  Легкосплавний
        Forged  //  Кований легкосплавний диск
    }

    final private Material material;   // Матеріал диску
    final int diameter;                //  Діаметр колеса

    public Wheel(Material material,
                 int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }

    public static class WheelBuilder {

        private Material material;
        private int diameter;

        WheelBuilder setMaterial(Material material) {
            this.material = material;
            return this;
        }
        WheelBuilder setDiameter(int diameter) {
            this.diameter = diameter;
            return this;
        }

        Wheel build() {
            return new Wheel(material, diameter);
        }
    }
}
