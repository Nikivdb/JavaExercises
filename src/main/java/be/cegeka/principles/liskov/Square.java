package be.cegeka.principles.liskov;

import java.awt.image.SampleModel;

public class Square extends Rectangle {

    public Square(int size) {
        super(size, size);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
