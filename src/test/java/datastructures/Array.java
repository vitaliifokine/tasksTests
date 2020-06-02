package datastructures;

public class Array {
    private int [] items;
    private int count;

    public Array(int lenght){
        items = new int [lenght];

    }

    public Array(int... itemsAdded){
        items = itemsAdded;
        count=itemsAdded.length;

    }

    public void print(){
        for (int i=0; i<count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if (items.length==count){
            int [] newItems = new int[count*2];
            for (int i=0; i<count;i++){
                newItems[i] = items[i];
            }
            items=newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        // Shift items to the left
        // 10, 20, 30, 40

        for (int i=index; i<count; i++){
            items[i]=items[i+1];
        }
        count--;
    }

    public void indexOf(int value){
        for (int i=0; i<count;i++){
            if (items[i]==value){
                System.out.println("Index " + i);
            }
        }
    }




}
