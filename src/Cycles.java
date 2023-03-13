public class Cycles {
    public static void main(String[] args) {
        int i,j,h;
        for (i=1,j=100,h=4; (i<j  && i<50); i*=2, j++, h+=2) {
            System.out.println ("i="+i+" j="+ j + " h="+h);
        }
    }
}
