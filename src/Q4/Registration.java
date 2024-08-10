package Q4;

class Registration {
    private static int regNoIndex = 1000;
    private final int regNo;
    private final Owner owner;
    private final Car car;

    public Registration(Car car, Owner owner) {
        this.regNo = ++regNoIndex;
        this.owner = owner;
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("Reg No: %d\n%s\n%s", regNo, this.owner, this.car);
    }
}
