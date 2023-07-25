package work1;
//Нарушен принцип инверсии зависимостей
//Четырехугольники
abstract class Tetragon {
    protected int height;
    protected int width;

    abstract void setHeight(int height);

    abstract void setWidth(int width);
}