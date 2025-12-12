class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for i in range(len(tokens)):
            # print(tokens[i])
            if tokens[i] != "+" and tokens[i] != "-" and tokens[i] != "*" and tokens[i] != "/":
                stack.append(tokens[i])
                print(stack)
            else :
                # print(stack)
                n1 = int(stack.pop())
                n2 = int(stack.pop())
                print(n1, n2)
                o = tokens[i]
                if o == "+":
                    r = n1+n2
                elif o == "-":
                    r = n1-n2
                elif o == "*":
                    r = n1*n2 
                else :
                    r = n1//n2                                                           
                stack.append(r)
        return stack.pop()        
