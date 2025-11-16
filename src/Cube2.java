public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        basicCube = new Cube(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side){
        basicCube.setSide(side);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume(){
        return basicCube.getSide()*basicCube.getSide()*basicCube.getSide();
    }

    public int calculateSurfaceArea(){
        return basicCube.getSide()*basicCube.getSide()*6;
    }

    public Cube2 add(Cube2 otherCube){
        int a = this.getSide();
        int b = otherCube.getSide();

        int cSquared = a*a + b*b;
        int c = (int)Math.sqrt(cSquared);

        if(c*c != cSquared) {
            throw new IllegalArgumentException("Side lengths do not form a Pythagorean triple.");
        }

        return new Cube2(c, this.color);
    }

    public Cube2 minus(Cube2 otherCube){
        int a = this.getSide();
        int b = otherCube.getSide();

        int saDiff = Math.abs(6*a*a - 6*b*b);
        if(saDiff%6 != 0){
            throw new IllegalArgumentException("Surface areas do not form a valid cube.");
        }

        int cSquared = saDiff/6;
        int c = (int)Math.sqrt(cSquared);

        if(c * c != cSquared){
            throw new IllegalArgumentException("Resulting cube side is not an integer.");
        }

        if(!(a*a == b*b + cSquared || b*b == a*a + cSquared)){
            throw new IllegalArgumentException("Side lengths do not form a Pythagorean triple.");
        }

        return new Cube2(c, this.color);
    }

    public boolean equals(Cube2 otherCube){
        return basicCube.getSide()==otherCube.getSide() && color.equals(otherCube.getColor());
    }

    public String toString() {
        return "Cube{side="+String.valueOf(basicCube.getSide())+", color=\""+color+"\"}";
    }
}
