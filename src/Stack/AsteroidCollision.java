class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0 ; i<asteroids.length ; i++){
            int current = asteroids[i];

            boolean isDestroyed = false;

            while (!stack.isEmpty() && current < 0 && stack.peek() > 0) {
                int top = stack.peek(); 

                if (top < -current) {
                    
                    stack.pop(); 
                    continue; 
                } else if (top == -current) {
                    stack.pop();
                    isDestroyed = true;
                    break;
                } else {
                    isDestroyed = true;
                    break; 
                }
            }

            if (!isDestroyed) {
                stack.push(current);
            }
        }

        int[] result = new int[stack.size()];
        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }

        return result;
    }
}



        
    
