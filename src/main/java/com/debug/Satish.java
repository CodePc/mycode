package com.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author prem chand shah on 30-05-2018
 * @project myJava
 */
public class Satish {
    static class Treenode{
        public long weight;
        public String key;
        public String leftkey;
        public String rightkey;
        Treenode left;
        Treenode right;
        Treenode parent;

        public static Treenode from(String wt,Treenode node){
            Treenode treenode= new Treenode();
            try{
                treenode.parent=node;
                treenode.weight=Long.parseLong(wt);
            }catch(Exception e){}

            return treenode;
        }
    }


    public static void main(String[] args) throws IOException {
        String s = null;
        List<String> inputstr = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            while((s=br.readLine()).endsWith("\n")){
                if (s.charAt(0)== '#'){
                    continue;
                }
                //System.out.println(s);
                inputstr.add(s);
                System.out.println(inputstr);
            }
            System.out.println("out");
            System.out.println(inputstr);
        }

    }
}
