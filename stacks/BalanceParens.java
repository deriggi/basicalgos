import java.util.*;
class BalanceParens{
    
    public static void main(String[] args){
        doBalance("{}[()]");
        doBalance("{}[()]");
        doBalance("{}[()][");

    }

	public static void doBalance(String line)
	{
        System.out.println(line);
		// Scanner sc = new Scanner(System.in);
		HashMap<String,Stack<String>> map = new HashMap<>();

        String pushes = "{[(";
        String pops = "}])";
        HashMap<String,String> openClosed = new HashMap<>();
        openClosed.put("}","{");
        openClosed.put("]","[");
        openClosed.put(")","(");

        Stack<String> parenStack = new Stack<>();
        map.put("-",parenStack);

        Boolean balanced = true;
        
        parenStack.clear();

        for(int i = 0; i < line.length();i++){
            char c = line.charAt(i);
            
            String paren = String.valueOf(c);
            Stack st = map.get("-");
            
            
            if(pushes.indexOf(paren) != -1){
                    
                st.push(paren);
            }
            
            else if(pops.indexOf(paren) != -1) {
                try{
                    // pop should equal the type of the last pushed
                    if(!openClosed.get(paren).equals(st.peek())){
                        balanced = false;
                        break;
                    }else{
                        st.pop();
                    }
                } catch (EmptyStackException ese){
                    // ese.printStackTrace();
                    
                    balanced = false;
                    break;
                }
            }
        }

        // if all stacks are empty then roll out
        if(!balanced){
            System.out.println("false");
        }else{
            for (String s : map.keySet()) {
                if (map.get(s).size() > 0) {
                    balanced = false;
                    break;
                }
            }
            System.out.println(balanced);

        }
        
    }
		
	
}
