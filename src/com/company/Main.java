package com.company;

import java.util.*;

public class Main {
    static int maxString=0;

    public static void main(String[] args) {

    }

    private static void helper(Set<Character> set, List<String> arr, int index) {
            if (index == arr.size()) {
                return;
            }

            char[] s = arr.get(index).toCharArray();

            boolean unique = true;

            Set<Character> chars = new HashSet<>();
            for (char ch : s) {
                if (chars.contains(ch) || set.contains(ch)) {
                    unique = false;
                    break;
                }

                chars.add(ch);
            }

            helper(set, arr, index + 1);

            if (unique) {
                maxString = Math.max(maxString, set.size() + s.length);
                set.addAll(chars);
                helper(set, arr, index + 1);
                set.removeAll(chars);
            }
    }

    public static boolean isChar(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private static List<String> solution(String str) {
       List<String> ans = new ArrayList<>();
        getIps(0,ans,0,"",str);
        return ans;
    }

    private static void getIps(int i, List<String>ans, int size,String curr,String str) {
        if(size>=4){
            if(str.length()==i){
                ans.add(curr);
            }
            return;
        }
        for(int j=i;j<str.length();j++){
            if( i!=j && str.charAt(i) == '0'){
                continue;
            }
            int num = Integer.parseInt(str.substring(i, j+1));
            if(num > 255) break;
            if(curr == "") {
                getIps(j+1,ans, size+1, ""+ num, str);
            } else {
                getIps(j+1, ans, size+1,curr + "."+ num, str);
            }
        }
    }



}

