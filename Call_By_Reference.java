class Call_By_Reference{
    int data=50;
    void change(Call_By_Reference op){

        op.data=op.data+100;//changes will be in the instance variable
    }
    public static void main(String args[]){
        Call_By_Reference op=new Call_By_Reference();
        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);
    }
}