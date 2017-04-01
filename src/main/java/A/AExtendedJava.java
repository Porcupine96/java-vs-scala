package A;

@SuppressWarnings("WeakerAccess")
class AExtendedJava {

    private int x;

    public AExtendedJava(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AExtendedJava that = (AExtendedJava) o;

        return x == that.x;
    }

    @Override
    public int hashCode() {
        return x;
    }

    @Override
    public String toString() {
        return "AExtendedJava{" +
                "x=" + x +
                '}';
    }

}
