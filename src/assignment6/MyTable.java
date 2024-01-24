/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 16:25
 * Project Name : assignment6
 */
package assignment6;

public class MyTable {
    private Entry[] entries = new Entry[26];
    public String get(char c){
        int index = Character.compare(c,'a');
        return entries[index].toString().substring(3);
    }
    public void add(char c, String s){
        int index = Character.compare(c,'a');
        entries[index] = new Entry(c,s);
    }
    public String toString(){
        String str = "";
        for (Entry entry: entries){
            if(entry != null)
            str =  str+entry+"\n";
        }
        return str;
    }

    private class Entry{
        char ch;
        String str;
        Entry(char ch,String str){
            this.ch = Character.toLowerCase(ch);
            this.str=str;
        }

        @Override
        public String toString(){
            return ""+ch+"->"+str;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");
        String s = t.get('c');
        System.out.println(t);
    }
}
