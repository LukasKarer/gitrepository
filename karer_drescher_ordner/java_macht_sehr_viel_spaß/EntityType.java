package game.Entity;

import javafx.scene.paint.Color;

public interface EntityType {
    @Override
    String toString();

    Color getColor();


    enum EMPTY implements EntityType {
        INSTANCE;

        @Override
        public String toString() {
            return "EMPTY";
        }

        @Override
        public Color getColor() {
            return Color.TRANSPARENT; // Default color for empty space
        }
    }

    enum SNAKE implements EntityType {
        HEAD, BODY, TAIL;

        public Color getColor() {
            return switch (this) {
                case HEAD -> Color.DARKGREEN;
                case BODY, TAIL -> Color.GREEN;
                default -> Color.TRANSPARENT; // Default color
            };
        }

        @Override
        public String toString() {
            return "SNAKE";
        }
    }
}
