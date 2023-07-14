public class Main {
    public static void main(String[] args) {

        MyList<Integer> list = new MyList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.size();
        list.getCapacity();

        System.out.println("Liste durumu = " + (list.isEmpty() ? "Boş" : "Dolu"));

        MyList<Integer> newListem = list.subList(0,3);

        newListem.toString();

        System.out.println("Listemde 2 değeri : " + list.contains(2));
        System.out.println("Listemde 10 değeri : " + list.contains(5));

    }
}