import java.util.PriorityQueue;

class Priorityqueue {
    public static void main(String[] args) {
PriorityQueue<Integer> pr=new PriorityQueue<>(2);
pr.add(10);
pr.add(20);
pr.add(15);
pr.remove();
System.out.println(pr);
    }
}
