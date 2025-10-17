import java.util.*;

class HashMapProg {

    public ArrayList<Integer>  Sum(int a , int b){
        ArrayList al = new ArrayList<>();
        al.add( a);
        al.add(b);
        return al;

    }
    public static void main(String args[]){


        HashMapProg hm = new HashMapProg();

        System.out.println(hm.Sum(5,6));


    }
}