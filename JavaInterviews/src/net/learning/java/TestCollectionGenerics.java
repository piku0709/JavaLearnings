package net.learning.java;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionGenerics {

    public static void main(String[] args) throws IOException {
        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(5);
        // list.add(7);
        // list.add(4);
        // System.out.println(list);

        // ListOrderEngine<Integer> engine = new ListOrderEngine<>();
        // engine.sort(list);
        // System.out.println(list);

        List<UserProfile> userProfileList = new ArrayList<>();
        userProfileList.add(new UserProfile(20));
        userProfileList.add(new UserProfile(10));
        userProfileList.add(new UserProfile(15));
        System.out.println("user profile list without sorting "+userProfileList);

        ListOrderEngine<UserProfile> userProfileEngine = new ListOrderEngine<>();
        userProfileEngine.sort(userProfileList);
         System.out.println("user profile list with sorting "+userProfileList);

         List<CompleteUserProfile> cmpltUserProfileList = new ArrayList<>();
        cmpltUserProfileList.add(new CompleteUserProfile(20));
        cmpltUserProfileList.add(new CompleteUserProfile(10));
        cmpltUserProfileList.add(new CompleteUserProfile(15));
        System.out.println("complete user profile list without sorting "+cmpltUserProfileList);

        userProfileEngine.sort(cmpltUserProfileList);
         System.out.println("complete user profile list with sorting "+cmpltUserProfileList);
    }   

}

class ListOrderEngine<T extends Comparable<? super T> & Closeable> {

    public void sort(List<? extends T> list) throws IOException {
        Collections.sort(list);
        list.get(0).close();
    }

    public void ramdomize(List<Integer> list) {
        Collections.shuffle(list);
    }

}

class UserProfile implements Comparable<UserProfile>, Closeable{
    public Integer age = 0;

    UserProfile(Integer age){
        super();
        this.age = age;
    }

    @Override
    public int compareTo(UserProfile o) {
        return this.age.compareTo(o.getAge());
        //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public String toString(){
        return String.valueOf(this.age);
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public void close() throws IOException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
}

class CompleteUserProfile extends UserProfile{

    CompleteUserProfile(Integer age) {
        super(age);
    }

}
