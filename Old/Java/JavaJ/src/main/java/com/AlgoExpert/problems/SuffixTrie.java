package com.AlgoExpert.problems;

import java.util.HashMap;
import java.util.Map;

class ImplSuffixTrie {
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {

            for(int i =0; i < str.length(); i ++){
                TrieNode node = root;
                for(int j =i; j <str.length(); j++){
                    char letter = str.charAt(j);
                    if(!node.children.containsKey(letter)){
                        TrieNode newNode = new TrieNode();
                        node.children.put(letter, newNode);
                    }

                    node = node.children.get(str.charAt(j));

                }
                node.children.put(endSymbol,null);// since we just completed one chunk of the trie
            }

        }

        public boolean contains(String str) {
            TrieNode node = root;
            for(int i =0; i < str.length(); i++){
                Character letter = str.charAt(i);
                if(!node.children.containsKey(letter)){
                    return false;
                }
                node = node.children.get(letter);


            }
            return node.children.containsKey(endSymbol) ? true : false;
        }
    }
}
