import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack2 {
  private int maxSize;
  private int sp;
  List<Object> list= new ArrayList<>();

  public static void main(String[] args){
    Stack2 s=new Stack2(5);
    s.push("sss");
    s.pop();
    s.push(44);
    s.pop();
    s.push(2.1);
    s.push(true);
    s.push("1");
    s.push(2);

    for(int i=0;i<3;i++)
    {
      System.out.println(s.pop());
    }

    s.push(5);
    s.push(6);
    s.push(7);
    s.push(8);
    s.push(9);

    s.initiate();


  }

  public Stack(int maxSize){
    this.maxSize=maxSize;
    this.sp=0;
  }

  public void push(Object item){
    try{
      if(this.sp==maxSize){
        throw new RuntimeException("スタックが満杯です。");
      }
      list.add(item);
      this.sp++;
    } catch(Exception e){
      System.out.println("例外が発生しました。");
      System.out.println(e);
    }
  }

  public Object pop(){
    try{
      if(this.sp==0){
        throw new RuntimeException("スタックが空です。");
      }
      this.sp--;
      Object item=list.get(this.sp);
      list.remove(this.sp);
      return item;
    } catch(Exception e){
      System.out.println("例外が発生しました。");
      System.out.println(e);

      return null;
    }
  }

  public void initiate(){
    while(this.sp>0){
      sp--;
      list.remove(sp);
    }
  }
}
