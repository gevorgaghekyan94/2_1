package com.company;

public class Window {

    private int quantity;
    private Quality quality;

    public Window() {
    }

    public Window(int quantity, Quality quality) {
        this.quantity = quantity;
        this.quality = quality;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Window window = (Window) o;

        if (quantity != window.quantity) return false;
        return quality == window.quality;
    }

    @Override
    public int hashCode() {
        int result = quantity;
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Window{" +
                "quantity=" + quantity +
                ", quality=" + quality +
                '}';
    }
}
