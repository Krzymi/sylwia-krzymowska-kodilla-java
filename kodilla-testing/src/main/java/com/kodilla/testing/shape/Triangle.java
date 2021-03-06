package com.kodilla.testing.shape;

class Triangle implements Shape {

    private String name;
    private double area;

    public Triangle(String name, double area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public void getName() {
        System.out.println();
    }

    @Override
    public void getArea() {
        System.out.println(33.23);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.area, area) != 0) return false;
        return name != null ? name.equals(triangle.name) : triangle.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}