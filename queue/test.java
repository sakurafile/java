package queue;
class queue{
    int qget;
    int qput;
    char qarry[];
    queue(int size){
        qarry = new char[size];
        qget = 0;
        qget = 0;
    }
    char get(){
        if(qget == qput){
            System.out.println("The queue is empty.");
            return (char)0;
        }
        else{
            return qarry[qget++];
        }
    }
    void put(char ch){
        if(qput == qarry.length){
            System.out.println("Fuck! The queue is full.");
        }
        qarry[qput++] = ch;
    }
    
}

public class test {
    public static void main(){
        queue demo = new queue(100);
        char tt,qq;
        demo.put('a');
        demo.put('b');
        tt = demo.get();
        qq = demo.get();
        System.out.println(tt);
        System.out.println(qq);
    }
    
}
