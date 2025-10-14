class Queue{
    int queue[]=new int[5];
        
    int size,front,rear;

    public void enQueue(int data){

        if (!isFull()) {
        queue[rear]=data;
        rear=(rear+1)%5;  //using circular array
        size++;
        }
        else{
            System.out.println("Queue is full");
        }
    }

    public int deQueue(){
        int data = queue[front];
        if (!isEmpty()) {
            front=(front+1)%5; //using circular array
            size--;

        }
        else{
            System.out.println("Empty");
        }
        return data;
    }

    public void show(){

        System.out.print("Elements : ");

        for(int i=0;i<size;i++){
            System.out.print(queue[(front + i)%5] + " ");
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == 5;
    }
}

public class QusingArray {
    public static void main(String[] args) {
        // Queue<Integer> q1 = new Queue<>();  //cantdo this
            
        Queue q1 = new Queue();

        q1.enQueue(7);
        q1.enQueue(5);
        q1.enQueue(2);
        q1.enQueue(9);

        q1.deQueue();
        q1.deQueue();

        q1.show();
        System.out.println();

        System.out.println(q1.getSize());
        System.out.println(q1.isEmpty());
        System.out.println(q1.isFull());

    }
}
