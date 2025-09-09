package Anagram;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {

        String s1 = "Care",s2="Race";
        System.out.println("Using Sorting");
        System.out.println(areAnagramUsingSorting(s1, s2));
        System.out.println("Using 2 HashMaps");
        System.out.println(areAnagramUsingHashMaps(s1, s2));
        System.out.println("Using 1 HashMap");
        System.out.println(areAnagramUsingOneHashMap(s1, s2));
        System.out.println("Using 2 userDefined hashMaps");
        System.out.println(areAnagramUsingUserDefinedHashMaps(s1, s2));
        System.out.println("Using 1 userDefclsined hashMap");
        System.out.println(areAnagramUsingOneUserDefinedHashMap(s1, s2));
    }
    public static boolean equalLength(String s1 , String s2) {
        return s1.length() == s2.length();
    }


    public static boolean areAnagramUsingSorting(String s1 , String s2) {
        if(!equalLength(s1, s2)){
            return false;
        }
        else{

            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
    }

    public static boolean areAnagramUsingHashMaps(String s1 , String s2) {
        if(!equalLength(s1, s2)){
            return false;
        }
        else{
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(char c : s1.toLowerCase().toCharArray()){
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
            for(char c : s2.toLowerCase().toCharArray()){
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            return map1.equals(map2);
        }
    }

    public static boolean areAnagramUsingOneHashMap(String s1 , String s2) {
        if(!equalLength(s1, s2)){
            return false;
        }
        else{
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c : s1.toLowerCase().toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for(char c : s2.toLowerCase().toCharArray()){
                map.put(c, map.getOrDefault(c, 0) - 1);
            }
            for(int count : map.values()){
                if(count != 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean areAnagramUsingUserDefinedHashMaps(String s1 , String s2) {
        if(!equalLength(s1, s2)){
            return false;
        }
        else{
            int a[] = new int[26];
            int b[] = new int[26];
            for(char c : s1.toLowerCase().toCharArray()){
                a[c - 'a']++;
            }
            for(char c : s2.toLowerCase().toCharArray()){
                b[c - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean areAnagramUsingOneUserDefinedHashMap(String s1 , String s2) {
        if(!equalLength(s1, s2)){
            return false;
        }
        else{
            int a[] = new int[26];
            for(char c : s1.toLowerCase().toCharArray()){
                a[c - 'a']++;
            }
            for(char c : s2.toLowerCase().toCharArray()){
                a[c - 'a']--;
            }
            for(int count : a){
                if(count != 0){
                    return false;
                }
            }
            return true;
        }
    }


}
