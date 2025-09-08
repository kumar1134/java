public class sb {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        for(int i=0;i<27;i++)
        {
           char ch = (char)('a'+i);
        
       // System.out.print(ch);
        build.append(ch);
       // System.out.println(build);
        }
        System.out.println(build);
    }
}
