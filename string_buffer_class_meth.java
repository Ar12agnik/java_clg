public class string_buffer_class_meth {
    public static void main(String arg[]){
        StringBuffer sb= new StringBuffer("Hello ");/*declare a string buffer class */
        sb.append("Java");
        System.out.println(sb);
        sb.insert(1,"Hi");
        System.out.println(sb);
        sb.replace(1,3,"bye");//replaces the items fron 1 to 3 with bye
        System.out.println(sb);
        sb.delete(1,3);//deletes 1,3
        System.out.println(sb);
        sb.reverse();//reverses
        System.out.println(sb);
        sb.reverse();//reverses( bring it back to normal)
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(5));
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.ensureCapacity(999999999);/*It is used to increase the capacity of a StringBuffer object.
    The new capacity will be set to either the value we specify or twice the current capacity plus two (i.e. capacity+2), whichever is larger.
    Here, capacity specifies the size of the buffer.*/


    }
}