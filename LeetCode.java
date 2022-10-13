# LeetCodePractice


class Solution {
    public int romanToInt(String s) {
        Map<String,Int> lookup = new HashMap<String,Int> {"i":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000};
        
        Int sum = 0;
        if (lookup[i-1] < lookup[i] ) {
             numberback = lookup[i] - 2 * look[i-1]
             sum += numberback
        }else{
            sum += lookup[i]
        }
        return sum
    }

    



}

//20. Valid Parentheses
class Solution {

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length();i ++){
            char a = s.charAt(i);
            if (a=='(' || a=='{'||a=='['){
                stack.push(a);
            }
            else if (a== ')' &&  stack.pop() !='('   ){
                return false;
            }
            else if (a == ']' && stack.pop() != '[' ){
                return false;
            }
            else if (a== '}' && stack.pop()!= '{'){
                return false;
            }
        } 
        
        return stack.empty();
}




  Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {    
    public ListNode reverseList(ListNode head) {

        ListNode nextNode = null;
        ListNode previousNode = null;

        while (nextNode != null){
                prev

        }
    
    }
}

class Solution {    
    public ListNode reverseList(ListNode head) {

        ListNode nextNode = null;
        ListNode previousNode = null;
        ListNode currenctNode = null;

        while(currenctNode != null ){
            nextNode = currenctNode.next;
            currenctNode.next = previousNode;
            previousNode = currenctNode;
            currenctNode = nextNode;
        }

        return previousNode;

    }
}



//215. Kth Largest Element in an Array
class Solution {
    public int findKthLargest(int[] nums, int k) {
        for (int i = 1; i < numus.length();i++){
            if (nums[i] > nums[i -1 ]){
                int tmp = nums[i-1];
                nums[i-1] = nums[i]
                nums[i] = tmp
                i++
            }
        } 
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int pivot = null;
        int p = 0;

        for (let i = 0; i < nums.length; i ++){
            int[] list = null;
            while(list.length() < nums.length-k){
                pivot = nums[length-k];
                if  nums[i] < pivot{
                    list.add(nums[i]);
                }
            }
        }

    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n = k;

        while ( n < 1){
            for (int i = 0 ; i < nums.length();i++){
                for (int j = 0 ; j < i ; j ++){
                    
                    if ( nums[i] > nums[j]){
                        int tmp = nums[i]
                        nums[i] = nums[j]
                        nums[j] = nums[i]                       
                    }
                }

            }
        }
}

//257. Binary Tree Paths

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root.val == null){
            return paths;
        }

        dfs(root,"",paths);

        return paths;




    }

    
    public void dfs(TreeNode node,String path, List<String> paths){
        path += node.val;
        if (node.left == null && node.right == null){
            paths.add(path);
            return;
        }
        if(node.left != null){
            dfs(node.left,path + "->",paths);
        }
        if(node.right != null){
            dfs(node.left,path + "->",paths);
        }

    }

}

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();

        dfs(root,"",paths);

        return paths;

    }

    
    public void dfs(TreeNode node,String path, List<String> paths){

        if(node == null){
            return ;
        }
        path += node.val;

        if (node.left == null && node.right == null){
            paths.add(path);
            return;
        }
        
        if(node.left != null){
            dfs(node.left,path + "->" ,paths);
        }
        if(node.right != null){
            dfs(node.right,path + "->",paths);
        }

    }

}

//524. Longest Word in Dictionary through Deleting
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        
         for (int n = 0;n <dictionary.length(); n++){
            int j = 0;
            String word = dictionary[n];

            for(int i= 0;i < s.length(); i ++){

            }

         }


    }
}


class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        
        dictionary.sort()
        for (String str :dictionary){
            if (isSubsequence(s,str)){
                return str;
            }
        }
        return "";


        public void isSubsequence(String s, String d){
            int i = 0;
            int j = 0;
            if (d.length() > s.length){return false;}
            while(i < s.length() && j < d.length()){
                if (s.charAt[i] == d.charAt[j]){
                    i ++;
                    j ++;
                }else{
                    j ++ ;
                }
                return  i = s.length();
            }
        }


    }
}


public String findLongestWord(String s, List<String> dictionary) {
    String ans="";
    boolean flag=true;
    for(String st:dictionary){
        if(check(st,s)){
            if(ans.length()<st.length() || ans.length()==st.length() && ans.compareTo(st)>0){
                ans=st;
                
            }
        }
    }
    return ans;  
}
boolean check(String a,String b){
    int i=0;
    int j=0;
    while(i<a.length()&&j<b.length()){
        if(a.charAt(i)==b.charAt(j++)) i++;
    }
    return i==a.length();
}


class Solution {
    public boolean isPalindrome(String s) {
        String fixOne = "";
        for ( int word : s.toCharArray()){
            if ( Character.isLetter(word)){
                fixOne += word;
            }
        }
        fixOne = fixOne.toLowerCase();

        int i = 0;
        int j = s.length() -1;

        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
}

125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        String fixOne = "";
        for ( char word : s.toCharArray()){
            if ( Character.isLetter(word) || Character.isDigit(word)){
                fixOne += word;
            }
        }
        fixOne = fixOne.toLowerCase();
        System.out.println(fixOne);
        
        if(fixOne.length() == 1){
            return true;
        }

        int i = 0;
        int j = fixOne.length()-1 ;

        while (i <= j){
            if(fixOne.charAt(i) != fixOne.charAt(j)){
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }


}


//242
class Solution {
    public boolean isAnagram(String s, String t) {
        
        String[] ary1 = s.split("");
        String[] ary2 = s.split("");

        if (ary1.length != ary2.length){
            return false;
        }

        Arrays.sort(ary1);   
        Arrays.sort(ary2);   

        for(int i = 0 ; i <ary1.length; i ++){
            if(ary1[i]!= ary2[i]){
                return false;
            }
        }
        return true;


    }
}

    

