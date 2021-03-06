package com.pialenko.figuresfx.Controller.Figures;

import javafx.scene.paint.Color;

 public abstract class Figure implements Drawable{
    public static final int FIGURE_TIPE_CIRCLE = 0;
    public static final int FIGURE_TIPE_PRIAMOYGOLNIK = 1;
    public static final int FIGURE_TIPE_TREYGOLNIK = 2;

    private int type;
    protected double cx;
    protected double cy;
    protected double lineWidth;
    protected Color color;

    public Figure(int type, double cx, double cy, double lineWidth, Color color) {
        this.type = type;
        this.cx = cx;
        this.cy = cy;
        this.lineWidth = lineWidth;
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getLineWidth() {
        return lineWidth;
    }

    public Color getColor() {
        return color;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public void setLineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
    }

    public void setColor(Color color) {
        this.color = color;
    }

//    public abstract void draw(GraphicsContext gc); после имплемета не нужен метод


}
