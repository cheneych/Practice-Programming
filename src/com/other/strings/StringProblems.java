package com.other.strings;

import java.util.Arrays;
import java.util.*;


public class StringProblems {

	private static Boolean isPalandrome(String str) {
		// TODO Auto-generated method stub
		int i=0;
		int j=str.length()-1;
		
		for(i=0;i<j/2;i++) {
			if(str.charAt(i)!=str.charAt(j-i))
				return false;
		
		}
	return true;
	}
	
	private static void removeDuplicateChars(String str) {
		// TODO Auto-generated method stub
		int len=str.length();
		int[] arr=new int[26];
		String a=new String();
		Arrays.fill(arr, 0);
		for(int i=0;i<len;i++) {
			int temp = str.charAt(i)-97;
			if(arr[temp]==0) {
				arr[temp]=1;
				System.out.print(str.charAt(i));
				a=a+str.charAt(i);
				
			}
			
		}
		
		System.out.println(a);
		
	}
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
        
        Map<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<a.length();i++){
            char letter= a.charAt(i);
            
            if(!hm.containsKey(letter)){
                hm.put(letter,1);
            }else{
                int freq= hm.get(letter);
                hm.put(letter,++freq);
            }
        }
        
        for(int i=0;i<b.length();i++){
            char letter= b.charAt(i);
            
            if(!hm.containsKey(letter)){
                return false;
            }else{
                int freq= hm.get(letter);
                hm.put(letter,--freq);
            }
        }
        return true;
    
    
    
    }
	
	public static String getSmallestAndLargest(String str, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        SortedSet<String> sub=new TreeSet<String>();
        for(int i=0;i<=str.length()-k;i++){
            sub.add(str.substring(i,i+k));
        }
        
        
        smallest=sub.first();
        largest=sub.last();
        return smallest+"\n"+ largest;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("absssba");
		
		Boolean bool= isPalandrome(str);
		if(bool==true)
			System.out.println("Is a Palandrome");
		else
			System.out.println("Not Palandrome");
	
	
//			removeDuplicateChars(str);
		
//		boolean ret = isAnagram("cksmhxpplkrnhnpoxwmqswheplflbkqdwkpdhgustliaaxqavesoacssnxfojvthhimpqhhlsrnvrevmknclrvfeuksgilnpvaeohozbhpwyvtnfjpsamxfhkzpslcjieqwlgypnpnokhbpssiufhzorbdlohvwmnvztvoikcwulzldstxzbznucsgqzdolqlllgbvsduoqtavnvtoyudtwvzovcciuovhwxcpawdtsfohbjwzdzubxvrsxuatkwagvfxxbdqvifdlobnuchxzdprcluyxsafpfdmjidgskjeymtupcsqhjkmwgktymansdbdnejgovmpjfjyjdrrobdmhpfhbgwvlxabckhshthqatrjyicnjhbqwhzapvvcsydwimprfyjhtatskvhvdinzrmbihznaxqwhdnykohuhknbuikslvfnmsoxbpkdmccthptsfdmnnzqjjbbxyjkmdajeqviey", "kafbtzhynwlmmxypavpjfcmhntzjbgjngoobqvadtnsikqxllpwsrjbeednfjyupnisdgsiziajsqhfdycxpnzvrclyljscwcwbkrmmzmvrfezicbgrqhnjjyjwhdagfwjsnveokzgpehzgihaaopjzpsxyxzgcwqulnaazaioepqmzzobqdkrseptdozfmrcahccgemxkdnxconderpwlvneybgfqxjseoulsiidlxcplpusilougbagegnwezoknkvhsfmfequsgokqzamhbnphvfebeumthjabpnhvdbnlszcrzqbcdqkbvqcbkouravvrkcmpfcdxbhrbxuddkpeifgjqxgjxdeopiceoehngqgjoamrnevvjdgbconzrtpgcsnsywfenmnbocubgryruhvzviapbqxfkkxihdpwrexhgtjokjigqdfolifoycuknruwwjsporxwkinwrvckykalsfzsh");
//		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
		
//		String a=getSmallestAndLargest("welcometojava",3);
//		System.out.println(a);
		
//		String reg=printReverseString(str);
//		System.out.println(reg);
	}

	private static String printReverseString(String str){
		// TODO Auto-generated method stub
		
		if(str.length()<2)
			return str;
		
		return printReverseString(str.substring(1))+str.substring(0);
		
		
		

	}
		
	}


	

	


