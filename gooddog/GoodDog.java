//p.82

package gooddog;

class GoodDog {
    
    private int size; //Instance Variable
    
    public int getSize() { //Getter Method
        return size;
    }
    
    public void setSize(int s) { //Setter Method
        size = s; //No return value
    }
    
    void bark() {
        if(size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}