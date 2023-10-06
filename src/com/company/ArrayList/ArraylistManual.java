package com.company.ArrayList;

public class ArraylistManual {
    int size;
    int capacity=10;
    Object[] array;

    public ArraylistManual(){
        this.array = new Object[capacity];
    }

    public ArraylistManual(int capacity){
        this.capacity= capacity;
        this.array = new Object[capacity];
    }

    //add value
    public void add(Object data){
        if(size>= capacity){
            grow();
        }
        array[size]= data;
        size++;
    }

    // Insert value to index
    public void insert(int index,Object data){
        if (size>=capacity){
            grow();
        }
        for (int i= size;i>index;i--){
            array[i]= array[i-1];
        }
        array[index]= data;
        size++;

    }

    //delete value
    public void delete(Object data){
        for (int i=0; i<size; i++){
            if (array[i]== data){
                for (int j=0; j<(size-i-1);j++){
                    array[i+j]= array[i+j+1];
                }
                array[size-1]= null;
                size--;
                if (size<=(int)(capacity/3)){
                    srink();
                }
                break;
            }
        }

    }

    //search value
    public int search(Object data){
        for (int i =0; i<size;i++){
            if (array[i]== data){
                return i;
            }

        }
        return -1 ;
    }

    //grow capacity of thhe array
    private void grow(){
        int newCapacity = (int)(capacity*2);
        Object[] newArray = new Object[newCapacity];

        for (int i =0; i<size;i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    //cut capacity
    private void srink(){

        int newCapacity = (int)(capacity/2);
        Object[] newArray = new Object[newCapacity];

        for (int i =0; i<size;i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String string ="";
        for (int i =0; i<capacity;i++){
            string +=array[i] + ", ";
        }
        return string;
    }
}
