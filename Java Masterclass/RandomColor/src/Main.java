class Color {
    String color;

    public Color(String color) {
        color = color.toLowerCase();
        this.color = color;
    }

    public String hotOrCold() {
        return "Unknown";
    }

    public String getColor() {
        return color;
    }
}

class Red extends Color {
    public Red() {
        super("red");
    }

    @Override
    public String hotOrCold() {
        return "Red is a hot color";
    }
}

class Blue extends Color {
    public Blue() {
        super("blue");
    }

    @Override
    public String hotOrCold() {
        return "Blue is a cold color.";
    }
}

class Yellow extends Color {
    public Yellow() {
        super("yellow");
    }

    @Override
    public String hotOrCold() {
        return "Yellow is a warm color.";
    }
}

class Green extends Color {
    public Green() {
        super("green");
    }

    @Override
    public String hotOrCold() {
        return "Green is a cool color.";
    }
}

class WeirdColor extends Color {
    public WeirdColor() {
        super("Unknown");
    }
}

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            Color color = randomColor();
            System.out.println("Color is " + i + " : " + color.getColor() + "\n" + color.hotOrCold());
        }
    }

    public static Color randomColor() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Red();
            case 2:
                return new Blue();
            case 3:
                return new Yellow();
            case 4:
                return new Green();
            case 5:
                return new WeirdColor();
            default:
                return null;
        }
    }
}
