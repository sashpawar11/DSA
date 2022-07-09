// Problem 125. Valid Palindrome Leetcode

class ValidPalindrome {
        public boolean isPalindrome(String s) {
         
            String s1 = s;
            s1.toLowerCase();
            if(s1.equals(" ")) 
            {
                return true;
            }
            else
            {
                s1.replaceAll("[^A-Za-z0-9]","");
                StringBuilder s2 = new StringBuilder(s1);
                s2.reverse();
                if(s.equals(s2))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            
            }
        }


        public static void main(String[] args) {
            ValidPalindrome vp = new ValidPalindrome();
            if(vp.isPalindrome("Malayalam23"))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
 }

