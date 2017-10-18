//Practice

package practicecartypes;

class PracticeCarTypes {
    
    private int seat_num;
    
    public int getSeatNum() {
        return seat_num;
    }
    
    public void setSeatNum(int s_n) {
        seat_num = s_n;
    }
    
    void characterize () {
        if (seat_num == 4) {
            System.out.println("Sedan");
        } else if (seat_num < 4 && seat_num > 1) {
            System.out.println("Sport");
        } else {
            System.out.println("Vespa");
        }
    }
}
