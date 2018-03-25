package stackjava;

public class Stack 
{
    private int vet[];
    private int top;
    
    public Stack(int size)
    {
        vet = new int[size];
        top =  -1;
    }
    
    public boolean isEmpty()
    {
        return(top == -1);
    }
    
    public boolean isFull()
    {
        return (top == vet.length - 1);
    }
    
    public void push(int value)
    {
        top++;
        vet[top] = value;
    }
    
    public int pop()
    {
        int peek = vet[top];
        top--;
        return peek;
    }
    
    public int peek()
    {
        if(isEmpty()) return -1;
        return vet[top];
    }
    
    public int size()
    {
        return top + 1;
    }
            
}
