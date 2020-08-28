public class GlobalAdderResults {

    private GlobalAdder globalAdder;

    public GlobalAdderResults() {
        this.globalAdder = new GlobalAdder();
    }

    @Test(priority = 1)
    public void testZeroInputs() {
        System.out.println(globalAdder.addMany());
    }

    @Test(priority = 2)
    public void testThreeInputs() {
        System.out.println(globalAdder.addMany(5, 6, 3));
    }

    @Test(priority = 3)
    public void testTenInputs() {
        System.out.println(globalAdder.addMany(5, 6, 3, 4, 5, 7, 8, 2, 3, 4));
    }
}
