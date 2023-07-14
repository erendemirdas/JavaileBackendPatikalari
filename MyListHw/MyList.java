public class MyList<T> {
    public T[] list ;
    public int capacity = 10;
    int lenght = 0;

    public  MyList(){
        this.list = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity){
        this.capacity = capacity;
        this.list = (T[]) new Object[this.capacity];
    }

    public void size(){
        System.out.println(this.lenght);
    }

    public void getCapacity(){
        System.out.println(this.capacity);
    }

    public void add(T data){
        if(this.capacity == this.lenght){
            this.capacity *= 2;
            T[] newList = (T[]) new Object[this.capacity];
            for (int i = 0 ; i < this.list.length ; i++){
                newList[i] = this.list[i];
            }
            newList[this.lenght] = data;
            this.lenght++;
            this.list = newList;

        }else{
            this.list[this.lenght] = data;
            this.lenght++;
        }
    }

    public void get(int index){
        System.out.println(this.list[index]);
    }

    public void remove(int indeks){
        if (indeks >= 0 && indeks <= this.lenght){
            for (int i = indeks ; i < this.lenght ; i++){
                this.list[i] = this.list[i+1];
            }
            this.lenght--;
        }else {
            System.out.println("null");
        }
    }

    public void set(int indeks , T data){
        if (indeks >= 0 && indeks <= this.lenght){
            this.list[indeks] = data;
        }else {
            System.out.println("null");
        }
    }

    public String toString () {
            System.out.print("[ ");
        for (int i = 0 ; i < this.list.length ; i++){
            if (this.list[i] != null) {
                if (this.list[i+1] == null){
                    System.out.print(this.list[i]);
                    break;
                }
                System.out.print(this.list[i] + ",");
            }else {break;}
        }
        System.out.println(" ]");
        return "";
    }

    public int indexOfData(T data){
        boolean isCheck = false;
        int index = 0;
        for (int i = 0 ; i < this.list.length ; i++){
            if (this.list[i] == data) {
                isCheck = true;
                index = i ;
                break;
            }
        }
        if (isCheck){
            return index;
        }else {
            return -1;
        }
    }

    public int lastIndexOfData(T data){
        int end = 0;
        boolean isCheck = false;
        for (int i = 0 ; i < this.list.length ; i++){
            if (this.list[i] == data){
                if(i >= end){
                    end = i;
                    isCheck = true;
                }
            }
        }
        if (isCheck){
            return end;
        }else {
            return -1;
        }

    }

    public boolean isEmpty(){
        boolean isCheck = false;
        for (int i = 0 ; i < this.list.length ; i++){
            if (this.list[i] == "" || this.list[i] == null){
                isCheck = true;
            }else {
                isCheck = false;
                break;
            }
        }
        if (isCheck){
            return true;
        }else {
            return false;
        }
    }

    public T[] toArray(){
        T[] supArray = this.list;
        return supArray;
    }

    public void clear(){
        for (int i = 0 ; i < this.list.length ; i++){
            if (this.list[i] != null){
                this.list[i] = null;
            }else {break;}
        }
        this.lenght = 0;
    }

    public MyList<T> subList(int start, int finish){
        int counter = (finish - start)+2 ;
        MyList<T> subpList = new MyList<>(counter);
        for (int i = start ; i <= finish ;i++ ){
            subpList.add(this.list[i]);
        }
        return subpList;
    }

    public boolean contains(T data){
        boolean isCheck = false;
        for (int i = 0 ; i < this.list.length ; i++){
            if (this.list[i] == data){
                isCheck = true;
                break;
            }
        }
        if (isCheck){
            return true;
        }else {
            return false;
        }
    }
}