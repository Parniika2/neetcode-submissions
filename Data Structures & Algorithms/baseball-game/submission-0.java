class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(stack.get(stack.size()-1)*2);
                
            }
            else if(op.equals("+")){
                   stack.push(stack.get(stack.size()-1)+stack.get(stack.size()-2));
            }
        
        else {
            stack.push(Integer.parseInt(op));
        }
        }
        int sum=0;
        for(int sc:stack){
            sum+=sc;
        }
        return sum;
        
    }
}