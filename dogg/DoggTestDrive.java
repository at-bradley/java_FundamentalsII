//p.73

package dogg;

class DoggTestDrive {
    public static void main(String[] args) {
        
        Dogg one = new Dogg();
        one.size = 70;
        
        Dogg two = new Dogg();
        two.size = 8;
        
        Dogg three  = new Dogg();
        three.size = 35;
        
        one.bark();
        two.bark();
        three.bark();
    }
}
