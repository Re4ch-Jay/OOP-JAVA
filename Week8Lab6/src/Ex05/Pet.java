package Ex05;

public interface Pet {

    default String getName() {
        return "";
    }

    default void setName() {

    }

    default void play() {

    }
}
