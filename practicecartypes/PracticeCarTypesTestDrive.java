//Practice

package practicecartypes;

class PracticeCarTypesTestDrive {
    public static void main(String[] args) {
        
        PracticeCarTypes one = new PracticeCarTypes();
        one.setSeatNum(4);
        
        PracticeCarTypes two = new PracticeCarTypes();
        two.setSeatNum(2);
        
        PracticeCarTypes three = new PracticeCarTypes();
        three.setSeatNum(1);
        
        System.out.println("PCT one: " + one.getSeatNum());
        System.out.println("PCT two: " + two.getSeatNum());
        System.out.println("PCT three: " + three.getSeatNum());
        
        one.characterize();
        two.characterize();
        three.characterize();
    }
}
