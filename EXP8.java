public class main{
    public static void main(String args[]){
        System.out.println("1 by using string equals()\n");
        String s1="java";
        String s2="java";
        System.out.println(s1.equals(s2));
        
        System.out.println("\n2 by using string equalsIgnoreCase()\n");
        String s3="hello";
        String s4="Hello";
        
        System.out.println(s3.equalsIgnoreCase(s4));
        
        System.out.println("\n3 By using compareTo()\n");
        
        String s5="bbb";
        String s6="ccc";
        
        System.out.println(s5.compareTo(s6));
        
        System.out.println("\n4 by using s ==\n");
        String s7="java";
        String s8=new String("java");
        System.out.println(s7==s8);
        
        
    }
}