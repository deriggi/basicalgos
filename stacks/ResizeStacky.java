public class ResizeStacky{
    Integer[] stack;
    Integer N = 0;

    public ResizeStacky(Integer initialSize){
        stack  = new Integer[initialSize];
    }

    public void push(Integer a){
        if(N == stack.length){
            System.out.println("need to resize");
            resize(2.3f);
        }
        
        stack[N++] = a;
        
    }

    public void resize(Float amount){
        Double newSize = Math.ceil(amount*stack.length);
        Integer[] temp  = new Integer[newSize.intValue()];
        System.out.println("new size is " + temp.length);
        for(int i = 0; i < stack.length; i++){
            temp[i] = stack[i];
        }
        stack = temp;
    }

    @Override
    public String toString(){
        
        StringBuilder sb=  new StringBuilder();
        for(int i = 0; i < stack.length; i++){
            sb.append(stack[i]);
            sb.append(" ");
        }
        return sb.toString();

    }

    public static void main(String[] args){
        ResizeStacky rs = new ResizeStacky(2);
        rs.push(5);
        rs.push(6);
        rs.push(6);
        rs.push(6);
        rs.push(6);

        System.out.println(rs.toString());
    }
}